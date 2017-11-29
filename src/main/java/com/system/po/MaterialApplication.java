package com.system.po;

/**
 *
 * 项目名称：绍兴第七人民医院信息维护系统
 * 类名称：MaterialApplication
 * 类描述：物资申购pojo
 * 创建人：lxk
 * 创建时间：2017-11-29 14:01:44
 * 修改人：
 * 修改时间：
 * 修改备注：
 * @version
 *
 */

public class MaterialApplication {
    private Integer id;

    private String userid;

    private String name;

    private String dept;

    private String departcode;

    private Integer number;

    private String brand;

    private String model;

    private Integer judge;

    private Integer total;

    private String useDate;

    private String applicant;

    private String reason;

    private String bmyj;

    private String fgyzyj;

    private String xxkyj;

    private String yzyj;

    private Integer flag;

    private String leader;

    private String reback;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getJudge() {
        return judge;
    }

    public void setJudge(Integer judge) {
        this.judge = judge;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate == null ? null : useDate.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getBmyj() {
        return bmyj;
    }

    public void setBmyj(String bmyj) {
        this.bmyj = bmyj == null ? null : bmyj.trim();
    }

    public String getFgyzyj() {
        return fgyzyj;
    }

    public void setFgyzyj(String fgyzyj) {
        this.fgyzyj = fgyzyj == null ? null : fgyzyj.trim();
    }

    public String getXxkyj() {
        return xxkyj;
    }

    public void setXxkyj(String xxkyj) {
        this.xxkyj = xxkyj == null ? null : xxkyj.trim();
    }

    public String getYzyj() {
        return yzyj;
    }

    public void setYzyj(String yzyj) {
        this.yzyj = yzyj == null ? null : yzyj.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
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
}