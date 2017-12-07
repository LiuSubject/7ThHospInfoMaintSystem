package com.system.controller;

import com.system.po.ViewEmployeeMiPsd;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：LoginController
 * 类描述：登录请求拦截器
 * 创建人：lxk
 * 创建时间：2017-12-3 14:06:16
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Controller
public class LoginController {

    //登录跳转
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String loginUI() throws Exception {
        return "../../login";
    }

    //登录表单处理
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(ViewEmployeeMiPsd viewEmployeeMiPsd) throws Exception {

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
        }


        if (subject.hasRole("admin")) {
            return "redirect:/admin/showComputerProblems";
        } else if (!subject.hasRole("admin")) {
            return "redirect:/normal/showComputerProblems";
        }

        return "/login";
    }

}
