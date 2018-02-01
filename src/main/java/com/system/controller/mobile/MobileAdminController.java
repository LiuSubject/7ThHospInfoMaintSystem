package com.system.controller.mobile;

import com.system.controller.AdminController;
import com.system.operate.ComputerProblemsList;
import com.system.po.*;
import com.system.util.push.CreatePushUtil;
import com.system.service.*;
import com.system.util.CustomerContextHolder;
import com.system.util.push.MessagePushUtil;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
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
    @Resource(name = "roleServiceImpl")
    private RoleService roleService;

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

    // 电脑故障显示(普通用户只能看到本科室提交的故障报告)
    @RequestMapping("/showComputerProblems")
    @ResponseBody
    public Map<String, Object> showComputerProblems(Model model, Integer page) throws Exception {

        //当前操作对象
        Subject subject = SecurityUtils.getSubject();
        //页码对象初始化
        PagingVO pagingVO = new PagingVO();
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
        } else {
            pagingVO.setToPageNo(page);
        }
        ComputerProblemsList computerProblemsList = new ComputerProblemsList();
        computerProblemsList.setSubject(subject);
        computerProblemsList.setPagingVO(pagingVO);
        ComputerProblemsList result = this.getComputerProblemsList(computerProblemsList);
        Map<String, Object> map =new HashMap<String, Object>();
        map.put("computerProblemsList", result.getComputerProblemsList());
        map.put("pagingVO", result.getPagingVO());
        return map;
    }

    // 获取电脑故障列表
    public ComputerProblemsList getComputerProblemsList(ComputerProblemsList computerProblemsList) throws Exception{

        //获取当前操作对象
        Subject subject = computerProblemsList.getSubject();
        //获取当前页码对象
        PagingVO pagingVO = computerProblemsList.getPagingVO();
        //初始化结果对象
        List<ComputerProblemsCustom> list;

        if (subject.hasRole("hardware")) {
            //硬件组
            //封装搜索条件
            Map<String, Object> map =new HashMap<String, Object>();
            map.put("pagingVO",pagingVO);
            map.put("hardware",1);
            //复合权限判断
            if(subject.hasRole("software")){
                map.put("software",1);
            }
            if(subject.hasRole("fee")){
                map.put("fee",1);
            }
            try {
                //设置总页数
                pagingVO.setTotalCount(computerProblemsService.getCountComplexGroupComputerProblems(map));
                //获取结果
                list = computerProblemsService.findComplexGroupByPaging(map);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            computerProblemsList.setPagingVO(pagingVO);
            computerProblemsList.setComputerProblemsList(list);
        }else if(subject.hasRole("software")){
            //软件组
            //封装搜索条件
            Map<String, Object> map =new HashMap<String, Object>();
            map.put("pagingVO",pagingVO);
            map.put("software",1);
            //复合权限判断
            if(subject.hasRole("hardware")){
                map.put("hardware",1);
            }
            if(subject.hasRole("fee")){
                map.put("fee",1);
            }
            try {
                //设置总页数
                pagingVO.setTotalCount(computerProblemsService.getCountComplexGroupComputerProblems(map));
                //获取结果
                list = computerProblemsService.findComplexGroupByPaging(map);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            computerProblemsList.setPagingVO(pagingVO);
            computerProblemsList.setComputerProblemsList(list);
        }else if(subject.hasRole("fee")){
            //物资组
            //封装搜索条件
            Map<String, Object> map =new HashMap<String, Object>();
            map.put("pagingVO",pagingVO);
            map.put("fee",1);
            //复合权限判断
            if(subject.hasRole("software")){
                map.put("software",1);
            }
            if(subject.hasRole("hardware")){
                map.put("hardware",1);
            }
            try {
                //设置总页数
                pagingVO.setTotalCount(computerProblemsService.getCountComplexGroupComputerProblems(map));
                //获取结果
                list = computerProblemsService.findComplexGroupByPaging(map);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            computerProblemsList.setPagingVO(pagingVO);
            computerProblemsList.setComputerProblemsList(list);

        }else if (subject.hasRole("infodean") ||subject.hasRole("alldean")) {
            try {
                //设置总页数
                pagingVO.setTotalCount(computerProblemsService.getCountComputerProblems());
                list = computerProblemsService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            computerProblemsList.setPagingVO(pagingVO);
            computerProblemsList.setComputerProblemsList(list);
        }else if (subject.hasRole("examiner")) {
            try {
                pagingVO.setTotalCount(computerProblemsService.getCountComputerProblems());
                list = computerProblemsService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            computerProblemsList.setPagingVO(pagingVO);
            computerProblemsList.setComputerProblemsList(list);
        }else {
            if (subject.hasRole("admin")) {

            }else{
                try {
                    ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);
                    String currentDept = viewEmployeeMiPsd.getDeptCode();
                    pagingVO.setTotalCount(computerProblemsService.getCountDeptComputerProblems(currentDept));
                    list = computerProblemsService.deptFindByPaging(pagingVO.getCurentPageNo(), currentDept);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }
                computerProblemsList.setPagingVO(pagingVO);
                computerProblemsList.setComputerProblemsList(list);
            }
        }
        return computerProblemsList;
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
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

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

        //设置标红标识
        computerProblemsCustom.setFaultUrgent(0);

        //保存该记录相关数据以便产生推送
        try {
            //创建消息
            PushMessage preMessage = createPushUtil.createPreMessage(computerProblemsCustom.getUserid(),"0","0",
                    "3","11");
            Boolean result = computerProblemsService.saveAndPre(computerProblemsCustom, preMessage);
            if (!result) {
                map.put("success", "false");
                map.put("msg", "抱歉，故障信息保存失败");
                return map;
            }
            //向指定管理组群推送消息
            switch(computerProblemsCustom.getType()){
                case 1:
                    String[] userGroups1 = new String[]{"hardware","examiner"};
                    messagePushUtil.groupsPushSingle(preMessage,userGroups1);
                    break;
                case 2:
                    String[] userGroups2 = new String[]{"software","examiner"};
                    messagePushUtil.groupsPushSingle(preMessage,userGroups2);
                    break;
                case 3:
                    String[] userGroups3 = new String[]{"fee","examiner"};
                    messagePushUtil.groupsPushSingle(preMessage,userGroups3);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("success", "true");
        map.put("msg", "提交成功");
        return map;
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
                PushMessage pushMessage = createPushUtil.createPreMessage(computerProblemsCustom.getUserid(),"0","0",
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
                messagePushUtil.specifiedPushSingle(pushMessage,computerProblemsCustom.getUserid());
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
                PushMessage pushMessage = createPushUtil.createPreMessage(computerProblemsCustom.getUserid(),"0","0",
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
                messagePushUtil.specifiedPushSingle(pushMessage,computerProblemsCustom.getUserid());
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
        List<ComputerProblemsCustom> list = null;
        Map<String, Object> condition =new HashMap<String, Object>();
        condition.put("dept",findByDept);
        condition.put("name",findByName);
        int flag = 0;
        try {
            flag = Integer.parseInt(findByFlag);
        } catch (NumberFormatException e) {
            flag = 3;
        }
        condition.put("flag",flag);

        try {
            list = computerProblemsService.paginationOfSearchResults(condition);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "false");
            map.put("msg", "搜索出错，请重试");
            return map;
        }

        if(list.size() <= 200){
            map.put("success", "true");
            map.put("computerProblemsList", list);
        }else{
            map.put("success", "false");
            map.put("msg", "结果大于200条，请精确查找条件");
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
            //页码对象
            PagingVO pagingVO = new PagingVO();
            //设置总页数
            pagingVO.setTotalCount(materialApplicationService.getCountDeptMaterialApplication(currentDept));
            if (page == null || page == 0) {
                pagingVO.setToPageNo(1);
                listByDept = materialApplicationService.deptFindByPaging(1,currentDept);
            } else {
                pagingVO.setToPageNo(page);
                listByDept = materialApplicationService.deptFindByPaging(page,currentDept);
            }
            map.put("materialApplicationList", listByDept);
            model.addAttribute("pagingVO", pagingVO);
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
            PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                    "0","21");

            Boolean result = materialApplicationService.saveAndPre(materialApplicationCustom, pushMessage);

            if (!result) {
                map.put("success", "false");
                map.put("msg", "抱歉，物资申购保存失败");
                return map;
            }

            //向管理组推送消息
           messagePushUtil.groupPushSingle(pushMessage,"admin");
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




    // 开始处理物资申购
    @RequestMapping(value = "/dealMaterialApplication")
    @ResponseBody
    public Map<String, Object> dealMaterialApplication(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        int judge = 0;
        int total = 0;
        try {
            judge = Integer.parseInt(request.getParameter("judge"));
            total = Integer.parseInt(request.getParameter("total"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
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
            materialApplicationCustom.setBrand(brand);
            materialApplicationCustom.setModel(model);
            materialApplicationCustom.setJudge(judge);
            materialApplicationCustom.setTotal(total);
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
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
                messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
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
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        int judge = 0;
        int total = 0;
        try {
            judge = Integer.parseInt(request.getParameter("judge"));
            total = Integer.parseInt(request.getParameter("total"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
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
            materialApplicationCustom.setBrand(brand);
            materialApplicationCustom.setModel(model);
            materialApplicationCustom.setJudge(judge);
            materialApplicationCustom.setTotal(total);
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
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
                messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
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

        List<MaterialApplicationCustom> list = null;
        Map<String, Object> map =new HashMap<String, Object>();
        Map<String, Object> condition =new HashMap<String, Object>();
        condition.put("dept",findByDept);
        condition.put("applicant",findByName);
        int flag = 0;
        try {
            flag = Integer.parseInt(findByFlag);
        } catch (NumberFormatException e) {
            flag = 3;
        }
        map.put("flag",flag);
        try {
            list = materialApplicationService.paginationOfSearchResults(condition);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", "false");
            map.put("msg", "搜索出错，请重试");
        }

        if(list.size() <= 200){
            map.put("success", "true");
            map.put("materialApplicationList", list);
        }else{
            map.put("success", "false");
            map.put("msg", "结果大于200条，请精确查找条件");
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
            PushMessage pushMessage = createPushUtil.createPreMessage(engineRoomInspectionCustom.getUserid(),"0","2",
                    "0","31");

            Boolean result = engineRoomInspectionService.saveAndPre(engineRoomInspectionCustom, pushMessage);

            if (!result) {
                map.put("success", "false");
                map.put("msg", "抱歉，巡检信息保存失败");
                return map;
            }

            //向管理组推送消息
           messagePushUtil.groupPushSingle(pushMessage,"admin");
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

    // 机房巡检审核页面
    @RequestMapping(value = "/dealEngineRoomInspection", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> dealEngineRoomInspection(Integer id) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();

        //巡检审核者标识
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("examiner")){

        }else {
            map.put("success", "false");
            map.put("msg", "抱歉，你没有该权限");
            return map;
        }

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

    // 机房巡检审核通过
    @RequestMapping(value = "/passEngineRoomInspection")
    @ResponseBody
    public Map<String, Object> passEngineRoomInspection(Integer id) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();

        //巡检审核者标识
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("examiner")){

        }else {
            map.put("success", "false");
            map.put("msg", "抱歉，你没有该权限");
            return map;
        }

        if (id == null) {
            map.put("success", "false");
            map.put("msg", "数据异常");
            return map;
        }
        EngineRoomInspectionCustom engineRoomInspectionCustom = engineRoomInspectionService.findById(id);
        if (engineRoomInspectionCustom == null) {
            map.put("success", "false");
            map.put("msg", "未找到该机房巡检相关信息");
            return map;
        }

        if(engineRoomInspectionCustom.getFlag() != 0){
            map.put("success", "false");
            map.put("msg", "该机房巡检已经审核过");
            return map;
        }
        //获取当前操作用户对象
        engineRoomInspectionCustom.setFlag(2);
        engineRoomInspectionService.updataById(engineRoomInspectionCustom.getId(), engineRoomInspectionCustom);

        map.put("success", "true");
        map.put("msg", "审核完成");
        return map;
    }

    // 机房巡检审核拒绝
    @RequestMapping(value = "/denyEngineRoomInspection")
    @ResponseBody
    public Map<String, Object> denyEngineRoomInspection(Integer id) throws Exception {

        Map<String, Object> map =new HashMap<String, Object>();

        //巡检审核者标识
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("examiner")){

        }else {
            map.put("success", "false");
            map.put("msg", "抱歉，你没有该权限");
            return map;
        }

        if (id == null) {
            map.put("success", "false");
            map.put("msg", "数据异常");
            return map;
        }
        EngineRoomInspectionCustom engineRoomInspectionCustom = engineRoomInspectionService.findById(id);
        if (engineRoomInspectionCustom == null) {
            map.put("success", "false");
            map.put("msg", "未找到该机房巡检相关信息");
            return map;
        }

        if(engineRoomInspectionCustom.getFlag() != 0){
            map.put("success", "false");
            map.put("msg", "该机房巡检已经审核过");
            return map;
        }
        //获取当前操作用户对象
        engineRoomInspectionCustom.setFlag(1);
        engineRoomInspectionService.updataById(engineRoomInspectionCustom.getId(), engineRoomInspectionCustom);

        map.put("success", "true");
        map.put("msg", "审核完成");
        return map;
    }

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


    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<相关信息获取>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //region
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
            Logger logger = Logger.getLogger(MobileAdminController.class.getName());
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
                Logger logger = Logger.getLogger(MobileAdminController.class.getName());
                logger.error("用户获取失败：可能是本地库连接失败",e);
            }
            e.printStackTrace();
            //获取日志记录器，这个记录器将负责控制日志信息
            Logger logger = Logger.getLogger(MobileAdminController.class.getName());
            logger.error("用户获取失败：可能是HIS库连接失败，将切换到备用库",e);
        }
        return viewEmployeeMiPsd;
    }
    //endregion


}
