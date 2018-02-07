package com.system.operate;

import com.system.po.PagingVO;
import com.system.po.SoftwareRequirementsCustom;
import org.apache.shiro.subject.Subject;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：SoftwareRequirementsList
 * 类描述：软件需求列表查询操作类
 * 创建人：lxk
 * 创建时间：2018-02-07 16:02
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class SoftwareRequirementsList {
    //当前操作用户
    private Subject subject;
    //查询结果
    private List<SoftwareRequirementsCustom> softwareRequirementsList;
    //查询结果页码对象
    private PagingVO pagingVO;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<SoftwareRequirementsCustom> getSoftwareRequirementsList() {
        return softwareRequirementsList;
    }

    public void setSoftwareRequirementsList(List<SoftwareRequirementsCustom> softwareRequirementsList) {
        this.softwareRequirementsList = softwareRequirementsList;
    }

    public PagingVO getPagingVO() {
        return pagingVO;
    }

    public void setPagingVO(PagingVO pagingVO) {
        this.pagingVO = pagingVO;
    }
}
