package com.system.controller;

import com.system.exception.CustomException;
import com.system.po.*;
import com.system.service.*;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Jacey on 2017/6/30.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @SuppressWarnings("SpringJavaAutowiringInspection")//忽略警告，下同
    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "teacherServiceImpl")
    private TeacherService teacherService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "courseServiceImpl")
    private CourseService courseService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "collegeServiceImpl")
    private CollegeService collegeService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "userloginServiceImpl")
    private UserloginService userloginService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource(name = "computerProblemsServiceImpl")
    private ComputerProblemsService computerProblemsService;


    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<学生操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    //  学生信息显示
    @RequestMapping("/showStudent")
    public String showStudent(Model model, Integer page) throws Exception {

        List<StudentCustom> list = null;
        //页码对象
        PagingVO pagingVO = new PagingVO();
        //设置总页数
        pagingVO.setTotalCount(studentService.getCountStudent());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            list = studentService.findByPaging(1);
        } else {
            pagingVO.setToPageNo(page);
            list = studentService.findByPaging(page);
        }

        model.addAttribute("studentList", list);
        model.addAttribute("pagingVO", pagingVO);

        return "admin/showStudent";

    }

    //  跳转至添加学生信息页面（跳转页面）
    @RequestMapping(value = "/addStudent", method = {RequestMethod.GET})
    public String addStudentUI(Model model) throws Exception {

        List<College> list = collegeService.finAll();

        model.addAttribute("collegeList", list);

        return "admin/addStudent";
    }

     // 完成添加学生信息操作（保存数据）
    @RequestMapping(value = "/addStudent", method = {RequestMethod.POST})
    public String addStudent(StudentCustom studentCustom, Model model) throws Exception {

        Boolean result = studentService.save(studentCustom);

        if (!result) {
            model.addAttribute("message", "学号重复");
            return "error";
        }
        //添加成功后，也添加到登录表
        Userlogin userlogin = new Userlogin();
        userlogin.setUsername(studentCustom.getUserid().toString());
        userlogin.setPassword("123");
        userlogin.setRole(2);
        userloginService.save(userlogin);

        //重定向
        return "redirect:/admin/showStudent";
    }

    // 修改学生信息页面显示
    @RequestMapping(value = "/editStudent", method = {RequestMethod.GET})
    public String editStudentUI(Integer id, Model model) throws Exception {
        if (id == null) {
            //加入没有带学生id就进来的话就返回学生显示页面
            return "redirect:/admin/showStudent";
        }
        StudentCustom studentCustom = studentService.findById(id);
        if (studentCustom == null) {
            throw new CustomException("未找到该名学生");
        }
        List<College> list = collegeService.finAll();

        model.addAttribute("collegeList", list);
        model.addAttribute("student", studentCustom);


        return "admin/editStudent";
    }

    // 修改学生信息处理
    @RequestMapping(value = "/editStudent", method = {RequestMethod.POST})
    public String editStudent(StudentCustom studentCustom) throws Exception {

        studentService.updataById(studentCustom.getUserid(), studentCustom);

        //重定向
        return "redirect:/admin/showStudent";
    }

    // 删除学生
    @RequestMapping(value = "/removeStudent", method = {RequestMethod.GET} )
    private String removeStudent(Integer id) throws Exception {
        if (id == null) {
            //加入没有带学生id就进来的话就返回学生显示页面
            return "admin/showStudent";
        }
        studentService.removeById(id);
        userloginService.removeByName(id.toString());

        return "redirect:/admin/showStudent";
    }

    // 搜索学生
    @RequestMapping(value = "selectStudent", method = {RequestMethod.POST})
    private String selectStudent(String findByName, Model model) throws Exception {

        List<StudentCustom> list = studentService.findByName(findByName);

        model.addAttribute("studentList", list);
        return "admin/showStudent";
    }

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<教师操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    // 教师页面显示
    @RequestMapping("/showTeacher")
    public String showTeacher(Model model, Integer page) throws Exception {

        List<TeacherCustom> list = null;
        //页码对象
        PagingVO pagingVO = new PagingVO();
        //设置总页数
        pagingVO.setTotalCount(teacherService.getCountTeacher());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            list = teacherService.findByPaging(1);
        } else {
            pagingVO.setToPageNo(page);
            list = teacherService.findByPaging(page);
        }

        model.addAttribute("teacherList", list);
        model.addAttribute("pagingVO", pagingVO);

        return "admin/showTeacher";

    }

    // 添加教师信息
    @RequestMapping(value = "/addTeacher", method = {RequestMethod.GET})
    public String addTeacherUI(Model model) throws Exception {

        List<College> list = collegeService.finAll();

        model.addAttribute("collegeList", list);

        return "admin/addTeacher";
    }

    // 添加教师信息处理
    @RequestMapping(value = "/addTeacher", method = {RequestMethod.POST})
    public String addTeacher(TeacherCustom teacherCustom, Model model) throws Exception {

        Boolean result = teacherService.save(teacherCustom);

        if (!result) {
            model.addAttribute("message", "工号重复");
            return "error";
        }
        //添加成功后，也添加到登录表
        Userlogin userlogin = new Userlogin();
        userlogin.setUsername(teacherCustom.getUserid().toString());
        userlogin.setPassword("123");
        userlogin.setRole(1);
        userloginService.save(userlogin);

        //重定向
        return "redirect:/admin/showTeacher";
    }

    // 修改教师信息页面显示
    @RequestMapping(value = "/editTeacher", method = {RequestMethod.GET})
    public String editTeacherUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showTeacher";
        }
        TeacherCustom teacherCustom = teacherService.findById(id);
        if (teacherCustom == null) {
            throw new CustomException("未找到该名教师");
        }
        List<College> list = collegeService.finAll();

        model.addAttribute("collegeList", list);
        model.addAttribute("teacher", teacherCustom);


        return "admin/editTeacher";
    }

    // 修改教师信息页面处理
    @RequestMapping(value = "/editTeacher", method = {RequestMethod.POST})
    public String editTeacher(TeacherCustom teacherCustom) throws Exception {

        teacherService.updateById(teacherCustom.getUserid(), teacherCustom);

        //重定向
        return "redirect:/admin/showTeacher";
    }

    //删除教师
    @RequestMapping("/removeTeacher")
    public String removeTeacher(Integer id) throws Exception {
        if (id == null) {
            //加入没有带教师id就进来的话就返回教师显示页面
            return "admin/showTeacher";
        }
        teacherService.removeById(id);
        userloginService.removeByName(id.toString());

        return "redirect:/admin/showTeacher";
    }

    //搜索教师
    @RequestMapping(value = "selectTeacher", method = {RequestMethod.POST})
    private String selectTeacher(String findByName, Model model) throws Exception {

        List<TeacherCustom> list = teacherService.findByName(findByName);

        model.addAttribute("teacherList", list);
        return "admin/showTeacher";
    }

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<课程操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    // 课程信息显示
    @RequestMapping("/showCourse")
    public String showCourse(Model model, Integer page) throws Exception {

        List<CourseCustom> list = null;
        //页码对象
        PagingVO pagingVO = new PagingVO();
        //设置总页数
        pagingVO.setTotalCount(courseService.getCountCouse());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            list = courseService.findByPaging(1);
        } else {
            pagingVO.setToPageNo(page);
            list = courseService.findByPaging(page);
        }

        model.addAttribute("courseList", list);
        model.addAttribute("pagingVO", pagingVO);

        return "admin/showCourse";

    }

    //添加课程
    @RequestMapping(value = "/addCourse", method = {RequestMethod.GET})
    public String addCourseUI(Model model) throws Exception {

        List<TeacherCustom> list = teacherService.findAll();
        List<College> collegeList = collegeService.finAll();

        model.addAttribute("collegeList", collegeList);
        model.addAttribute("teacherList", list);

        return "admin/addCourse";
    }

    // 添加课程信息处理
    @RequestMapping(value = "/addCourse", method = {RequestMethod.POST})
    public String addCourse(CourseCustom courseCustom, Model model) throws Exception {

        Boolean result = courseService.save(courseCustom);

        if (!result) {
            model.addAttribute("message", "课程号重复");
            return "error";
        }


        //重定向
        return "redirect:/admin/showCourse";
    }

    // 修改教师信息页面显示
    @RequestMapping(value = "/editCourse", method = {RequestMethod.GET})
    public String editCourseUI(Integer id, Model model) throws Exception {
        if (id == null) {
            return "redirect:/admin/showCourse";
        }
        CourseCustom courseCustom = courseService.findById(id);
        if (courseCustom == null) {
            throw new CustomException("未找到该课程");
        }
        List<TeacherCustom> list = teacherService.findAll();
        List<College> collegeList = collegeService.finAll();

        model.addAttribute("teacherList", list);
        model.addAttribute("collegeList", collegeList);
        model.addAttribute("course", courseCustom);


        return "admin/editCourse";
    }

    // 修改教师信息页面处理
    @RequestMapping(value = "/editCourse", method = {RequestMethod.POST})
    public String editCourse(CourseCustom courseCustom) throws Exception {

        courseService.upadteById(courseCustom.getCourseid(), courseCustom);

        //重定向
        return "redirect:/admin/showCourse";
    }

    // 删除课程信息
    @RequestMapping("/removeCourse")
    public String removeCourse(Integer id) throws Exception {
        if (id == null) {
            //加入没有带教师id就进来的话就返回教师显示页面
            return "admin/showCourse";
        }
        courseService.removeById(id);

        return "redirect:/admin/showCourse";
    }

    //搜索课程
    @RequestMapping(value = "selectCourse", method = {RequestMethod.POST})
    private String selectCourse(String findByName, Model model) throws Exception {

        List<CourseCustom> list = courseService.findByName(findByName);

        model.addAttribute("courseList", list);
        return "admin/showCourse";
    }

    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<其他操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    // 普通用户账号密码重置
    @RequestMapping("/userPasswordRest")
    public String userPasswordRestUI() throws Exception {
        return "admin/userPasswordRest";
    }

    // 普通用户账号密码重置处理
    @RequestMapping(value = "/userPasswordRest", method = {RequestMethod.POST})
    public String userPasswordRest(Userlogin userlogin) throws Exception {

        Userlogin u = userloginService.findByName(userlogin.getUsername());

        if (u != null) {
            if (u.getRole() == 0) {
                throw new CustomException("该账户为管理员账户，没法修改");
            }
            u.setPassword(userlogin.getPassword());
            userloginService.updateByName(userlogin.getUsername(), u);
        } else {
            throw new CustomException("没找到该用户");
        }

        return "admin/userPasswordRest";
    }

    // 本账户密码重置
    @RequestMapping("/passwordRest")
    public String passwordRestUI() throws Exception {
        return "admin/passwordRest";
    }

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
    public String addComputerProblemsCustom(ComputerProblemsCustom computerProblemsCustom, Model model,HttpServletRequest request,UploadedImageFile file) throws Exception {

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());

        //文件上传至服务器并保存图片路径
        String name = RandomStringUtils.randomAlphanumeric(10);
        String newFileName = name + ".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);
        newFile.getParentFile().mkdirs();
        file.getPhoto().transferTo(newFile);//.getImage().transferTo(newFile);

        //设置问题初始化时间
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        //无初始时间时赋值
        if(computerProblemsCustom.getCreateTime() == null || computerProblemsCustom.getCreateTime().length() == 0)
        {
            computerProblemsCustom.setCreateTime(dateString);
        }

        //设置问题初始化状态
        computerProblemsCustom.setFlag(0);

        //设置问题所属部门
        computerProblemsCustom.setDept(userlogin.getDepart());

        //设置问题所属部门编码
        computerProblemsCustom.setDepartcode(userlogin.getDepartcode());

        //设置问题所属人员ID
        computerProblemsCustom.setUserid(userlogin.getUsername());

        Boolean result = computerProblemsService.save(computerProblemsCustom);

        if (!result) {
            model.addAttribute("message", "抱歉，故障信息保存失败");
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
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());

        computerProblemsCustom.setLeader(userlogin.getName());

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
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());
        if(computerProblemsCustom.getFlag() == 0){
            //更新该故障问题数据
            computerProblemsCustom.setFlag(1);
            computerProblemsCustom.setLeader(userlogin.getName());
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
            return "redirect:/admin/showComputerProblems";
        }

        //获取当前故障问题
        ComputerProblemsCustom computerProblemsCustom = computerProblemsService.findById(id);
        if (computerProblemsCustom == null) {
            throw new CustomException("抱歉，未找到该故障相关信息");
        }

        //获取当前操作用户对象
        Subject subject = SecurityUtils.getSubject();
        Userlogin userlogin = userloginService.findByName((String) subject.getPrincipal());
        if(computerProblemsCustom.getFlag() == 0){
            //更新该故障问题数据
            computerProblemsCustom.setFlag(2);
            computerProblemsCustom.setLeader(userlogin.getName());
            computerProblemsCustom.setReback(feedback);
            computerProblemsService.updataById(computerProblemsCustom.getId(), computerProblemsCustom);
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
    private String searchComputerProblems(String findByDept,String findByName,String findByFlag, Model model) throws Exception {


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
            Integer flag = Integer.parseInt(findByFlag);
            listByFlag = computerProblemsService.findByFlag(flag);
        }



        //合并去重
        listResult.addAll(listByDept);
        listResult.removeAll(listByFlag);
        listResult.addAll(listByFlag);
        listResult.removeAll(listByName);
        listResult.addAll(listByName);

        model.addAttribute("computerProblemsList", listResult);
        return "admin/showComputerProblems";
    }

}
