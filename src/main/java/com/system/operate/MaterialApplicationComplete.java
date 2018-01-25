package com.system.operate;

import com.system.po.MaterialApplicationCustom;
import org.apache.shiro.subject.Subject;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationComplete
 * 类描述：物资申购处理完成操作类
 * 创建人：lxk
 * 创建时间：2018-01-25 22:46
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class MaterialApplicationComplete {
    //待处理数据
    Map<String, Object> map =new HashMap<String, Object>();
    //当前操作用户
    private Subject subject;
    //物资申购记录
    private MaterialApplicationCustom materialApplicationCustom;
    //返回地址
    private String completeAction;


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

    public String getCompleteAction() {
        return completeAction;
    }

    public void setCompleteAction(String completeAction) {
        this.completeAction = completeAction;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
