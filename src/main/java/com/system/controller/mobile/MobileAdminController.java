package com.system.controller.mobile;

import com.system.exception.CustomException;
import com.system.po.*;
import com.system.util.push.CreatePushUtil;
import com.system.service.*;
import com.system.util.CustomerContextHolder;
import com.system.util.push.MessagePushUtil;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MobileAdminController
 * 类描述：Mobile端管理员请求拦截器
 * 创建人：lxk
 * 创建时间：2017-12-08 8:46
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Controller
@RequestMapping("/mobileadmin")
public class MobileAdminController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "computerProblemsServiceImpl")
    private ComputerProblemsService computerProblemsService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "materialApplicationServiceImpl")
    private MaterialApplicationService materialApplicationService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "engineRoomInspectionServiceImpl")
    private EngineRoomInspectionService engineRoomInspectionService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "viewEmployeeMiPsdServiceImpl")
    private ViewEmployeeMiPsdService viewEmployeeMiPsdService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "pushMessageServiceImpl")
    private PushMessageService pushMessageService;

    @Autowired
    private CreatePushUtil createPushUtil;

    @Autowired
    private MessagePushUtil messagePushUtil;




    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<电脑故障操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    // 电脑故障显示
    @RequestMapping("/showComputerProblems")
    @ResponseBody
    public Map<String, Object> showComputerProblems(Model model, Integer page) throws Exception {


        Subject subject = SecurityUtils.getSubject();
        Map<String, Object> map =new HashMap<String, Object>();
        if (subject.hasRole("admin")) {
            List<ComputerProblemsCustom> list = null;
            //页码对象
            PagingVO pagingVO = new PagingVO();
            //设置总页数
            pagingVO.setTotalCount(computerProblemsService.getCountComputerProblems());
            if (page == null || page == 0) {
                pagingVO.setToPageNo(1);
                list = computerProblemsService.findByPaging(1);
            } else {
                pagingVO.setToPageNo(page);
                list = computerProblemsService.findByPaging(page);
            }

            map.put("computerProblemsList", list);
            map.put("pagingVO", pagingVO);

            return map;
        }else{
            //获取当前操作用户对象
            //(普通用户只能看到本科室提交的故障报告)
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
                }
                e.printStackTrace();
            }
            String currentDept = viewEmployeeMiPsd.getDeptCode();
            List<ComputerProblemsCustom> listByDept = new ArrayList<>();
            listByDept = computerProblemsService.findByDept(currentDept);
            map.put("computerProblemsList", listByDept);
            return map;
        }


    }

    //添加电脑故障
    @RequestMapping(value = "/addComputerProblems", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> addComputerProblemsUI(Model model) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        map.put("success", "false");
        map.put("msg", "路径错误");

        return map;
    }

    // 添加电脑故障处理
    @RequestMapping(value = "/addComputerProblems", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addComputerProblemsCustom(ComputerProblemsCustom computerProblemsCustom, Model model,HttpServletRequest request,UploadedImageFile file) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }



        //设置问题初始化时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);

        //无初始时间时设置初始时间
        if(computerProblemsCustom.getCreateTime() == null || computerProblemsCustom.getCreateTime().length() == 0)
        {
            computerProblemsCustom.setCreateTime(dateString);
        }

        //文件上传至服务器并保存图片路径
        if(!file.getPhoto().isEmpty())
        {
            String name = RandomStringUtils.randomAlphanumeric(10);
            String newFileName = name + ".jpg";
            File newFile = new File(request.getServletContext().getRealPath("/upload"), newFileName);
            newFile.getParentFile().mkdirs();
            file.getPhoto().transferTo(newFile);
            //保存路径
            computerProblemsCustom.setImg(newFileName);
        }

        //设置问题初始化状态
        computerProblemsCustom.setFlag(0);

        //设置问题所属部门
        computerProblemsCustom.setDept(viewEmployeeMiPsd.getDeptName());

        //设置问题所属部门编码
        computerProblemsCustom.setDepartcode(viewEmployeeMiPsd.getDeptCode());

        //设置问题所属人员ID
        computerProblemsCustom.setUserid(viewEmployeeMiPsd.getCode());

        try {
            PushMessage preMessage = createPushUtil.CreatePreMessage(computerProblemsCustom.getUserid(),"0","0",
                    "0","11");
            Boolean result = computerProblemsService.saveAndPre(computerProblemsCustom, preMessage);

            if (!result) {
                map.put("success", "false");
                map.put("msg", "抱歉，故障信息保存失败");
                return map;
            }

            //向管理组推送消息
            messagePushUtil.GroupPushSingle("admin");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "false");
            map.put("msg", "抱歉，故障信息保存失败");
            return map;
        }
        map.put("success", "true");
        map.put("msg", "提交成功");
        return map;
    }

    // 修改电脑故障页面显示
    @RequestMapping(value = "/editComputerProblems", method = {RequestMethod.GET})
    public String editComputerProblemsUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showComputerProblems";
        }
        ComputerProblems computerProblems = computerProblemsService.findById(id);
        if (computerProblems == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
        }

        model.addAttribute("computerProblems", computerProblems);


        return "admin/editComputerProblems";
    }

    // 修改电脑故障页面处理
    @RequestMapping(value = "/editComputerProblems", method = {RequestMethod.POST})
    public String editComputerProblems(ComputerProblemsCustom computerProblemsCustom) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }

        computerProblemsCustom.setLeader(viewEmployeeMiPsd.getCode());

        computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);

        //重定向
        return "redirect:/admin/showComputerProblems";
    }

    // 开始处理电脑故障
    @RequestMapping(value = "/dealComputerProblems")
    @ResponseBody
    public Map<String, Object>  dealComputerProblems(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        Map<String, Object> map =new HashMap<String, Object>();

        if (id == null) {
            map.put("success", "false");
            map.put("msg", "未找到该故障相关信息");
            return map;
        }

        //获取当前故障问题
        ComputerProblemsCustom computerProblemsCustom = computerProblemsService.findById(id);
        if (computerProblemsCustom == null) {
            map.put("success", "false");
            map.put("msg", "未找到该故障相关信息");
            return map;
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }
        if(computerProblemsCustom.getFlag() == 0){
            //更新该故障问题数据
            computerProblemsCustom.setFlag(1);
            computerProblemsCustom.setLeader(viewEmployeeMiPsd.getCode());
            computerProblemsCustom.setReback(feedback);
            computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);
            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.CreatePreMessage(computerProblemsCustom.getUserid(),"0","0",
                        "2","12");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    map.put("success", "false");
                    map.put("msg", "操作异常");
                    return map;
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(computerProblemsCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
            map.put("success", "true");
            map.put("msg", "操作成功，处理中");
            return map;
        }else if(computerProblemsCustom.getFlag() == 1){
            map.put("success", "false");
            map.put("msg", "请勿重复处理");
            return map;
        }else if(computerProblemsCustom.getFlag() == 2){
            map.put("success", "false");
            map.put("msg", "已解决，操作失败");
            return map;
        }

        map.put("success", "false");
        map.put("msg", "操作异常");
        return map;
    }

    // 电脑故障处理完成
    @RequestMapping(value = "/completeComputerProblems")
    @ResponseBody
    public Map<String, Object> completeComputerProblems(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        Map<String, Object> map =new HashMap<String, Object>();

        if (id == null) {
            map.put("success", "false");
            map.put("msg", "未找到该故障相关信息");
            return map;
        }

        //获取当前故障问题
        ComputerProblemsCustom computerProblemsCustom = computerProblemsService.findById(id);
        if (computerProblemsCustom == null) {
            map.put("success", "false");
            map.put("msg", "未找到该故障相关信息");
            return map;
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }
        if(computerProblemsCustom.getFlag() == 1){
            //更新该故障问题数据
            computerProblemsCustom.setFlag(2);
            computerProblemsCustom.setLeader(viewEmployeeMiPsd.getCode());
            computerProblemsCustom.setReback(feedback);
            computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);
            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.CreatePreMessage(computerProblemsCustom.getUserid(),"0","0",
                        "2","13");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    map.put("success", "false");
                    map.put("msg", "操作异常");
                    return map;
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(computerProblemsCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
            map.put("success", "true");
            map.put("msg", "操作成功，故障处理完成");
            return map;
        }else if(computerProblemsCustom.getFlag() == 2){
            map.put("success", "false");
            map.put("msg", "请勿重复处理");
            return map;
        }else if(computerProblemsCustom.getFlag() == 0){
            //更新该故障问题数据
            computerProblemsCustom.setFlag(2);
            computerProblemsCustom.setLeader(viewEmployeeMiPsd.getCode());
            computerProblemsCustom.setReback(feedback);
            computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);
            map.put("success", "true");
            map.put("msg", "操作成功，故障处理完成");
            return map;
        }

        map.put("success", "false");
        map.put("msg", "操作异常");
        return map;
    }

    // 查看电脑故障详情
    @RequestMapping(value = "/checkComputerProblems", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> checkComputerProblems(Integer id, Model model) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        if (id == null) {
            map.put("success", "false");
            map.put("msg", "数据异常");
            return map;
        }
        ComputerProblems computerProblems = computerProblemsService.findById(id);
        if (computerProblems == null) {
            map.put("success", "false");
            map.put("msg", "不存在的数据");
            return map;
        }

        map.put("success", "true");
        map.put("msg", "success");
        map.put("computerProblems", computerProblems);


        return map;
    }

    // 查看电脑故障详情
    @RequestMapping(value = "/checkComputerProblems", method = {RequestMethod.POST})
    public String checkComputerProblems(ComputerProblemsCustom computerProblemsCustom) throws Exception {

        computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);

        //重定向
        return "redirect:/admin/showComputerProblems";
    }

    //搜索电脑故障
    @RequestMapping(value = "/searchComputerProblems")
    @ResponseBody
    public Map<String, Object> searchComputerProblems(String findByDept,String findByName,String findByFlag) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();
        List<ComputerProblemsCustom> listByDept = new ArrayList<ComputerProblemsCustom>();
        List<ComputerProblemsCustom> listByName = new ArrayList<ComputerProblemsCustom>();
        List<ComputerProblemsCustom> listByFlag = new ArrayList<ComputerProblemsCustom>();
        List<ComputerProblemsCustom> listResult = new ArrayList<ComputerProblemsCustom>();

        if(!findByDept.equals(""))
        {
            listByDept = computerProblemsService.findByDept(findByDept);
        }

        if(!findByName.equals(""))
        {
            listByName = computerProblemsService.findByName(findByName);
        }

        if(!findByFlag.equals(""))
        {
            try{
                Integer flag = Integer.parseInt(findByFlag);
                listByFlag = computerProblemsService.findByFlag(flag);

            }catch(Exception e){
                e.printStackTrace();
            }

        }



        //合并去重
        listResult.addAll(listByDept);
        listResult.removeAll(listByFlag);
        listResult.addAll(listByFlag);
        listResult.removeAll(listByName);
        listResult.addAll(listByName);

        if(listResult.size() <= 50){
            map.put("success", "true");
            map.put("computerProblemsList", listResult);
        }else{
            map.put("success", "false");
            map.put("msg", "结果大于50条，请精确查找");
        }
        return map;
    }

    //搜索当前用户相关电脑故障
    @RequestMapping(value = "/searchMyComputerProblems")
    @ResponseBody
    public Map<String, Object> searchMyComputerProblems() throws Exception {

        Subject subject = SecurityUtils.getSubject();
        String code = (String) subject.getPrincipal();

        Map<String, Object> map =new HashMap<String, Object>();
        List<ComputerProblemsCustom> listByUserID = new ArrayList<ComputerProblemsCustom>();
        List<ComputerProblemsCustom> listByLeader = new ArrayList<ComputerProblemsCustom>();
        List<ComputerProblemsCustom> listResult = new ArrayList<ComputerProblemsCustom>();

        if(!code.equals(""))
        {
            listByUserID = computerProblemsService.findByUserID(code);
            listByLeader = computerProblemsService.findByLeader(code);
        }



        //合并去重
        listResult.addAll(listByUserID);
        listResult.removeAll(listByLeader);
        listResult.addAll(listByLeader);

        map.put("success", "true");
        map.put("computerProblemsList", listResult);
        return map;
    }

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<物资申购>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // 物资申购显示
    @RequestMapping("/showMaterialApplication")
    @ResponseBody
    public Map<String, Object>  showMaterialApplication(Model model, Integer page) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        Map<String, Object> map =new HashMap<String, Object>();
        if (subject.hasRole("admin")) {
            List<MaterialApplicationCustom> list = null;
            //页码对象
            PagingVO pagingVO = new PagingVO();
            //设置总页数
            pagingVO.setTotalCount(materialApplicationService.getCountMaterialApplication());
            if (page == null || page == 0) {
                pagingVO.setToPageNo(1);
                list = materialApplicationService.findByPaging(1);
            } else {
                pagingVO.setToPageNo(page);
                list = materialApplicationService.findByPaging(page);
            }

            map.put("materialApplicationList", list);
            map.put("pagingVO", pagingVO);

            return map;
        }else{
            //获取当前操作用户对象
            //(普通用户只能看到本科室提交的故障报告)
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
                }
                e.printStackTrace();
            }
            String currentDept = viewEmployeeMiPsd.getDeptCode();
            List<MaterialApplicationCustom> listByDept = new ArrayList<>();
            listByDept = materialApplicationService.findByDept(currentDept);
            map.put("materialApplicationList", listByDept);
            return map;
        }

    }

    //添加物资申购
    @RequestMapping(value = "/addMaterialApplication", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> addMaterialApplicationUI(Model model) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        map.put("success", "false");
        map.put("msg", "路径错误");

        return map;
    }

    // 添加物资申购
    @RequestMapping(value = "/addMaterialApplication", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addMaterialApplicationCustom(MaterialApplicationCustom materialApplicationCustom, Model model) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }



        //设置申购初始化时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);

        //无初始时间时设置初始时间
        if(materialApplicationCustom.getCreateTime() == null || materialApplicationCustom.getCreateTime().length() == 0)
        {
            materialApplicationCustom.setCreateTime(dateString);
        }

        //设置申购初始化状态
        materialApplicationCustom.setFlag(0);

        //设置申购所属部门
        materialApplicationCustom.setDept(viewEmployeeMiPsd.getDeptName());

        //设置申购所属部门编码
        materialApplicationCustom.setDepartcode(viewEmployeeMiPsd.getDeptCode());

        //设置申购所属人员ID
        materialApplicationCustom.setUserid(viewEmployeeMiPsd.getCode());



        //保存该记录相关数据以便产生推送
        try {
            PushMessage pushMessage = createPushUtil.CreatePreMessage(materialApplicationCustom.getUserid(),"0","1",
                    "0","21");

            Boolean result = materialApplicationService.saveAndPre(materialApplicationCustom, pushMessage);

            if (!result) {
                map.put("success", "false");
                map.put("msg", "抱歉，物资申购保存失败");
                return map;
            }

            //向管理组推送消息
            messagePushUtil.GroupPushSingle("admin");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "false");
            map.put("msg", "抱歉，物资申购保存失败");
            return map;
        }

        //重定向
        map.put("success", "true");
        map.put("msg", "提交成功");
        return map;
    }

    // 修改物资申购页面显示
    @RequestMapping(value = "/editMaterialApplication", method = {RequestMethod.GET})
    public String editMaterialApplicationUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showMaterialApplication";
        }
        MaterialApplication materialApplication = materialApplicationService.findById(id);
        if (materialApplication == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }

        model.addAttribute("materialApplication", materialApplication);


        return "admin/editMaterialApplication";
    }

    // 修改物资申购页面处理
    @RequestMapping(value = "/editMaterialApplication", method = {RequestMethod.POST})
    public String editMaterialApplication(MaterialApplicationCustom materialApplicationCustom) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }


        materialApplicationCustom.setLeader(viewEmployeeMiPsd.getCode());

        materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);

        //重定向
        return "redirect:/admin/showMaterialApplication";
    }

    // 开始处理物资申购
    @RequestMapping(value = "/dealMaterialApplication")
    @ResponseBody
    public Map<String, Object> dealMaterialApplication(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        Map<String, Object> map =new HashMap<String, Object>();

        if (id == null) {
            map.put("success", "false");
            map.put("msg", "未找到该申购相关信息");
            return map;
        }

        //获取当前物资申购问题
        MaterialApplicationCustom materialApplicationCustom = materialApplicationService.findById(id);
        if (materialApplicationCustom == null) {
            map.put("success", "false");
            map.put("msg", "未找到该申购相关信息");
            return map;
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }
        if(materialApplicationCustom.getFlag() == 0){
            //更新该物资申购问题数据
            materialApplicationCustom.setFlag(1);
            materialApplicationCustom.setLeader(viewEmployeeMiPsd.getCode());
            materialApplicationCustom.setReback(feedback);
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.CreatePreMessage(materialApplicationCustom.getUserid(),"0","1",
                        "2","22");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    map.put("success", "false");
                    map.put("msg", "操作异常");
                    return map;
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(materialApplicationCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
            map.put("success", "true");
            map.put("msg", "操作成功，处理中");
            return map;
        }else if(materialApplicationCustom.getFlag() == 1){
            map.put("success", "false");
            map.put("msg", "请勿重复处理");
            return map;
        }else if(materialApplicationCustom.getFlag() == 2){
            map.put("success", "false");
            map.put("msg", "已解决，操作失败");
            return map;
        }

        map.put("success", "false");
        map.put("msg", "操作异常");
        return map;
    }

    // 物资申购处理完成
    @RequestMapping(value = "/completeMaterialApplication")
    @ResponseBody
    public Map<String, Object> completeMaterialApplication(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        Map<String, Object> map =new HashMap<String, Object>();

        if (id == null) {
            map.put("success", "false");
            map.put("msg", "未找到该申购相关信息");
            return map;
        }

        //获取当前物资申购信息
        MaterialApplicationCustom materialApplicationCustom = materialApplicationService.findById(id);
        if (materialApplicationCustom == null) {
            map.put("success", "false");
            map.put("msg", "未找到该申购相关信息");
            return map;
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }
        if(materialApplicationCustom.getFlag() == 1){
            //更新该物资申购问题数据
            materialApplicationCustom.setFlag(2);
            materialApplicationCustom.setLeader(viewEmployeeMiPsd.getCode());
            materialApplicationCustom.setReback(feedback);
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.CreatePreMessage(materialApplicationCustom.getUserid(),"0","1",
                        "2","23");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    map.put("success", "false");
                    map.put("msg", "操作异常");
                    return map;
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(materialApplicationCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
            map.put("success", "true");
            map.put("msg", "操作成功，申购处理完成");
            return map;
        }else if(materialApplicationCustom.getFlag() == 2){
            map.put("success", "false");
            map.put("msg", "请勿重复处理");
            return map;
        }else if(materialApplicationCustom.getFlag() == 0){
            //更新该故障问题数据
            materialApplicationCustom.setFlag(2);
            materialApplicationCustom.setLeader(viewEmployeeMiPsd.getCode());
            materialApplicationCustom.setReback(feedback);
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
            map.put("success", "true");
            map.put("msg", "操作成功，申购处理完成");
            return map;
        }

        map.put("success", "false");
        map.put("msg", "操作异常");
        return map;
    }

    // 查看物资申购详情
    @RequestMapping(value = "/checkMaterialApplication", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> checkMaterialApplication(Integer id, Model model) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        if (id == null) {
            map.put("success", "false");
            map.put("msg", "数据异常");
            return map;
        }
        MaterialApplication materialApplication = materialApplicationService.findById(id);
        if (materialApplication == null) {
            map.put("success", "false");
            map.put("msg", "不存在的数据");
            return map;
        }

        map.put("success", "true");
        map.put("msg", "success");
        map.put("materialApplication", materialApplication);


        return map;
    }

    // 查看物资申购详情
    @RequestMapping(value = "/checkMaterialApplication", method = {RequestMethod.POST})
    public String checkMaterialApplication(MaterialApplicationCustom materialApplicationCustom) throws Exception {

        materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);

        //重定向
        return "redirect:/admin/showMaterialApplication";
    }

    //搜索物资申购
    @RequestMapping(value = "/searchMaterialApplication")
    @ResponseBody
    public Map<String, Object> searchMaterialApplication(String findByDept,String findByName,String findByFlag, Model model) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();
        List<MaterialApplicationCustom> listByDept = new ArrayList<MaterialApplicationCustom>();
        List<MaterialApplicationCustom> listByName = new ArrayList<MaterialApplicationCustom>();
        List<MaterialApplicationCustom> listByFlag = new ArrayList<MaterialApplicationCustom>();
        List<MaterialApplicationCustom> listResult = new ArrayList<MaterialApplicationCustom>();

        if(!findByDept.equals(""))
        {
            listByDept = materialApplicationService.findByDept(findByDept);
        }

        if(!findByName.equals(""))
        {
            listByName = materialApplicationService.findByName(findByName);
        }

        if(!findByFlag.equals(""))
        {
            Integer flag = Integer.parseInt(findByFlag);
            listByFlag = materialApplicationService.findByFlag(flag);
        }



        //合并去重
        listResult.addAll(listByDept);
        listResult.removeAll(listByFlag);
        listResult.addAll(listByFlag);
        listResult.removeAll(listByName);
        listResult.addAll(listByName);

        if(listResult.size() <= 50){
            map.put("success", "true");
            map.put("materialApplicationList", listResult);
        }else{
            map.put("success", "false");
            map.put("msg", "结果过多，请精确查找");
        }
        return map;
    }

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<机房巡检>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // 机房巡检显示
    @RequestMapping("/showEngineRoomInspection")
    @ResponseBody
    public Map<String, Object> showEngineRoomInspection(Model model, Integer page) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        List<EngineRoomInspectionCustom> list = null;
        //页码对象
        PagingVO pagingVO = new PagingVO();
        //设置总页数
        pagingVO.setTotalCount(engineRoomInspectionService.getCountEngineRoomInspection());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            list = engineRoomInspectionService.findByPaging(1);
        } else {
            pagingVO.setToPageNo(page);
            list = engineRoomInspectionService.findByPaging(page);
        }


        map.put("engineRoomInspectionList", list);
        map.put("pagingVO", pagingVO);

        return map;

    }

    //添加机房巡检
    @RequestMapping(value = "/addEngineRoomInspection", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> addEngineRoomInspectionUI(Model model) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();
        map.put("success", "false");
        map.put("msg", "路径错误");

        return map;
    }

    // 添加机房巡检
    @RequestMapping(value = "/addEngineRoomInspection", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addEngineRoomInspectionCustom(EngineRoomInspectionCustom engineRoomInspectionCustom, Model model) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
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
            }
            e.printStackTrace();
        }



        //设置问题初始化时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);

        //无初始时间时设置初始时间
        if(engineRoomInspectionCustom.getCreateTime() == null || engineRoomInspectionCustom.getCreateTime().length() == 0)
        {
            engineRoomInspectionCustom.setCreateTime(dateString);
        }

        //设置问题所属人员ID
        engineRoomInspectionCustom.setUserid(viewEmployeeMiPsd.getCode());



        //保存该记录相关数据以便产生推送
        try {
            PushMessage pushMessage = createPushUtil.CreatePreMessage(engineRoomInspectionCustom.getUserid(),"0","2",
                    "0","31");

            Boolean result = engineRoomInspectionService.saveAndPre(engineRoomInspectionCustom, pushMessage);

            if (!result) {
                map.put("success", "false");
                map.put("msg", "抱歉，巡检信息保存失败");
                return map;
            }

            //向管理组推送消息
            messagePushUtil.GroupPushSingle("admin");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "false");
            map.put("msg", "抱歉，巡检信息保存失败");
            return map;
        }

        //重定向
        map.put("success", "true");
        map.put("msg", "提交成功");
        return map;
    }

