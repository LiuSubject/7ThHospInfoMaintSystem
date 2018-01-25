package com.system.operate;

import com.system.po.MaterialApplicationCustom;
import org.apache.shiro.subject.Subject;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationDeny
 * 类描述：物资申购拒绝操作类
 * 创建人：lxk
 * 创建时间：2018-01-25 13:54
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class MaterialApplicationDeny {
    //拒绝人ID
    private Integer id;
    //拒绝人意见
    private String feedback;
    //当前操作用户
    private Subject subject;
    //物资申购记录
    private MaterialApplicationCustom materialApplicationCustom;
    //返回地址
    private String denyAction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

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
}
