package com.system.operate;

import com.system.po.ComputerProblemsCustom;
import com.system.po.PagingVO;
import org.apache.shiro.subject.Subject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblemsSearch
 * 类描述：电脑故障列搜索操作类
 * 创建人：lxk
 * 创建时间：2018-01-24 9:18
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class ComputerProblemsSearch {
    //当前操作用户
    private Subject subject;
    //查询结果
    private List<ComputerProblemsCustom> computerProblemsList;
    //查询结果页码对象
    private PagingVO pagingVO;
    //查询条件
    Map<String, Object> map =new HashMap<String, Object>();

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

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

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
