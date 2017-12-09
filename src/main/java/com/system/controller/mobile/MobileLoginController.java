package com.system.controller.mobile;

import com.system.po.ViewEmployeeMiPsd;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

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
    //登录跳转(直接访问跳转到PC端登录页)
    @RequestMapping(value = "/mobilelogin", method = {RequestMethod.GET})
    public @ResponseBody
    String mobileLoginUI() throws Exception {
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
    public String mobileLogin(ViewEmployeeMiPsd viewEmployeeMiPsd,ServletRequest request) throws Exception {

        //Shiro实现登录
        UsernamePasswordToken token = new UsernamePasswordToken(viewEmployeeMiPsd.getCode(),
                viewEmployeeMiPsd.getPsd());

        Subject subject = SecurityUtils.getSubject();
        //如果获取不到用户名就是登录失败，但登录失败的话，会直接抛出异常
        try
        {
            subject.login(token);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }


        if (subject.hasRole("admin")) {

            return "'status':'success'";
        } else if (!subject.hasRole("admin")) {
            return "redirect:/normal/showComputerProblems";
        }

        return "/login";
    }
}
