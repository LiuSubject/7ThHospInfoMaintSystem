package com.system.operate;

import com.system.po.MaterialApplicationCustom;
import org.apache.shiro.subject.Subject;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationDeal
 * 类描述：物资申购处理操作类
 * 创建人：lxk
 * 创建时间：2018-01-25 19:19
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class MaterialApplicationDeal {


    //待处理数据
    Map<String, Object> map =new HashMap<String, Object>();
    //当前操作用户
    private Subject subject;
    //物资申购记录
    private MaterialApplicationCustom materialApplicationCustom;
    //返回地址
    private String denyAction;


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public MaterialApplicationCustom getMaterialApplicationCustom() {
        return materialApplicationCustom;
    }

    public void setMaterialApplicationCustom(MaterialApplicationCustom materialApplicationCustom) {
        this.materialApplicationCustom = materialApplicationCustom;
    }

    public String getDenyAction() {
        return denyAction;
    }

    public void setDenyAction(String denyAction) {
        this.denyAction = denyAction;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
