package com.system.operate;

import com.system.po.ComputerProblemsCustom;
import com.system.po.PagingVO;
import org.apache.shiro.subject.Subject;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsList
 * 类描述：电脑故障列表查询类
 * 创建人：lxk
 * 创建时间：2018-01-23 14:01
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class ComputerProblemsList {
    //当前操作对象
    private Subject subject;
    //查询结果
    private List<ComputerProblemsCustom> computerProblemsList;
    //查询结果页码对象
    private PagingVO pagingVO;

    public List<ComputerProblemsCustom> getComputerProblemsList() {
        return computerProblemsList;
    }

    public void setComputerProblemsList(List<ComputerProblemsCustom> computerProblemsList) {
        this.computerProblemsList = computerProblemsList;
    }

    public PagingVO getPagingVO() {
        return pagingVO;
    }

    public void setPagingVO(PagingVO pagingVO) {
        this.pagingVO = pagingVO;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