/*    // 修改机房巡检页面显示
    @RequestMapping(value = "/editEngineRoomInspection", method = {RequestMethod.GET})
    public String editEngineRoomInspectionUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showEngineRoomInspection";
        }
        EngineRoomInspection engineRoomInspection = engineRoomInspectionService.findById(id);
        if (engineRoomInspection == null) {
            throw new CustomException("抱歉，未找到该机房巡检相关信息");
        }

        model.addAttribute("engineRoomInspection", engineRoomInspection);


        return "admin/editEngineRoomInspection";
    }*/

    // 修改机房巡检页面处理
/*    @RequestMapping(value = "/editEngineRoomInspection", method = {RequestMethod.POST})
    public String editEngineRoomInspection(EngineRoomInspectionCustom engineRoomInspectionCustom) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());

        engineRoomInspectionService.updataById(engineRoomInspectionCustom.getId(), engineRoomInspectionCustom);

        //重定向
        return "redirect:/admin/showEngineRoomInspection";
    }*/

/*    // 开始处理机房巡检
    @RequestMapping(value = "/dealEngineRoomInspection")
    public String dealEngineRoomInspection(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("ycyy");


        if (id == null) {
            return "redirect:/admin/showEngineRoomInspection";
        }

        //获取当前机房巡检问题
        EngineRoomInspectionCustom engineRoomInspectionCustom = engineRoomInspectionService.findById(id);
        if (engineRoomInspectionCustom == null) {
            throw new CustomException("抱歉，未找到该机房巡检相关信息");
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());
        engineRoomInspectionCustom.setYcyy(feedback);
        engineRoomInspectionService.updataById(engineRoomInspectionCustom.getId(), engineRoomInspectionCustom);

        return "redirect:editEngineRoomInspection?id=" + engineRoomInspectionCustom.getId();
    }*/

