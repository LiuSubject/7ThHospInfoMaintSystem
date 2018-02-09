package com.system.controller;

import com.system.exception.CustomException;
import com.system.operate.*;
import com.system.po.*;
import com.system.service.*;
import com.system.util.CustomerContextHolder;
import com.system.util.push.CreatePushUtil;
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
 /**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：NormalController
 * 类描述：PC端普通用户请求拦截器
 * 创建人：lxk
 * 创建时间：2017-12-3 14:07:07
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

@Controller
@RequestMapping("/normal")
public class NormalController {

    @SuppressWarnings("SpringJavaAutowiringInspection")//忽略警告，下同
    @Resource(name = "userloginServiceImpl")
    private UserloginService userloginService;

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

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "softwareRequirementsServiceImpl")
    private SoftwareRequirementsService softwareRequirementsService;

    @Autowired
    private CreatePushUtil createPushUtil;

    @Autowired
    private MessagePushUtil messagePushUtil;

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<电脑故障操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //region

    // 电脑故障显示(普通用户只能看到本科室提交的故障报告)
    @RequestMapping("/showComputerProblems")
    public String showComputerProblems(Model model, Integer page) throws Exception {
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
        model.addAttribute("computerProblemsList", result.getComputerProblemsList());
        model.addAttribute("pagingVO", result.getPagingVO());
        //返回角色对象
        model.addAttribute("roles",this.getRoles(subject));

        return "normal/showComputerProblems";
    }

    // 获取电脑故障列表
    public ComputerProblemsList getComputerProblemsList(ComputerProblemsList computerProblemsList) throws Exception{

        //获取当前操作对象
        Subject subject = computerProblemsList.getSubject();
        //获取当前页码对象
        PagingVO pagingVO = computerProblemsList.getPagingVO();
        //初始化结果对象
        List<ComputerProblemsCustom> list;

        if (subject.hasRole("infodean") ||subject.hasRole("alldean")) {
            //信息主管院长与院长能查看所有记录
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
        }else{
            try {
                ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);
                String currentDept = viewEmployeeMiPsd.getDeptCode();
                //设置总页数
                pagingVO.setTotalCount(computerProblemsService.getCountDeptComputerProblems(currentDept));
                list = computerProblemsService.deptFindByPaging(pagingVO.getCurentPageNo(),currentDept);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            computerProblemsList.setPagingVO(pagingVO);
            computerProblemsList.setComputerProblemsList(list);

        }
        return computerProblemsList;
    }

    //添加电脑故障
    @RequestMapping(value = "/addComputerProblems", method = {RequestMethod.GET})
    public String addComputerProblemsUI(Model model) throws Exception {

        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/addComputerProblems";
    }

    // 添加电脑故障记录
    @RequestMapping(value = "/addComputerProblems", method = {RequestMethod.POST})
    public String addComputerProblemsCustom(ComputerProblemsCustom computerProblemsCustom, Model model,HttpServletRequest request,UploadedImageFile file) throws Exception {

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

        //保存该记录相关数据以便产生推送
        try {

            PushMessage preMessage = createPushUtil.createPreMessage(computerProblemsCustom.getUserid(),"0","0",
                    "3","11");
            Boolean result = computerProblemsService.saveAndPre(computerProblemsCustom, preMessage);
            if (!result) {
                model.addAttribute("message", "抱歉，故障信息保存失败");
                return "error";
            }
            //向指定管理组推送消息
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
        //重定向
        return "redirect:/normal/showComputerProblems";
    }

    // 修改电脑故障页面显示
    @RequestMapping(value = "/editComputerProblems", method = {RequestMethod.GET})
    public String editComputerProblemsUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showComputerProblems";
        }
        ComputerProblems computerProblems = computerProblemsService.findById(id);
        if (computerProblems == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
        }

        model.addAttribute("computerProblems", computerProblems);
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/editComputerProblems";
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
        return "redirect:/normal/showComputerProblems";
    }

    // 开始处理电脑故障
    @RequestMapping(value = "/dealComputerProblems")
    public String dealComputerProblems(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        if (id == null) {
            return "redirect:/normal/showComputerProblems";
        }

        //获取当前故障问题
        ComputerProblemsCustom computerProblemsCustom = computerProblemsService.findById(id);
        if (computerProblemsCustom == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);
        if(computerProblemsCustom.getFlag() == 0){
            //更新该故障问题数据
            computerProblemsCustom.setFlag(1);
            computerProblemsCustom.setLeader(viewEmployeeMiPsd.getCode());
            computerProblemsCustom.setReback(feedback);
            computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);
        }

        return "redirect:editComputerProblems?id=" + computerProblemsCustom.getId();
    }

    // 电脑故障处理完成
    @RequestMapping(value = "/completeComputerProblems")
    public String completeComputerProblems(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        if (id == null) {
            return "redirect:/normal/showComputerProblems";
        }

        //获取当前故障问题
        ComputerProblemsCustom computerProblemsCustom = computerProblemsService.findById(id);
        if (computerProblemsCustom == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);
        if(computerProblemsCustom.getFlag() == 0){
            //更新该故障问题数据
            computerProblemsCustom.setFlag(2);
            computerProblemsCustom.setLeader(viewEmployeeMiPsd.getCode());
            computerProblemsCustom.setReback(feedback);
            computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);
        }

        return "redirect:editComputerProblems?id=" + computerProblemsCustom.getId();
    }

    // 查看电脑故障详情
    @RequestMapping(value = "/checkComputerProblems", method = {RequestMethod.GET})
    public String checkComputerProblems(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showComputerProblems";
        }
        ComputerProblems computerProblems = computerProblemsService.findById(id);
        if (computerProblems == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
        }
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        model.addAttribute("computerProblems", computerProblems);
        return "normal/checkComputerProblems";
    }

    // 查看电脑故障详情
    @RequestMapping(value = "/checkComputerProblems", method = {RequestMethod.POST})
    public String checkComputerProblems(ComputerProblemsCustom computerProblemsCustom) throws Exception {

        //重定向
        return "redirect:/normal/showComputerProblems";
    }

    //搜索电脑故障
    @RequestMapping(value = "/searchComputerProblems")
    private String searchComputerProblems(String findByDept,String findByName,String findByFlag, Model model,Integer page) throws Exception {
        //封装搜索条件
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
        //获取当前操作用户
        Subject subject = SecurityUtils.getSubject();
        //封装
        ComputerProblemsSearch computerProblemsSearch = new ComputerProblemsSearch();
        computerProblemsSearch.setMap(map);
        computerProblemsSearch.setSubject(subject);

        ComputerProblemsSearch result = this.computerProblemsSearch(computerProblemsSearch);
        model.addAttribute("computerProblemsList", result.getComputerProblemsList());
        //返回角色对象
        model.addAttribute("roles",this.getRoles(subject));

        return "normal/showComputerProblems";
    }

    // 搜索电脑故障（暂未使用参数page）
    public ComputerProblemsSearch computerProblemsSearch(ComputerProblemsSearch computerProblemsSearch) throws Exception{
        //获取当前操作对象
        Subject subject = computerProblemsSearch.getSubject();
        //获取当前页码对象
        PagingVO pagingVO = computerProblemsSearch.getPagingVO();
        //获取搜索条件
        Map<String, Object> map = computerProblemsSearch.getMap();
        //初始化结果对象
        List<ComputerProblemsCustom> list;
        try {
            if (subject.hasRole("hardware")) {
                //硬件组
                int groupType = 1;
                map.put("groupType",groupType);
                list = computerProblemsService.paginationOfgGroupSearchResults(map);
                computerProblemsSearch.setComputerProblemsList(list);
            }else if(subject.hasRole("software")){
                //软件组
                int groupType = 2;
                map.put("groupType",groupType);
                list = computerProblemsService.paginationOfgGroupSearchResults(map);
                computerProblemsSearch.setComputerProblemsList(list);
            }else if(subject.hasRole("fee")){
                //费用组
                int groupType = 3;
                map.put("groupType",groupType);
                list = computerProblemsService.paginationOfgGroupSearchResults(map);
                computerProblemsSearch.setComputerProblemsList(list);
            }else {
                list = computerProblemsService.paginationOfSearchResults(map);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return computerProblemsSearch;
    }

    //endregion
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<物资申购操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //region
    // 物资申购显示(普通用户只能看到自己部门提交的物资申购)
    @RequestMapping("/showMaterialApplication")
    public String showMaterialApplication(Model model, Integer page) throws Exception {
        //当前操作对象
        Subject subject = SecurityUtils.getSubject();
        //页码对象初始化
        PagingVO pagingVO = new PagingVO();
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
        } else {
            pagingVO.setToPageNo(page);
        }
        MaterialApplicationList materialApplicationList = new MaterialApplicationList();
        materialApplicationList.setSubject(subject);
        materialApplicationList.setPagingVO(pagingVO);
        MaterialApplicationList result = this.getMaterialApplicationList(materialApplicationList);
        model.addAttribute("materialApplicationList", result.getMaterialApplicationsList());
        model.addAttribute("pagingVO", result.getPagingVO());
        //返回角色对象
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/showMaterialApplication";
    }

    public MaterialApplicationList getMaterialApplicationList(MaterialApplicationList materialApplicationList)throws Exception{

        //获取当前操作对象
        Subject subject = materialApplicationList.getSubject();
        //获取当前页码对象
        PagingVO pagingVO = materialApplicationList.getPagingVO();
        //初始化结果对象
        List<MaterialApplicationCustom> list;
        //当前用户
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        if(subject.hasRole("infodean")){
            //信息主管院长能够看到所有物资申购请求
            try {
                //设置总页数
                pagingVO.setTotalCount(materialApplicationService.getCountMaterialApplication());
                //获取数据
                list = materialApplicationService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            materialApplicationList.setPagingVO(pagingVO);
            materialApplicationList.setMaterialApplicationsList(list);
        }else if(subject.hasRole("alldean")){
            //院长能够看到所有物资申购请求
            try {
                //设置总页数
                pagingVO.setTotalCount(materialApplicationService.getCountMaterialApplication());
                //获取数据
                list = materialApplicationService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            materialApplicationList.setPagingVO(pagingVO);
            materialApplicationList.setMaterialApplicationsList(list);
        }else if(subject.hasRole("dpdean")){
            //分管院长能够看到与自己相关的待审批及本部门物资申购请求
            //当前部门
            String currentDept = viewEmployeeMiPsd.getDeptCode();
            try {
                //设置总页数
                pagingVO.setTotalCount(materialApplicationService.getDeptAndApproveMaterialApplication(currentDept,viewEmployeeMiPsd.getCode()));
                //获取数据
                list = materialApplicationService.deptAndApproveFindByPaging(pagingVO.getCurentPageNo(),currentDept,viewEmployeeMiPsd.getCode());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            materialApplicationList.setPagingVO(pagingVO);
            materialApplicationList.setMaterialApplicationsList(list);
        }else{
            //普通用户只能看到自己部门提交的物资申购请求
            //当前部门
            String currentDept = viewEmployeeMiPsd.getDeptCode();
            try {
                //设置总页数
                pagingVO.setTotalCount(materialApplicationService.getCountDeptMaterialApplication(currentDept));
                //获取数据
                list = materialApplicationService.deptFindByPaging(1,currentDept);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            materialApplicationList.setPagingVO(pagingVO);
            materialApplicationList.setMaterialApplicationsList(list);
        }

        return materialApplicationList;
    }

    // 修改物资申购页面显示
    @RequestMapping(value = "/editMaterialApplication", method = {RequestMethod.GET})
    public String editMaterialApplicationUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showMaterialApplication";
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        MaterialApplication materialApplication = materialApplicationService.findById(id);
        if (materialApplication == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }

        //返回角色对象
        model.addAttribute("roles",this.getRoles(subject));
        model.addAttribute("materialApplication", materialApplication);
        return "normal/editMaterialApplication";
    }

    // 物资申购审批拒绝
    @RequestMapping(value = "/denyMaterialApplication", method = {RequestMethod.GET})
    public String denyMaterialApplication(HttpServletRequest request) throws Exception {

        String feedback = request.getParameter("feedback");
        Integer id = Integer.parseInt(request.getParameter("id"));
        if (id == null) {
            return "redirect:/normal/showMaterialApplication";
        }
        MaterialApplicationCustom materialApplicationCustom = materialApplicationService.findById(id);
        if (materialApplicationCustom == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        //新建物资申购拒绝操作对象
        MaterialApplicationDeny materialApplicationDeny = new MaterialApplicationDeny();
        materialApplicationDeny.setId(id);
        materialApplicationDeny.setFeedback(feedback);
        materialApplicationDeny.setMaterialApplicationCustom(materialApplicationCustom);
        materialApplicationDeny.setSubject(subject);

        MaterialApplicationDeny result = this.materialApplicationDeny(materialApplicationDeny);
        return result.getDenyAction();
    }

    // 拒绝物资申购审批操作
    public MaterialApplicationDeny materialApplicationDeny(MaterialApplicationDeny materialApplicationDeny)throws Exception{
        Integer id = materialApplicationDeny.getId();
        String feedback = materialApplicationDeny.getFeedback();
        MaterialApplicationCustom materialApplicationCustom = materialApplicationDeny.getMaterialApplicationCustom();
        Subject subject = materialApplicationDeny.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        //获取操作时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);

        if(subject.hasRole("dpdean") && materialApplicationCustom.getHighLeaderApproved1() == 1){
            //分管院长审批
            materialApplicationCustom.setApprovedFlag(2);
            materialApplicationCustom.setHighLeaderReback1(feedback);
            materialApplicationCustom.setHighLeaderName1(viewEmployeeMiPsd.getName());
            materialApplicationCustom.setHighLeaderFlag1(2);
            materialApplicationCustom.setFlag(2);
            //设置完成时间
            materialApplicationCustom.setDoneTime(dateString);
            //更新物资申购记录
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);

            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                        "2","27");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }
                //向申报人推送消息
                messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }

            materialApplicationDeny.setDenyAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
        }else if(subject.hasRole("infodean") && materialApplicationCustom.getHighLeaderApproved2() == 1){
            //信息主管院长
            materialApplicationCustom.setApprovedFlag(2);
            materialApplicationCustom.setHighLeaderReback2(feedback);
            materialApplicationCustom.setHighLeaderName2(viewEmployeeMiPsd.getName());
            materialApplicationCustom.setHighLeaderFlag2(2);
            materialApplicationCustom.setFlag(2);
            //设置完成时间
            materialApplicationCustom.setDoneTime(dateString);
            //更新物资申购记录
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);

            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                        "2","27");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }
                //向申报人推送消息
                messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }

            materialApplicationDeny.setDenyAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
        }else if(subject.hasRole("alldean") && materialApplicationCustom.getHighLeaderApproved3() == 1){
            //院长
            materialApplicationCustom.setApprovedFlag(2);
            materialApplicationCustom.setHighLeaderReback3(feedback);
            materialApplicationCustom.setHighLeaderName3(viewEmployeeMiPsd.getName());
            materialApplicationCustom.setHighLeaderFlag3(2);
            materialApplicationCustom.setFlag(2);
            //设置完成时间
            materialApplicationCustom.setDoneTime(dateString);
            //更新物资申购记录
            materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);

            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                        "2","27");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }
                //向申报人推送消息
                messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }

            materialApplicationDeny.setDenyAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
        }else{
            materialApplicationDeny.setDenyAction("redirect:/normal/showMaterialApplication");
        }

        return materialApplicationDeny;
    }

    // 物资申购审批通过
    @RequestMapping(value = "/passMaterialApplication")
    public String passMaterialApplication(HttpServletRequest request) throws Exception {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("feedback");
        if (id == null) {
            return "redirect:/normal/showMaterialApplication";
        }
        MaterialApplicationCustom materialApplicationCustom = materialApplicationService.findById(id);
        if (materialApplicationCustom == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        //新建物资申购拒绝操作对象
        MaterialApplicationPass materialApplicationPass = new MaterialApplicationPass();
        materialApplicationPass.setId(id);
        materialApplicationPass.setFeedback(feedback);
        materialApplicationPass.setMaterialApplicationCustom(materialApplicationCustom);
        materialApplicationPass.setSubject(subject);

        MaterialApplicationPass result = this.materialApplicationPass(materialApplicationPass);
        return result.getPassAction();
    }

    // 通过物资申购操作
    public MaterialApplicationPass materialApplicationPass(MaterialApplicationPass materialApplicationPass)throws Exception{
        Integer id = materialApplicationPass.getId();
        String feedback = materialApplicationPass.getFeedback();
        MaterialApplicationCustom materialApplicationCustom = materialApplicationPass.getMaterialApplicationCustom();
        Subject subject = materialApplicationPass.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        //保存意见至对应位，保存姓名，单个审批结果标识置1-通过
        //此段代码又臭又长，但是这是本人认为能最大限度能将不同权限组的操作进行解耦以便修改，水平不足，
        //倘若阁下能进行良好的优化，务必发我邮箱让我学习一下。
        if(subject.hasRole("dpdean")){
            materialApplicationCustom.setHighLeaderReback1(feedback);
            materialApplicationCustom.setHighLeaderName1(viewEmployeeMiPsd.getName());
            materialApplicationCustom.setHighLeaderFlag1(1);
            //判断审核者数量以作不同处理
            //如果审核者只有dpdean
            if(0 == materialApplicationCustom.getHighLeaderApproved2()
                    && 0 == materialApplicationCustom.getHighLeaderApproved3()){
                //最终审批结果标识置1-通过，使物资处理组可处理标识置1-可见
                materialApplicationCustom.setApprovedFlag(1);
                materialApplicationCustom.setGroupVisible(1);
                materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                //保存该记录相关数据以便产生推送
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                            "0","26");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向申报人推送消息
                    messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                            "0","29");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向处理组推送消息
                    messagePushUtil.groupPushSingle(pushMessage,"material");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());

            }else if(1 == (materialApplicationCustom.getHighLeaderApproved2()
                    + materialApplicationCustom.getHighLeaderApproved3())){
                //如果审核者除dpdean外还有一位
                //信息主管院长需审批但未审批
                if(1 == materialApplicationCustom.getHighLeaderApproved2()
                        && 0 == materialApplicationCustom.getHighLeaderFlag2()){
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                }else if(1 == materialApplicationCustom.getHighLeaderApproved3()
                        && 0 == materialApplicationCustom.getHighLeaderFlag3()){
                    //院长需审批但未审批
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                }else{
                    //说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,
                    // 最终审批结果标识置1-通过，更新数据并向处理组及用户推送消息
                    materialApplicationCustom.setApprovedFlag(1);
                    materialApplicationCustom.setGroupVisible(1);
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","26");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","29");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向处理组推送消息
                        messagePushUtil.groupPushSingle(pushMessage,"material");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
                }
            }else if(2 == (materialApplicationCustom.getHighLeaderApproved2()
                    + materialApplicationCustom.getHighLeaderApproved3())){
                //如果审核者除dpdean外还有两位
                //如果审核者审批皆通过
                if(2 == (materialApplicationCustom.getHighLeaderFlag2()
                        +  materialApplicationCustom.getHighLeaderFlag3())){
                    //说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,更新数据并向处理组推送消息//说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,
                    // 最终审批结果标识置1-通过，更新数据并向处理组及用户推送消息
                    materialApplicationCustom.setApprovedFlag(1);
                    materialApplicationCustom.setGroupVisible(1);
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","26");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","29");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向处理组推送消息
                        messagePushUtil.groupPushSingle(pushMessage,"material");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
                }else {
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
                }
            }else{
                materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
            }
        }else if(subject.hasRole("infodean")){
            //保存意见至对应位，保存姓名，单个审批结果标识置1-通过
            materialApplicationCustom.setHighLeaderReback2(feedback);
            materialApplicationCustom.setHighLeaderName2(viewEmployeeMiPsd.getName());
            materialApplicationCustom.setHighLeaderFlag2(1);
            //判断审核者数量以作不同处理
            //如果审核者只有infodean
            if(0 == materialApplicationCustom.getHighLeaderApproved1()
                    && 0 == materialApplicationCustom.getHighLeaderApproved3()){
                //最终审批结果标识置1-通过，使物资处理组可处理标识置1-可见
                materialApplicationCustom.setApprovedFlag(1);
                materialApplicationCustom.setGroupVisible(1);
                materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                //保存该记录相关数据以便产生推送
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                            "0","26");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向申报人推送消息
                    messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                            "0","29");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向处理组推送消息
                    messagePushUtil.groupPushSingle(pushMessage,"material");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());

            }else if(1 == (materialApplicationCustom.getHighLeaderApproved1()
                    + materialApplicationCustom.getHighLeaderApproved3())){
                //如果审核者除infodean外还有一位
                //分管院长需审批但未审批
                if(1 == materialApplicationCustom.getHighLeaderApproved1()
                        && 0 == materialApplicationCustom.getHighLeaderFlag1()){
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                }else if(1 == materialApplicationCustom.getHighLeaderApproved3()
                        && 0 == materialApplicationCustom.getHighLeaderFlag3()){
                    //院长需审批但未审批
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                }else{
                    //说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,
                    // 最终审批结果标识置1-通过，更新数据并向处理组及用户推送消息
                    materialApplicationCustom.setApprovedFlag(1);
                    materialApplicationCustom.setGroupVisible(1);
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","26");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","29");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向处理组推送消息
                        messagePushUtil.groupPushSingle(pushMessage,"material");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }else if(2 == (materialApplicationCustom.getHighLeaderApproved1()
                    + materialApplicationCustom.getHighLeaderApproved3())){
                //如果审核者除infodean外还有两位
                //如果审核者审批皆通过
                if(2 == (materialApplicationCustom.getHighLeaderFlag1()
                        +  materialApplicationCustom.getHighLeaderFlag3())){
                    //说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,更新数据并向处理组推送消息//说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,
                    // 最终审批结果标识置1-通过，更新数据并向处理组及用户推送消息
                    materialApplicationCustom.setApprovedFlag(1);
                    materialApplicationCustom.setGroupVisible(1);
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","26");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","29");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向处理组推送消息
                        messagePushUtil.groupPushSingle(pushMessage,"material");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
                }else {
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());                }
            }else{
                materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
            }
        }else if(subject.hasRole("alldean")){
            materialApplicationCustom.setHighLeaderReback3(feedback);
            materialApplicationCustom.setHighLeaderName3(viewEmployeeMiPsd.getName());
            materialApplicationCustom.setHighLeaderFlag3(1);
            //判断审核者数量以作不同处理
            //如果审核者只有alldean
            if(0 == materialApplicationCustom.getHighLeaderApproved1()
                    && 0 == materialApplicationCustom.getHighLeaderApproved2()){
                //最终审批结果标识置1-通过，使物资处理组可处理标识置1-可见
                materialApplicationCustom.setApprovedFlag(1);
                materialApplicationCustom.setGroupVisible(1);
                materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                //保存该记录相关数据以便产生推送
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                            "0","26");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向申报人推送消息
                    messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                            "0","29");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向处理组推送消息
                    messagePushUtil.groupPushSingle(pushMessage,"material");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
            }else if(1 == (materialApplicationCustom.getHighLeaderApproved1()
                    + materialApplicationCustom.getHighLeaderApproved2())){
                //如果审核者除alldean外还有一位
                //分管院长需审批但未审批
                if(1 == materialApplicationCustom.getHighLeaderApproved1()
                        && 0 == materialApplicationCustom.getHighLeaderFlag1()){
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                }else if(1 == materialApplicationCustom.getHighLeaderApproved2()
                        && 0 == materialApplicationCustom.getHighLeaderFlag2()){
                    //信息主管副院长需审批但未审批
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                }else{
                    //说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,
                    // 最终审批结果标识置1-通过，更新数据并向处理组及用户推送消息
                    materialApplicationCustom.setApprovedFlag(1);
                    materialApplicationCustom.setGroupVisible(1);
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","26");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","29");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向处理组推送消息
                        messagePushUtil.groupPushSingle(pushMessage,"material");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
                }
            }else if(2 == (materialApplicationCustom.getHighLeaderApproved1()
                    + materialApplicationCustom.getHighLeaderApproved2())){
                //如果审核者除alldean外还有两位
                //如果审核者审批皆通过
                if(2 == (materialApplicationCustom.getHighLeaderFlag1()
                        +  materialApplicationCustom.getHighLeaderFlag2())){
                    //说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,更新数据并向处理组推送消息//说明需审核者已审核且结果皆为通过，使物资处理组可处理标识置1-可见,
                    // 最终审批结果标识置1-通过，更新数据并向处理组及用户推送消息
                    materialApplicationCustom.setApprovedFlag(1);
                    materialApplicationCustom.setGroupVisible(1);
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","26");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,materialApplicationCustom.getUserid());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                                "0","29");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向处理组推送消息
                        messagePushUtil.groupPushSingle(pushMessage,"material");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
                }else {
                    //只更新相关数据
                    materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);
                    materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
                }
            }else{
                materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
            }

        }else{
            materialApplicationPass.setPassAction("redirect:editMaterialApplication?id=" + materialApplicationCustom.getId());
        }
        return materialApplicationPass;
    }

    // 添加物资申购
    @RequestMapping(value = "/addMaterialApplication", method = {RequestMethod.GET})
    public String addMaterialApplicationUI(Model model) throws Exception {

        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/addMaterialApplication";
    }

    // 添加物资申购
    @RequestMapping(value = "/addMaterialApplication", method = {RequestMethod.POST})
    public String addMaterialApplicationCustom(MaterialApplicationCustom materialApplicationCustom, Model model) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

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
        materialApplicationCustom.setFaultUrgent(0);
        materialApplicationCustom.setGroupVisible(0);
        materialApplicationCustom.setHighApproved(0);
        materialApplicationCustom.setApprovedFlag(0);
        materialApplicationCustom.setHighLeaderFlag1(0);
        materialApplicationCustom.setHighLeaderFlag2(0);
        materialApplicationCustom.setHighLeaderFlag3(0);
        materialApplicationCustom.setHighLeaderApproved1(0);
        materialApplicationCustom.setHighLeaderApproved2(0);
        materialApplicationCustom.setHighLeaderApproved3(0);
        //设置问题所属部门
        materialApplicationCustom.setDept(viewEmployeeMiPsd.getDeptName());

        //设置问题所属部门编码
        materialApplicationCustom.setDepartcode(viewEmployeeMiPsd.getDeptCode());

        //设置问题所属人员ID
        materialApplicationCustom.setUserid(viewEmployeeMiPsd.getCode());

        //保存该记录相关数据以便产生推送
        try {
            PushMessage pushMessage = createPushUtil.createPreMessage(materialApplicationCustom.getUserid(),"0","1",
                    "0","21");

            Boolean result = materialApplicationService.saveAndPre(materialApplicationCustom, pushMessage);

            if (!result) {
                model.addAttribute("message", "抱歉，物资申购提交失败");
                return "error";
            }
            //向指定组推送消息
            messagePushUtil.groupPushSingle(pushMessage,"examiner");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //重定向
        return "redirect:/normal/showMaterialApplication";
    }

    // 修改物资申购页面处理
    @RequestMapping(value = "/editMaterialApplication", method = {RequestMethod.POST})
    public String editMaterialApplication(MaterialApplicationCustom materialApplicationCustom) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        materialApplicationCustom.setLeader(viewEmployeeMiPsd.getCode());

        materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);

        //重定向
        return "redirect:/normal/showMaterialApplication";
    }

    // 查看物资申购详情
    @RequestMapping(value = "/checkMaterialApplication", method = {RequestMethod.GET})
    public String checkMaterialApplication(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showMaterialApplication";
        }
        MaterialApplication materialApplication = materialApplicationService.findById(id);
        if (materialApplication == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }

        model.addAttribute("materialApplication", materialApplication);
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/checkMaterialApplication";
    }

    // 查看物资申购详情
    @RequestMapping(value = "/checkMaterialApplication", method = {RequestMethod.POST})
    public String checkMaterialApplication(MaterialApplicationCustom materialApplicationCustom) throws Exception {

        materialApplicationService.updataById(materialApplicationCustom.getId(), materialApplicationCustom);

        //重定向
        return "redirect:/normal/showMaterialApplication";
    }

    // 打印物资申购表单
    @RequestMapping(value = "/printMaterialApplication", method = {RequestMethod.GET})
    public String printMaterialApplication(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showMaterialApplication";
        }
        MaterialApplication materialApplication = materialApplicationService.findById(id);
        if (materialApplication == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }

        model.addAttribute("materialApplication", materialApplication);
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/printMaterialApplication";
    }

    // 打印物资申购表单
    @RequestMapping(value = "/printMaterialApplication", method = {RequestMethod.POST})
    public String printMaterialApplication(MaterialApplicationCustom materialApplicationCustom) throws Exception {

        //重定向
        return "normal/printMaterialApplication";
    }
    //endregion
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<机房巡检>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //region
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
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));


        return "normal/showEngineRoomInspection";

    }

    //添加机房巡检
    @RequestMapping(value = "/addEngineRoomInspection", method = {RequestMethod.GET})
    public String addEngineRoomInspectionUI(Model model) throws Exception {

        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/addEngineRoomInspection";
    }

    // 添加机房巡检
    @RequestMapping(value = "/addEngineRoomInspection", method = {RequestMethod.POST})
    public String addEngineRoomInspectionCustom(EngineRoomInspectionCustom engineRoomInspectionCustom, Model model) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

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

        Boolean result = engineRoomInspectionService.save(engineRoomInspectionCustom);

        if (!result) {
            model.addAttribute("message", "抱歉，机房巡检信息保存失败");
            return "error";
        }
        //重定向
        return "redirect:/normal/showEngineRoomInspection";
    }

/*    // 修改机房巡检页面显示
    @RequestMapping(value = "/editEngineRoomInspection", method = {RequestMethod.GET})
    public String editEngineRoomInspectionUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showEngineRoomInspection";
        }
        EngineRoomInspection engineRoomInspection = engineRoomInspectionService.findById(id);
        if (engineRoomInspection == null) {
            throw new CustomException("抱歉，未找到该机房巡检相关信息");
        }

        model.addAttribute("engineRoomInspection", engineRoomInspection);
        return "normal/editEngineRoomInspection";
    }*/

    // 修改机房巡检页面处理
