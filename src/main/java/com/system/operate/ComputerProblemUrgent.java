package com.system.operate;

import com.system.po.ComputerProblemsCustom;
import org.apache.shiro.subject.Subject;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemUrgent
 * 类描述：电脑故障标红操作类
 * 创建人：lxk
 * 创建时间：2018-01-24 8:37
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class ComputerProblemUrgent {
    //当前操作用户
    private Subject subject;
    //当前操作对象
    private ComputerProblemsCustom computerProblemsCustom;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ComputerProblemsCustom getComputerProblemsCustom() {
        return computerProblemsCustom;
    }

    public void setComputerProblemsCustom(ComputerProblemsCustom computerProblemsCustom) {
        this.computerProblemsCustom = computerProblemsCustom;
    }
}
