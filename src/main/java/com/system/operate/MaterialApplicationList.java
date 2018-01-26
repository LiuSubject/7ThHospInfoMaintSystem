package com.system.operate;

import com.system.po.ComputerProblemsCustom;
import com.system.po.MaterialApplicationCustom;
import com.system.po.PagingVO;
import org.apache.shiro.subject.Subject;

import java.util.List;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：MaterialApplicationList
 * 类描述：物资申购列表查询操作类
 * 创建人：lxk
 * 创建时间：2018-01-26 9:21
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class MaterialApplicationList {
    //当前操作用户
    private Subject subject;
    //查询结果
    List<MaterialApplicationCustom> materialApplicationsList;
    //查询结果页码对象
    private PagingVO pagingVO;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<MaterialApplicationCustom> getMaterialApplicationsList() {
        return materialApplicationsList;
    }

    public void setMaterialApplicationsList(List<MaterialApplicationCustom> materialApplicationsList) {
        this.materialApplicationsList = materialApplicationsList;
    }

    public PagingVO getPagingVO() {
        return pagingVO;
    }

    public void setPagingVO(PagingVO pagingVO) {
        this.pagingVO = pagingVO;
    }
}