/*    // 机房巡检处理完成
    @RequestMapping(value = "/completeEngineRoomInspection")
    public String completeEngineRoomInspection(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");


        if (id == null) {
            return "redirect:/admin/showEngineRoomInspection";
        }

        //获取当前机房巡检信息
        EngineRoomInspectionCustom engineRoomInspectionCustom = engineRoomInspectionService.findById(id);
        if (engineRoomInspectionCustom == null) {
            throw new CustomException("抱歉，未找到该机房巡检相关信息");
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());
        engineRoomInspectionCustom.setYcyy(feedback);
        engineRoomInspectionService.updataById(engineRoomInspectionCustom.getId(), engineRoomInspectionCustom);


        return "redirect:editEngineRoomInspection?id=" + engineRoomInspectionCustom.getId();
    }*/

    // 查看机房巡检详情
    @RequestMapping(value = "/checkEngineRoomInspection", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> checkEngineRoomInspection(Integer id, Model model) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        if (id == null) {
            map.put("success", "false");
            map.put("msg", "数据异常");
            return map;
        }
        EngineRoomInspection engineRoomInspection = engineRoomInspectionService.findById(id);
        if (engineRoomInspection == null) {
            map.put("success", "false");
            map.put("msg", "未找到该机房巡检相关信息");
            return map;
        }

        map.put("success", "true");
        map.put("msg", "success");
        map.put("engineRoomInspection", engineRoomInspection);


        return map;
    }

    // 查看机房巡检详情
    @RequestMapping(value = "/checkEngineRoomInspection", method = {RequestMethod.POST})
    public String checkEngineRoomInspection(EngineRoomInspectionCustom engineRoomInspectionCustom) throws Exception {

        engineRoomInspectionService.updataById(engineRoomInspectionCustom.getId(), engineRoomInspectionCustom);

        //重定向
        return "redirect:/admin/showEngineRoomInspection";
    }

    //搜索机房巡检
    @RequestMapping(value = "/searchEngineRoomInspection")
    @ResponseBody
    public Map<String, Object> searchEngineRoomInspection(String findByExaminer, Model model) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();
        List<EngineRoomInspectionCustom> listByExaminer = new ArrayList<EngineRoomInspectionCustom>();
        List<EngineRoomInspectionCustom> listResult = new ArrayList<EngineRoomInspectionCustom>();

        if(!findByExaminer.equals(""))
        {
            listByExaminer = engineRoomInspectionService.findByExaminer(findByExaminer);
        }

        listResult.addAll(listByExaminer);

        if(listResult.size() <= 50){
            map.put("success", "true");
            map.put("engineRoomInspectionList", listResult);
        }else{
            map.put("success", "false");
            map.put("msg", "结果过多，请精确查找");
        }
        return map;
    }

}
