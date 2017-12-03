package com.system.po;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：ComputerProblems
 * 类描述：电脑故障（pojo）
 * 创建人：lxk
 * 创建时间：2017-12-3 14:21:41
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/

public class ComputerProblems {
    private Integer id;

    private String title;

    private String userid;

    private String name;

    private String dept;

    private String departcode;

    private String tel;

    private String detail;

    private String img;

    private Integer flag;

    private Integer type;

    private String leader;

    private String reback;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getDepartcode() {
        return departcode;
    }

    public void setDepartcode(String departcode) {
        this.departcode = departcode == null ? null : departcode.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getReback() {
        return reback;
    }

    public void setReback(String reback) {
        this.reback = reback == null ? null : reback.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerProblems)) return false;

        ComputerProblems that = (ComputerProblems) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) return false;
        if (getUserid() != null ? !getUserid().equals(that.getUserid()) : that.getUserid() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getDept() != null ? !getDept().equals(that.getDept()) : that.getDept() != null) return false;
        if (getDepartcode() != null ? !getDepartcode().equals(that.getDepartcode()) : that.getDepartcode() != null)
            return false;
        if (getTel() != null ? !getTel().equals(that.getTel()) : that.getTel() != null) return false;
        if (getDetail() != null ? !getDetail().equals(that.getDetail()) : that.getDetail() != null) return false;
        if (getImg() != null ? !getImg().equals(that.getImg()) : that.getImg() != null) return false;
        if (getFlag() != null ? !getFlag().equals(that.getFlag()) : that.getFlag() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getLeader() != null ? !getLeader().equals(that.getLeader()) : that.getLeader() != null) return false;
        if (getReback() != null ? !getReback().equals(that.getReback()) : that.getReback() != null) return false;
        return getCreateTime() != null ? getCreateTime().equals(that.getCreateTime()) : that.getCreateTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getUserid() != null ? getUserid().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDept() != null ? getDept().hashCode() : 0);
        result = 31 * result + (getDepartcode() != null ? getDepartcode().hashCode() : 0);
        result = 31 * result + (getTel() != null ? getTel().hashCode() : 0);
        result = 31 * result + (getDetail() != null ? getDetail().hashCode() : 0);
        result = 31 * result + (getImg() != null ? getImg().hashCode() : 0);
        result = 31 * result + (getFlag() != null ? getFlag().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getLeader() != null ? getLeader().hashCode() : 0);
        result = 31 * result + (getReback() != null ? getReback().hashCode() : 0);
        result = 31 * result + (getCreateTime() != null ? getCreateTime().hashCode() : 0);
        return result;
    }
}