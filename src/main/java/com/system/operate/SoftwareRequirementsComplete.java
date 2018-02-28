package com.system.operate;

import com.system.po.SoftwareRequirementsCustom;
import org.apache.shiro.subject.Subject;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：SoftwareRequirementsDeal
 * 类描述：软件需求列表完成操作类
 * 创建人：lxk
 * 创建时间：2018-02-08 11:15
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class SoftwareRequirementsComplete {
    //待处理数据
    Map<String, Object> map =new HashMap<String, Object>();
    //当前操作用户
    private Subject subject;
    //物资申购记录
    private SoftwareRequirementsCustom softwareRequirementsCustom;
    //返回地址
    private String returnAction;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public SoftwareRequirementsCustom getSoftwareRequirementsCustom() {
        return softwareRequirementsCustom;
    }

    public void setSoftwareRequirementsCustom(SoftwareRequirementsCustom softwareRequirementsCustom) {
        this.softwareRequirementsCustom = softwareRequirementsCustom;
    }

    public String getReturnAction() {
        return returnAction;
    }

    public void setReturnAction(String returnAction) {
        this.returnAction = returnAction;
    }
}
