package com.system.controller;

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
import org.springframework.transaction.annotation.Transactional;
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
 * 类名称：AdminController
 * 类描述：PC端管理员请求拦截器
 * 创建人：lxk
 * 创建时间：2017-12-3 14:01:53
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Controller
@RequestMapping("/admin")
public class AdminController {


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
    @Resource(name = "computerProblemsTypeServiceImpl")
    private ComputerProblemsTypeService computerProblemsTypeService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "materialApplicationTypeServiceImpl")
    private MaterialApplicationTypeService materialApplicationTypeService;

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
    public String showComputerProblems(Model model, Integer page) throws Exception {

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

        model.addAttribute("computerProblemsList", list);
        model.addAttribute("pagingVO", pagingVO);

        return "admin/showComputerProblems";

    }

    //添加电脑故障
    @RequestMapping(value = "/addComputerProblems", method = {RequestMethod.GET})
    public String addComputerProblemsUI(Model model) throws Exception {

        return "admin/addComputerProblems";
    }

    // 添加电脑故障处理
    @RequestMapping(value = "/addComputerProblems", method = {RequestMethod.POST})
    @Transactional
    public String addComputerProblemsCustom(ComputerProblemsCustom computerProblemsCustom, Model model,HttpServletRequest request,UploadedImageFile file) throws Exception {

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

        //设置问题所属部门编码
        computerProblemsCustom.setDepartcode(viewEmployeeMiPsd.getDeptCode());

        //设置问题所属人员ID
        computerProblemsCustom.setUserid(viewEmployeeMiPsd.getCode());

        //保存该记录相关数据以便产生推送
        try {

            PushMessage preMessage = createPushUtil.CreatePreMessage(computerProblemsCustom.getUserid(),"0","0",
                    "0","11");
            Boolean result = computerProblemsService.saveAndPre(computerProblemsCustom, preMessage);
            if (!result) {
                model.addAttribute("message", "抱歉，故障信息保存失败");
                return "error";
            }
            //向管理组推送消息
            messagePushUtil.GroupPushSingle("admin");
        } catch (Exception e) {
            e.printStackTrace();
            return "error";

        }
        //重定向
        return "redirect:/admin/showComputerProblems";
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
    public String dealComputerProblems(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");


        if (id == null) {
            return "redirect:/admin/showComputerProblems";
        }

        //获取当前故障问题
        ComputerProblemsCustom computerProblemsCustom = computerProblemsService.findById(id);
        if (computerProblemsCustom == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
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
                    return "error";
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(computerProblemsCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return "redirect:editComputerProblems?id=" + computerProblemsCustom.getId();
    }

    // 电脑故障处理完成
    @RequestMapping(value = "/completeComputerProblems")
    public String completeComputerProblems(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");


        if (id == null) {
            return "redirect:/admin/showComputerProblems";
        }

        //获取当前故障问题
        ComputerProblemsCustom computerProblemsCustom = computerProblemsService.findById(id);
        if (computerProblemsCustom == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
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
                    return "error";
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(computerProblemsCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return "redirect:editComputerProblems?id=" + computerProblemsCustom.getId();
    }

    // 查看电脑故障详情
    @RequestMapping(value = "/checkComputerProblems", method = {RequestMethod.GET})
    public String checkComputerProblems(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showComputerProblems";
        }
        ComputerProblems computerProblems = computerProblemsService.findById(id);
        if (computerProblems == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
        }

        model.addAttribute("computerProblems", computerProblems);


        return "admin/checkComputerProblems";
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
    private String searchComputerProblems(String findByDept,String findByName,String findByFlag, Model model,Integer page) throws Exception {

        List<ComputerProblemsCustom> list = null;
        Map<String, Object> map =new HashMap<String, Object>();
        map.put("dept",findByDept);
        map.put("name",findByName);
        int flag = 0;
        try {
            flag = Integer.parseInt(findByFlag);
        } catch (NumberFormatException e) {
            flag = 3;
        }
        map.put("flag",flag);
        try {
            list = computerProblemsService.paginationOfSearchResults(map);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

        model.addAttribute("computerProblemsList", list);

        return "admin/showComputerProblems";
    }

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<物资申购>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // 物资申购显示
    @RequestMapping("/showMaterialApplication")
    public String showMaterialApplication(Model model, Integer page) throws Exception {
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

        model.addAttribute("materialApplicationList", list);
        model.addAttribute("pagingVO", pagingVO);

        return "admin/showMaterialApplication";

    }

    //添加物资申购
    @RequestMapping(value = "/addMaterialApplication", method = {RequestMethod.GET})
    public String addMaterialApplicationUI(Model model) throws Exception {

        return "admin/addMaterialApplication";
    }

    // 添加物资申购
    @RequestMapping(value = "/addMaterialApplication", method = {RequestMethod.POST})
    public String addMaterialApplicationCustom(MaterialApplicationCustom materialApplicationCustom, Model model) throws Exception {

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
        if(materialApplicationCustom.getCreateTime() == null || materialApplicationCustom.getCreateTime().length() == 0)
        {
            materialApplicationCustom.setCreateTime(dateString);
        }

        //设置问题初始化状态
        materialApplicationCustom.setFlag(0);

        //设置问题所属部门
        materialApplicationCustom.setDept(viewEmployeeMiPsd.getDeptName());

        //设置问题所属部门编码
        materialApplicationCustom.setDepartcode(viewEmployeeMiPsd.getDeptCode());

        //设置问题所属人员ID
        materialApplicationCustom.setUserid(viewEmployeeMiPsd.getCode());

        //保存该记录相关数据以便产生推送
        try {
            PushMessage pushMessage = createPushUtil.CreatePreMessage(materialApplicationCustom.getUserid(),"0","1",
                    "0","21");

            Boolean result = materialApplicationService.saveAndPre(materialApplicationCustom, pushMessage);

            if (!result) {
                model.addAttribute("message", "抱歉，故障信息保存失败");
                return "error";
            }
            //向管理组推送消息
            messagePushUtil.GroupPushSingle("admin");
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }


        //重定向
        return "redirect:/admin/showMaterialApplication";
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
    public String dealMaterialApplication(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");


        if (id == null) {
            return "redirect:/admin/showMaterialApplication";
        }

        //获取当前物资申购问题
        MaterialApplicationCustom materialApplicationCustom = materialApplicationService.findById(id);
        if (materialApplicationCustom == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
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
                    return "error";
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(materialApplicationCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "redirect:editMaterialApplication?id=" + materialApplicationCustom.getId();
    }

    // 物资申购处理完成
    @RequestMapping(value = "/completeMaterialApplication")
    public String completeMaterialApplication(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");


        if (id == null) {
            return "redirect:/admin/showMaterialApplication";
        }

        //获取当前物资申购信息
        MaterialApplicationCustom materialApplicationCustom = materialApplicationService.findById(id);
        if (materialApplicationCustom == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
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
                    return "error";
                }
                //向申报人推送消息
                messagePushUtil.SpecifiedPushSingle(materialApplicationCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "redirect:editMaterialApplication?id=" + materialApplicationCustom.getId();
    }

    // 查看物资申购详情
    @RequestMapping(value = "/checkMaterialApplication", method = {RequestMethod.GET})
    public String checkMaterialApplication(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showMaterialApplication";
        }
        MaterialApplication materialApplication = materialApplicationService.findById(id);
        if (materialApplication == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }

        model.addAttribute("materialApplication", materialApplication);


        return "admin/checkMaterialApplication";
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
    private String searchMaterialApplication(String findByDept,String findByName,String findByFlag, Model model) throws Exception {


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

        model.addAttribute("materialApplicationList", listResult);
        return "admin/showMaterialApplication";
    }

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<机房巡检>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // 机房巡检显示
    @RequestMapping("/showEngineRoomInspection")
    public String showEngineRoomInspection(Model model, Integer page) throws Exception {
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

        model.addAttribute("engineRoomInspectionList", list);
        model.addAttribute("pagingVO", pagingVO);

        return "admin/showEngineRoomInspection";

    }

    //添加机房巡检
    @RequestMapping(value = "/addEngineRoomInspection", method = {RequestMethod.GET})
    public String addEngineRoomInspectionUI(Model model) throws Exception {

        return "admin/addEngineRoomInspection";
    }

    // 添加机房巡检
    @RequestMapping(value = "/addEngineRoomInspection", method = {RequestMethod.POST})
    public String addEngineRoomInspectionCustom(EngineRoomInspectionCustom engineRoomInspectionCustom, Model model) throws Exception {

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
                model.addAttribute("message", "抱歉，机房巡检信息保存失败");
                return "error";
            }
            //向管理组推送消息
            messagePushUtil.GroupPushSingle("admin");
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }


        //重定向
        return "redirect:/admin/showEngineRoomInspection";
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
    public String checkEngineRoomInspection(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showEngineRoomInspection";
        }
        EngineRoomInspection engineRoomInspection = engineRoomInspectionService.findById(id);
        if (engineRoomInspection == null) {
            throw new CustomException("抱歉，未找到该机房巡检相关信息");
        }

        model.addAttribute("engineRoomInspection", engineRoomInspection);


        return "admin/checkEngineRoomInspection";
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
    private String searchEngineRoomInspection(String findByExaminer, Model model) throws Exception {


        List<EngineRoomInspectionCustom> listByExaminer = new ArrayList<EngineRoomInspectionCustom>();
        List<EngineRoomInspectionCustom> listResult = new ArrayList<EngineRoomInspectionCustom>();

        if(!findByExaminer.equals(""))
        {
            listByExaminer = engineRoomInspectionService.findByExaminer(findByExaminer);
        }

        listResult.addAll(listByExaminer);

        model.addAttribute("engineRoomInspectionList", listResult);
        return "admin/showEngineRoomInspection";
    }

    //返回操作人相关基本信息JSON
    @RequestMapping(value = "/getApplicantInfo")
    @ResponseBody
    private Map<String, Object> getApplicantInfo() throws Exception {


        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = null;
        Map<String, Object> map =new HashMap<String, Object>();
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
        map.put("appliName",viewEmployeeMiPsd.getName());
        map.put("appliDept",viewEmployeeMiPsd.getDeptName());
        map.put("appliDeptCode",viewEmployeeMiPsd.getDeptCode());
        return map;

    }

    //返回电脑故障类型列表JSON
    @RequestMapping(value = "/getProblemsTypeList")
    @ResponseBody
    private Map<String, Object> getProblemsTypeList() throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        List<ComputerProblemsType> computerProblemsTypeList = new ArrayList<>();
        try {
            computerProblemsTypeList = computerProblemsTypeService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("computerProblemsTypeList",computerProblemsTypeList);
        return map;
    }

    //返回物资申购类型列表JSON
    @RequestMapping(value = "/getMaterialTypeList")
    @ResponseBody
    private Map<String, Object> getMaterialTypeList() throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();
        List<MaterialApplicationType> materialApplicationTypeList = new ArrayList<>();
        try {
            materialApplicationTypeList = materialApplicationTypeService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("materialApplicationTypeList",materialApplicationTypeList);
        return map;

    }

}
