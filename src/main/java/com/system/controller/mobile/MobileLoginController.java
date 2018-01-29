package com.system.controller.mobile;

import com.system.controller.AdminController;
import com.system.po.PushId;
import com.system.po.Role;
import com.system.po.ViewEmployeeMiPsd;
import com.system.service.ComputerProblemsService;
import com.system.service.PushIdService;
import com.system.service.RoleService;
import com.system.service.ViewEmployeeMiPsdService;
import com.system.service.impl.PushIdServiceImpl;
import com.system.util.CustomerContextHolder;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MobileLoginController
 * 类描述：Mobile端登录请求拦截器
 * 创建人：lxk
 * 创建时间：2017-12-08 8:47
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Controller
public class MobileLoginController {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "roleServiceImpl")
    private RoleService roleService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "pushIdServiceImpl")
    private PushIdService pushIdService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "viewEmployeeMiPsdServiceImpl")
    private ViewEmployeeMiPsdService viewEmployeeMiPsdService;

    //登录跳转(直接访问跳转到PC端登录页)
    @RequestMapping(value = "/mobilelogin", method = {RequestMethod.GET})
    public String mobileLoginUI() throws Exception {
        try{
            return "redirect:/login";
        }catch (Exception e)
        {
            e.printStackTrace();
            return "redirect:/login";
        }

    }

    //登录表单处理
    @RequestMapping(value = "/mobilelogin", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> mobileLogin(ViewEmployeeMiPsd viewEmployeeMiPsd, ServletRequest request, String userclientid) throws Exception {

        //Shiro实现登录
        Map<String, Object> map =new HashMap<String, Object>();
        UsernamePasswordToken token = new UsernamePasswordToken(viewEmployeeMiPsd.getCode(),
                viewEmployeeMiPsd.getPsd());

        Subject subject = SecurityUtils.getSubject();
        //如果获取不到用户名就是登录失败，但登录失败的话，会直接抛出异常
        try
        {
            subject.login(token);
        }catch (Exception e){
            e.printStackTrace();

            map.put("success", "false");
            map.put("msg", "用户名或密码错误");
            return map;
        }

        try{

            //获取该登录用户设备ID,新登录用户保存 工号——PushID 对应信息，已登录用户更新 工号——PushID 对应信息
            PushId pushId = pushIdService.findByCode((String) subject.getPrincipal());
            if(pushId == null){
                pushId = new PushId();
                pushId.setClientId(userclientid);
                pushId.setCode((String) subject.getPrincipal());
                pushIdService.save(pushId);
            }else{
                pushId.setClientId(userclientid);
                pushIdService.updateByCode(pushId.getCode(),pushId);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //返回角色权限
        map.put("role",this.getRoles(subject));

        map.put("success", "true");

        return map;
    }

    //获取角色集合
    public String getRoles(Subject subject) throws Exception{
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);
        Role role = null;
        //获取角色对象
        try {
            role = roleService.findByRoleId(viewEmployeeMiPsd.getCode()).get(0);
        } catch (Exception e) {
            e.printStackTrace();
            //获取日志记录器，这个记录器将负责控制日志信息
            Logger logger = Logger.getLogger(AdminController.class.getName());
            logger.error("角色获取失败：可能是本地库连接失败",e);
            return "normal";
        }

        return role.getRolename();
    }

    // 获取当前用户
    public ViewEmployeeMiPsd subjectToViewEmployeeMiPsd(Subject subject) throws Exception{
        ViewEmployeeMiPsd viewEmployeeMiPsd = null;
        try {
            //切换数据源至SQLServer
            CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MSSQL);
            viewEmployeeMiPsd = viewEmployeeMiPsdService.findByCode((String) subject.getPrincipal());
            //切换数据源至MySQL
            CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        } catch (Exception e) {
            //切换数据源至MySQL(启用备用库)
            try{
                CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
                viewEmployeeMiPsd = viewEmployeeMiPsdService.findByCode((String) subject.getPrincipal());

            }catch (Exception eSwitch){
                eSwitch.printStackTrace();
                e.printStackTrace();
                //获取日志记录器，这个记录器将负责控制日志信息
                Logger logger = Logger.getLogger(AdminController.class.getName());
                logger.error("用户获取失败：可能是本地库连接失败",e);
            }
            e.printStackTrace();
            //获取日志记录器，这个记录器将负责控制日志信息
            Logger logger = Logger.getLogger(AdminController.class.getName());
            logger.error("用户获取失败：可能是HIS库连接失败，将切换到备用库",e);
        }
        return viewEmployeeMiPsd;
    }
}