/*    @RequestMapping(value = "/editEngineRoomInspection", method = {RequestMethod.POST})
    public String editEngineRoomInspection(EngineRoomInspectionCustom engineRoomInspectionCustom) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());

        engineRoomInspectionService.updataById(engineRoomInspectionCustom.getId(), engineRoomInspectionCustom);

        //重定向
        return "redirect:/normal/showEngineRoomInspection";
    }*/

/*    // 开始处理机房巡检
    @RequestMapping(value = "/dealEngineRoomInspection")
    public String dealEngineRoomInspection(HttpServletRequest request) throws Exception {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String feedback = request.getParameter("ycyy");
        if (id == null) {
            return "redirect:/normal/showEngineRoomInspection";
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
            return "redirect:/normal/showEngineRoomInspection";
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
            return "redirect:/normal/showEngineRoomInspection";
        }
        EngineRoomInspection engineRoomInspection = engineRoomInspectionService.findById(id);
        if (engineRoomInspection == null) {
            throw new CustomException("抱歉，未找到该机房巡检相关信息");
        }

        model.addAttribute("engineRoomInspection", engineRoomInspection);
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));


        return "normal/checkEngineRoomInspection";
    }

    // 查看机房巡检详情
    @RequestMapping(value = "/checkEngineRoomInspection", method = {RequestMethod.POST})
    public String checkEngineRoomInspection(EngineRoomInspectionCustom engineRoomInspectionCustom) throws Exception {

        //重定向
        return "redirect:/normal/showEngineRoomInspection";
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
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/showEngineRoomInspection";
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

    //endregion
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<软件需求操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //region
    // 软件需求显示
    @RequestMapping("/showSoftwareRequirements")
    public String showSoftwareRequirements(Model model, Integer page) throws Exception {
        //当前操作对象
        Subject subject = SecurityUtils.getSubject();
        //页码对象初始化
        PagingVO pagingVO = new PagingVO();
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
        } else {
            pagingVO.setToPageNo(page);
        }
        SoftwareRequirementsList softwareRequirementsList = new SoftwareRequirementsList();
        softwareRequirementsList.setSubject(subject);
        softwareRequirementsList.setPagingVO(pagingVO);
        SoftwareRequirementsList result = this.getSoftwareRequirementsList(softwareRequirementsList);
        model.addAttribute("softwareRequirementsList", result.getSoftwareRequirementsList());
        model.addAttribute("pagingVO", result.getPagingVO());
        //返回角色对象
        model.addAttribute("roles",this.getRoles(subject));

        return "normal/showSoftwareRequirements";
    }

    // 获取软件需求列表
    public SoftwareRequirementsList getSoftwareRequirementsList(SoftwareRequirementsList softwareRequirementsList) throws Exception{

        //获取当前操作对象
        Subject subject = softwareRequirementsList.getSubject();
        //获取当前页码对象
        PagingVO pagingVO = softwareRequirementsList.getPagingVO();
        //初始化结果对象
        List<SoftwareRequirementsCustom> list;

        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        if (subject.hasRole("examiner")) {
            //监督组
            try {
                //设置总页数
                pagingVO.setTotalCount(softwareRequirementsService.getCountSoftwareRequirements());
                //获取结果
                list = softwareRequirementsService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            softwareRequirementsList.setPagingVO(pagingVO);
            softwareRequirementsList.setSoftwareRequirementsList(list);
        }else if (subject.hasRole("dpdean")) {
            //主管院长组
            //封装搜索条件
            Map<String, Object> map =new HashMap<String, Object>();
            map.put("pagingVO",pagingVO);
            map.put("dept",viewEmployeeMiPsd.getDeptCode());
            map.put("code",viewEmployeeMiPsd.getCode());
            try {
                //设置总页数
                pagingVO.setTotalCount(
                        softwareRequirementsService.getCountSoftwareRequirementsOfdpdean(
                                viewEmployeeMiPsd.getDeptCode(),viewEmployeeMiPsd.getCode()));
                //获取结果
                list = softwareRequirementsService.findByDpdeanPaging(map);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            softwareRequirementsList.setPagingVO(pagingVO);
            softwareRequirementsList.setSoftwareRequirementsList(list);
        }else if (subject.hasRole("software")) {
            //软件组
            try {
                //设置总页数
                pagingVO.setTotalCount(softwareRequirementsService.getCountSoftwareRequirements());
                //获取结果
                list = softwareRequirementsService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            softwareRequirementsList.setPagingVO(pagingVO);
            softwareRequirementsList.setSoftwareRequirementsList(list);
        }else if (subject.hasRole("alldean")) {
            //院长
            try {
                //设置总页数
                pagingVO.setTotalCount(softwareRequirementsService.getCountSoftwareRequirements());
                //获取结果
                list = softwareRequirementsService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            softwareRequirementsList.setPagingVO(pagingVO);
            softwareRequirementsList.setSoftwareRequirementsList(list);
        }else if (subject.hasRole("infodean")) {
            //信息主管院长
            try {
                //设置总页数
                pagingVO.setTotalCount(softwareRequirementsService.getCountSoftwareRequirements());
                //获取结果
                list = softwareRequirementsService.findByPaging(pagingVO.getCurentPageNo());
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            softwareRequirementsList.setPagingVO(pagingVO);
            softwareRequirementsList.setSoftwareRequirementsList(list);
        }else{
            //普通用户
            //封装搜索条件
            Map<String, Object> map =new HashMap<String, Object>();
            map.put("pagingVO",pagingVO);
            map.put("dept",viewEmployeeMiPsd.getDeptCode());
            try {
                //设置总页数
                pagingVO.setTotalCount(
                        softwareRequirementsService.getCountSoftwareRequirementsOfDepart(
                                viewEmployeeMiPsd.getDeptCode()));
                //获取结果
                list = softwareRequirementsService.findByPagingOfDepart(map);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            softwareRequirementsList.setPagingVO(pagingVO);
            softwareRequirementsList.setSoftwareRequirementsList(list);
        }
        return softwareRequirementsList;
    }

    // 添加软件需求
    @RequestMapping(value = "/addSoftwareRequirements", method = {RequestMethod.POST})
    public String addSoftwareRequirementsCustom(SoftwareRequirementsCustom softwareRequirementsCustom,Model model,HttpServletRequest request) throws Exception{
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        //设置问题初始化时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        //设置初始状态
        softwareRequirementsCustom.setFlag(0);
        //设置需求反馈时间
        softwareRequirementsCustom.setApplicantTime(dateString);
        //设置需求编号(随机生成)
        softwareRequirementsCustom.setRequireNo( String.valueOf((int)((Math.random()*9+1)*100000)));
        //设置申请部门编码
        softwareRequirementsCustom.setDeptCode(viewEmployeeMiPsd.getDeptCode());
        //设置反馈人工号
        softwareRequirementsCustom.setApplicantId(viewEmployeeMiPsd.getCode());
        //设置紧急标识位
        softwareRequirementsCustom.setFaultUrgent(0);
        //设置软件组可处理标识
        softwareRequirementsCustom.setGroupVisible(0);
        //设置院领导审核标识
        softwareRequirementsCustom.setHighApproved(0);
        //设置最终审批结果
        softwareRequirementsCustom.setApprovedFlag(0);
        //设置主管院长审核标识
        softwareRequirementsCustom.setHighLeaderApproved1(0);
        //设置主管院长审批结果
        softwareRequirementsCustom.setHighLeaderFlag1(0);

        //保存该记录相关数据以便产生推送
        try {
            //创建消息
            PushMessage preMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","4",
                    "3","41");
            Boolean result = softwareRequirementsService.saveAndPre(softwareRequirementsCustom, preMessage);
            if (!result) {
                model.addAttribute("message", "抱歉，软件需求保存失败");
                return "error";
            }
            //向指定组推送消息
            messagePushUtil.groupPushSingle(preMessage,"examiner");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //重定向
        return "redirect:/normal/showSoftwareRequirements";
    }

    // 添加软件需求（页面跳转）
    @RequestMapping(value = "/addSoftwareRequirements", method = {RequestMethod.GET})
    public String addSoftwareRequirementsCustomUI(Model model) throws Exception {
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));
        return "normal/addSoftwareRequirements";
    }

    // 修改软件需求页面显示
    @RequestMapping(value = "/editSoftwareRequirements", method = {RequestMethod.GET})
    public String editSoftwareRequirements(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsService.findById(id);
        if (softwareRequirementsCustom == null) {
            throw new CustomException("抱歉，未找到该软件需求相关信息");
        }

        model.addAttribute("softwareRequirements", softwareRequirementsCustom);
        //返回角色对象
        model.addAttribute("roles",this.getRoles(subject));

        return "normal/editSoftwareRequirements";
    }

    // 查看软件需求页面显示
    @RequestMapping(value = "/checkSoftwareRequirements", method = {RequestMethod.GET})
    public String checkSoftwareRequirements(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsService.findById(id);
        if (softwareRequirementsCustom == null) {
            throw new CustomException("抱歉，未找到该软件需求相关信息");
        }

        model.addAttribute("softwareRequirements", softwareRequirementsCustom);
        //返回角色对象
        model.addAttribute("roles",this.getRoles(subject));

        return "normal/checkSoftwareRequirements";
    }

    // 处理软件需求
    @RequestMapping(value = "/dealSoftwareRequirements")
    public String dealSoftwareRequirements (HttpServletRequest request) throws Exception{
        Integer id;
        try {
            id = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "redirect:/normal/showSoftwareRequirements";
        }
        //ID为空则返回
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        //获取当前物资申购问题
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsService.findById(id);
        if (softwareRequirementsCustom == null) {
            throw new CustomException("抱歉，未找到该软件需求相关信息");
        }
        //相关数据转换
        String handling_comments = request.getParameter("handling_comments");
        String info_comments = request.getParameter("info_comments");
        String acceptance_description = request.getParameter("acceptance_description");
        String feedback = request.getParameter("feedback");
        int time_required = 0;
        int acceptance_type = 0;
        try {
            time_required = Integer.parseInt(request.getParameter("time_required"));
            acceptance_type = Integer.parseInt(request.getParameter("acceptance_type"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //封装数据
        Map<String, Object> thisData =new HashMap<String, Object>();
        thisData.put("handling_comments",handling_comments);
        thisData.put("info_comments",info_comments);
        thisData.put("acceptance_description",acceptance_description);
        thisData.put("feedback",feedback);
        thisData.put("time_required",time_required);
        thisData.put("acceptance_type",acceptance_type);
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        SoftwareRequirementsDeal softwareRequirementsDeal = new SoftwareRequirementsDeal();
        softwareRequirementsDeal.setMap(thisData);
        softwareRequirementsDeal.setSoftwareRequirementsCustom(softwareRequirementsCustom);
        softwareRequirementsDeal.setSubject(subject);

        SoftwareRequirementsDeal result = this.softwareRequirementsDeal(softwareRequirementsDeal);
        return result.getReturnAction();
    }

    // 处理软件需求操作
    public  SoftwareRequirementsDeal softwareRequirementsDeal(SoftwareRequirementsDeal softwareRequirementsDeal)throws Exception{
        Map<String, Object> thisData = softwareRequirementsDeal.getMap();
        Subject subject = softwareRequirementsDeal.getSubject();
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsDeal.getSoftwareRequirementsCustom();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        String handling_comments = thisData.get("handling_comments").toString();
        String info_comments = thisData.get("info_comments").toString();
        String acceptance_description = thisData.get("acceptance_description").toString();
        String feedback = thisData.get("feedback").toString();
        int time_required = Integer.parseInt(thisData.get("time_required").toString());
        int acceptance_type = Integer.parseInt(thisData.get("acceptance_type").toString());

        if(subject.hasRole("software")){
            if(softwareRequirementsCustom.getFlag() == 0 || softwareRequirementsCustom.getFlag() == 1){
                //软件组可处理标识位为1时才允许软件组处理
                if(softwareRequirementsCustom.getGroupVisible() == 1){
                    softwareRequirementsCustom.setFlag(1);
                    //更新该软件需求问题数据
                    softwareRequirementsCustom.setHandlingComments(handling_comments);
                    softwareRequirementsCustom.setInfoComments(info_comments);
                    softwareRequirementsCustom.setTimeRequired(time_required);

                    //设置反馈时间
                    Date currentTime = new Date();
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dateString = formatter.format(currentTime);
                    //将反馈插入空白反馈字段
                    if(softwareRequirementsCustom.getFeedbackId1() == null){
                        softwareRequirementsCustom.setFeedbackContent1(feedback);
                        softwareRequirementsCustom.setFeedbackId1(viewEmployeeMiPsd.getCode());
                        softwareRequirementsCustom.setFeedbackName1(viewEmployeeMiPsd.getName());
                        softwareRequirementsCustom.setFeedbackTime1(dateString);
                    }else if(softwareRequirementsCustom.getFeedbackId2() == null){
                        softwareRequirementsCustom.setFeedbackContent2(feedback);
                        softwareRequirementsCustom.setFeedbackId2(viewEmployeeMiPsd.getCode());
                        softwareRequirementsCustom.setFeedbackName2(viewEmployeeMiPsd.getName());
                        softwareRequirementsCustom.setFeedbackTime2(dateString);
                    }else if(softwareRequirementsCustom.getFeedbackId3() == null){
                        softwareRequirementsCustom.setFeedbackContent3(feedback);
                        softwareRequirementsCustom.setFeedbackId3(viewEmployeeMiPsd.getCode());
                        softwareRequirementsCustom.setFeedbackName3(viewEmployeeMiPsd.getName());
                        softwareRequirementsCustom.setFeedbackTime3(dateString);
                    }else if(softwareRequirementsCustom.getFeedbackId4() == null){
                        softwareRequirementsCustom.setFeedbackContent4(feedback);
                        softwareRequirementsCustom.setFeedbackId4(viewEmployeeMiPsd.getCode());
                        softwareRequirementsCustom.setFeedbackName4(viewEmployeeMiPsd.getName());
                        softwareRequirementsCustom.setFeedbackTime4(dateString);
                    }else if(softwareRequirementsCustom.getFeedbackId5() == null){
                        softwareRequirementsCustom.setFeedbackContent5(feedback);
                        softwareRequirementsCustom.setFeedbackId5(viewEmployeeMiPsd.getCode());
                        softwareRequirementsCustom.setFeedbackName5(viewEmployeeMiPsd.getName());
                        softwareRequirementsCustom.setFeedbackTime5(dateString);
                    }
                    softwareRequirementsService.updataById(softwareRequirementsCustom.getId(), softwareRequirementsCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","4",
                                "2","46");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,softwareRequirementsCustom.getApplicantId());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    softwareRequirementsDeal.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
                }else{
                    softwareRequirementsDeal.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
                }

            }else{
                softwareRequirementsDeal.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
            }
        }else if(subject.hasRole("examiner")) {
            if (softwareRequirementsCustom.getFlag() == 0 || softwareRequirementsCustom.getFlag() == 1) {
                softwareRequirementsCustom.setFlag(1);
                softwareRequirementsCustom.setGroupVisible(1);
                //更新该软件需求问题数据
                softwareRequirementsCustom.setHandlingComments(handling_comments);
                softwareRequirementsCustom.setInfoComments(info_comments);
                softwareRequirementsCustom.setTimeRequired(time_required);

                softwareRequirementsService.updataById(softwareRequirementsCustom.getId(), softwareRequirementsCustom);
                //保存该记录相关数据以便产生推送
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(), "0", "4",
                            "2", "42");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向申报人推送消息
                    messagePushUtil.specifiedPushSingle(pushMessage, softwareRequirementsCustom.getApplicantId());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //保存该记录相关数据以便产生推送
                try {
                    //创建消息
                    PushMessage preMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","4",
                            "3","49");
                    try {
                        pushMessageService.save(preMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向处理组推送消息
                    messagePushUtil.groupPushSingle(preMessage,"software");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                softwareRequirementsDeal.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
            } else {
                softwareRequirementsDeal.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
            }
        }
        return softwareRequirementsDeal;
    }

    // 软件需求处理完成
    @RequestMapping(value = "/completeSoftwareRequirements")
    public String completeSoftwareRequirements (HttpServletRequest request) throws Exception{
        Integer id;
        try {
            id = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "redirect:/normal/showSoftwareRequirements";
        }
        //ID为空则返回
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        //获取当前物资申购问题
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsService.findById(id);
        if (softwareRequirementsCustom == null) {
            throw new CustomException("抱歉，未找到该软件需求相关信息");
        }
        //相关数据转换
        String handling_comments = request.getParameter("handling_comments");
        String info_comments = request.getParameter("info_comments");
        String acceptance_description = request.getParameter("acceptance_description");
        String feedback = request.getParameter("feedback");
        int time_required = 0;
        int acceptance_type = 0;
        try {
            time_required = Integer.parseInt(request.getParameter("time_required"));
            acceptance_type = Integer.parseInt(request.getParameter("acceptance_type"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        //封装数据
        Map<String, Object> thisData =new HashMap<String, Object>();
        thisData.put("handling_comments",handling_comments);
        thisData.put("info_comments",info_comments);
        thisData.put("acceptance_description",acceptance_description);
        thisData.put("feedback",feedback);
        thisData.put("time_required",time_required);
        thisData.put("acceptance_type",acceptance_type);
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        SoftwareRequirementsComplete softwareRequirementsComplete = new SoftwareRequirementsComplete();
        softwareRequirementsComplete.setMap(thisData);
        softwareRequirementsComplete.setSoftwareRequirementsCustom(softwareRequirementsCustom);
        softwareRequirementsComplete.setSubject(subject);

        SoftwareRequirementsComplete result = this.softwareRequirementsComplete(softwareRequirementsComplete);


        return result.getReturnAction();
    }

    // 软件需求处理完成操作
    public  SoftwareRequirementsComplete softwareRequirementsComplete(SoftwareRequirementsComplete softwareRequirementsComplete)throws Exception{
        Map<String, Object> thisData = softwareRequirementsComplete.getMap();
        Subject subject = softwareRequirementsComplete.getSubject();
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsComplete.getSoftwareRequirementsCustom();
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        String handling_comments = thisData.get("handling_comments").toString();
        String info_comments = thisData.get("info_comments").toString();
        String acceptance_description = thisData.get("acceptance_description").toString();
        String feedback = thisData.get("feedback").toString();
        int time_required = Integer.parseInt(thisData.get("time_required").toString());
        int acceptance_type = Integer.parseInt(thisData.get("acceptance_type").toString());

        if(subject.hasRole("software")){
            //软件需求为处理状态时才允许软件组完成
            if(softwareRequirementsCustom.getFlag() == 1){
                //软件组可处理标识位为1时才允许软件组处理
                if(softwareRequirementsCustom.getGroupVisible() == 1){
                    softwareRequirementsCustom.setFlag(2);
                    //更新该软件需求问题数据
                    softwareRequirementsCustom.setHandlingComments(handling_comments);
                    softwareRequirementsCustom.setInfoComments(info_comments);
                    softwareRequirementsCustom.setTimeRequired(time_required);
                    softwareRequirementsCustom.setAcceptanceType(acceptance_type);
                    softwareRequirementsCustom.setAcceptanceDescription(acceptance_description);
                    //设置完成时间
                    Date currentTime = new Date();
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dateString = formatter.format(currentTime);
                    softwareRequirementsCustom.setDoneTime(dateString);

                    softwareRequirementsService.updataById(softwareRequirementsCustom.getId(), softwareRequirementsCustom);
                    //保存该记录相关数据以便产生推送
                    try {
                        //创建推送消息
                        PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","4",
                                "2","47");
                        try {
                            pushMessageService.save(pushMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //向申报人推送消息
                        messagePushUtil.specifiedPushSingle(pushMessage,softwareRequirementsCustom.getApplicantId());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    softwareRequirementsComplete.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
                }else{
                    softwareRequirementsComplete.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
                }

            }else{
                softwareRequirementsComplete.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
            }
        }else if(subject.hasRole("examiner")) {
            if (softwareRequirementsCustom.getFlag() != 2 ) {
                softwareRequirementsCustom.setFlag(2);
                //更新该软件需求问题数据
                softwareRequirementsCustom.setHandlingComments(handling_comments);
                softwareRequirementsCustom.setInfoComments(info_comments);
                softwareRequirementsCustom.setTimeRequired(time_required);
                softwareRequirementsCustom.setAcceptanceType(acceptance_type);
                softwareRequirementsCustom.setAcceptanceDescription(acceptance_description);
                //设置完成时间
                Date currentTime = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateString = formatter.format(currentTime);
                softwareRequirementsCustom.setDoneTime(dateString);

                softwareRequirementsService.updataById(softwareRequirementsCustom.getId(), softwareRequirementsCustom);
                //保存该记录相关数据以便产生推送
                try {
                    //创建推送消息
                    PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","4",
                            "2","47");
                    try {
                        pushMessageService.save(pushMessage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //向申报人推送消息
                    messagePushUtil.specifiedPushSingle(pushMessage,softwareRequirementsCustom.getApplicantId());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                softwareRequirementsComplete.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
            } else {
                softwareRequirementsComplete.setReturnAction("redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId());
            }
        }
        return softwareRequirementsComplete;
    }

    // 预推送软件需求页面显示
    @RequestMapping(value = "/prePushSoftwareRequirements", method = {RequestMethod.GET})
    public String prePushSoftwareRequirements(HttpServletRequest request, Model modelV) throws Exception {

        Integer requirements_id;
        try {
            requirements_id = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            modelV.addAttribute("message", "软件需求记录获取失败");
            return "error";
        }
        String requirements_feedback = request.getParameter("infoComments");
        //获取院领导列表
        List<Role> deans = new ArrayList<>();
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        //非审查组不允许推送
        if(!subject.hasRole("examiner")){
            return "redirect:/normal/showSoftwareRequirements";
        }
        try {
            deans = roleService.findByDean();
        } catch (Exception e) {
            e.printStackTrace();
            modelV.addAttribute("message", "院领导列表获取失败");
            return "error";
        }
        //不更新,发送到 push 进行处理
        modelV.addAttribute("requirements_id",requirements_id);
        modelV.addAttribute("requirements_feedback",requirements_feedback);
        modelV.addAttribute("deans", deans);
        //返回角色对象
        modelV.addAttribute("roles",this.getRoles(subject));
        return "normal/prePushSoftwareRequirements";
    }

    // 推送软件需求审批
    @RequestMapping(value = "/pushSoftwareRequirements")
    public String pushSoftwareRequirements(HttpServletRequest request,Model modelV) throws Exception {

        Integer id;
        try {
            id = Integer.parseInt(request.getParameter("requirements_id"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            modelV.addAttribute("message", "物资申购记录获取失败");
            return "error";
        }
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        String feedback = request.getParameter("requirements_feedback");
        //获取院领导工号
        String viceDean = request.getParameter("dpDean");

        //获取当前物资申购问题
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsService.findById(id);
        if (softwareRequirementsCustom == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }
        //申购处理完毕不能再推送
        if(softwareRequirementsCustom.getFlag() == 2){
            modelV.addAttribute("message", "该申购处理完毕，不能再推送");
            return "error";
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        //非审查组不允许推送
        if(!subject.hasRole("examiner")){
            return "redirect:/normal/showSoftwareRequirements";
        }
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);
        //更新该物资申购问题数据
        softwareRequirementsCustom.setInfoComments(feedback);
        softwareRequirementsCustom.setFlag(1);
        //保存该记录相关数据以便产生推送
        try {
            //创建推送消息
            PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","1",
                    "2","24");
            try {
                pushMessageService.save(pushMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //向申报人推送消息
            messagePushUtil.specifiedPushSingle(pushMessage,softwareRequirementsCustom.getApplicantId());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(!viceDean.equals("-1")){
            //设置院领导审核标识、分管院长审核标识、分管院长ID
            softwareRequirementsCustom.setHighApproved(1);
            softwareRequirementsCustom.setHighLeaderId1(viceDean);
            softwareRequirementsCustom.setHighLeaderApproved1(1);

            //保存该记录相关数据以便产生推送
            try {
                //创建推送消息
                PushMessage pushMessage = createPushUtil.createPreMessage(viewEmployeeMiPsd.getCode(),"0","1",
                        "2","48");
                try {
                    pushMessageService.save(pushMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //向分管院长推送消息
                messagePushUtil.specifiedPushSingle(pushMessage,viceDean);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        softwareRequirementsService.updataById(softwareRequirementsCustom.getId(), softwareRequirementsCustom);
        //重定向
        return "redirect:/normal/showSoftwareRequirements";
    }

    // 软件需求审批拒绝
    @RequestMapping(value = "/denySoftwareRequirements", method = {RequestMethod.GET})
    public String denySoftwareRequirements(HttpServletRequest request) throws Exception {

        String feedback = request.getParameter("feedback");
        Integer id = Integer.parseInt(request.getParameter("id"));
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsService.findById(id);
        if (softwareRequirementsCustom == null) {
            throw new CustomException("抱歉，未找到该软件需求相关信息");
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        //权限不对则返回
        if(!subject.hasRole("dpdean")){
            return "redirect:/normal/showSoftwareRequirements";
        }
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        //分管院长审批
        softwareRequirementsCustom.setApprovedFlag(2);
        softwareRequirementsCustom.setHighLeaderReback1(feedback);
        softwareRequirementsCustom.setHighLeaderName1(viewEmployeeMiPsd.getName());
        softwareRequirementsCustom.setHighLeaderFlag1(2);
        softwareRequirementsCustom.setFlag(2);
        //设置完成时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        softwareRequirementsCustom.setDoneTime(dateString);
        softwareRequirementsService.updataById(softwareRequirementsCustom.getId(), softwareRequirementsCustom);

        //保存该记录相关数据以便产生推送
        try {
            //创建推送消息
            PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","1",
                    "4","44");
            try {
                pushMessageService.save(pushMessage);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            //向申报人推送消息
            messagePushUtil.specifiedPushSingle(pushMessage,softwareRequirementsCustom.getApplicantId());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return "redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId();
    }

    // 软件需求审批通过
    @RequestMapping(value = "/passSoftwareRequirements", method = {RequestMethod.GET})
    public String passSoftwareRequirements(HttpServletRequest request) throws Exception {

        String feedback = request.getParameter("feedback");
        Integer id = Integer.parseInt(request.getParameter("id"));
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        SoftwareRequirementsCustom softwareRequirementsCustom = softwareRequirementsService.findById(id);
        if (softwareRequirementsCustom == null) {
            throw new CustomException("抱歉，未找到该软件需求相关信息");
        }
        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        //权限不对则返回
        if(!subject.hasRole("dpdean")){
            return "redirect:/normal/showSoftwareRequirements";
        }
        ViewEmployeeMiPsd viewEmployeeMiPsd = this.subjectToViewEmployeeMiPsd(subject);

        //分管院长审批
        softwareRequirementsCustom.setApprovedFlag(1);
        softwareRequirementsCustom.setHighLeaderReback1(feedback);
        softwareRequirementsCustom.setHighLeaderName1(viewEmployeeMiPsd.getName());
        softwareRequirementsCustom.setHighLeaderFlag1(1);
        softwareRequirementsCustom.setFlag(1);
        //软件组可处理标识位 置1
        softwareRequirementsCustom.setGroupVisible(1);

        //设置完成时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        softwareRequirementsCustom.setDoneTime(dateString);
        softwareRequirementsService.updataById(softwareRequirementsCustom.getId(), softwareRequirementsCustom);

        //保存该记录相关数据以便产生推送
        try {
            //创建推送消息
            PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","1",
                    "4","45");
            try {
                pushMessageService.save(pushMessage);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
            //向申报人推送消息
            messagePushUtil.specifiedPushSingle(pushMessage,softwareRequirementsCustom.getApplicantId());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        try {
            //创建推送消息
            PushMessage pushMessage = createPushUtil.createPreMessage(softwareRequirementsCustom.getApplicantId(),"0","1",
                    "0","49");
            try {
                pushMessageService.save(pushMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //向处理组推送消息
            messagePushUtil.groupPushSingle(pushMessage,"software");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:editSoftwareRequirements?id=" + softwareRequirementsCustom.getId();
    }

    // 打印软件需求表单
    @RequestMapping(value = "/printSoftwareRequirements", method = {RequestMethod.GET})
    public String printSoftwareRequirements(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/normal/showSoftwareRequirements";
        }
        SoftwareRequirements softwareRequirements = softwareRequirementsService.findById(id);
        if (softwareRequirements == null) {
            throw new CustomException("抱歉，未找到该物资申购相关信息");
        }

        model.addAttribute("softwareRequirements", softwareRequirements);
        //返回角色对象
        Subject subject = SecurityUtils.getSubject();
        model.addAttribute("roles",this.getRoles(subject));


        return "normal/printSoftwareRequirements";
    }

    //endregion
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<JSON数据获取>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //region
    //返回电脑故障类型列表JSON
    @RequestMapping(value = "/getProblemsTypeList")
    @ResponseBody
    private Map<String, Object> getProblemsTypeList(String mainType) throws Exception {
        Map<String, Object> map =new HashMap<String, Object>();
        List<ComputerProblemsType> computerProblemsTypeList = new ArrayList<>();
        try {
            computerProblemsTypeList = computerProblemsTypeService.getSecondaryList(mainType);
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
    //endregion
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
            Logger logger = Logger.getLogger(NormalController.class.getName());
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
                Logger logger = Logger.getLogger(NormalController.class.getName());
                logger.error("用户获取失败：可能是本地库连接失败",e);
            }
            e.printStackTrace();
            //获取日志记录器，这个记录器将负责控制日志信息
            Logger logger = Logger.getLogger(NormalController.class.getName());
            logger.error("用户获取失败：可能是HIS库连接失败，将切换到备用库",e);
        }
        return viewEmployeeMiPsd;
    }
    //endregion
}
