package com.system.controller.mobile;

import org.ini4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MobileUpdateController
 * 类描述：手机端更新拦截器
 * 创建人：lxk
 * 创建时间：2017-12-28 14:31
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@Controller
public class MobileUpdateController {
    @RequestMapping("/mobileupdate")
    @ResponseBody
    public Map<String, Object> showComputerProblems(HttpServletRequest httpRequest,HttpSession session) throws Exception {

        Map<String, Object> map =ReadIni(httpRequest, session);

        return map;

    }

    public Map<String, Object> ReadIni(HttpServletRequest httpRequest, HttpSession session) throws IOException {
        Wini ini = null;
        String paPath = session.getServletContext().getRealPath("/") ;
        String iniPath = paPath + "update\\appinfo.ini";
        String wgtPath = "http://" + httpRequest.getServerName() //服务器地址
                + ":"
                + httpRequest.getServerPort()           //端口号
                + httpRequest.getContextPath()      //项目名称
                + "/update/update.wgt";
        //String wgtPath = paPath + "update\\update.wgt";
        try {
            ini = new Wini(new File(iniPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Object> map =new HashMap<>();
        try {
            // 加载配置文件
            String version = ini.get("AppInfo", "version");
            map.put("version", version);
            map.put("wgtPath", wgtPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
