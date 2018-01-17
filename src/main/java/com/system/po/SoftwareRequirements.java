package com.system.po;

public class SoftwareRequirements {
    private Integer id;

    private Integer cpLinkId;

    private Integer requireNo;

    private String deptCode;

    private String dept;

    private String applicantName;

    private String applicantId;

    private String applicantTime;

    private String applicantModule;

    private Integer requireType;

    private String details;

    private String proposer;

    private String handlingComments;

    private String developer;

    private Integer acceptanceType;

    private String acceptanceDescription;

    private String managementLeader;

    private String hospitalLeader;

    private String other1;

    private String other2;

    private String other3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpLinkId() {
        return cpLinkId;
    }

    public void setCpLinkId(Integer cpLinkId) {
        this.cpLinkId = cpLinkId;
    }

    public Integer getRequireNo() {
        return requireNo;
    }

    public void setRequireNo(Integer requireNo) {
        this.requireNo = requireNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName == null ? null : applicantName.trim();
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId == null ? null : applicantId.trim();
    }

    public String getApplicantTime() {
        return applicantTime;
    }

    public void setApplicantTime(String applicantTime) {
        this.applicantTime = applicantTime == null ? null : applicantTime.trim();
    }

    public String getApplicantModule() {
        return applicantModule;
    }

    public void setApplicantModule(String applicantModule) {
        this.applicantModule = applicantModule == null ? null : applicantModule.trim();
    }

    public Integer getRequireType() {
        return requireType;
    }

    public void setRequireType(Integer requireType) {
        this.requireType = requireType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public String getHandlingComments() {
        return handlingComments;
    }

    public void setHandlingComments(String handlingComments) {
        this.handlingComments = handlingComments == null ? null : handlingComments.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public Integer getAcceptanceType() {
        return acceptanceType;
    }

    public void setAcceptanceType(Integer acceptanceType) {
        this.acceptanceType = acceptanceType;
    }

    public String getAcceptanceDescription() {
        return acceptanceDescription;
    }

    public void setAcceptanceDescription(String acceptanceDescription) {
        this.acceptanceDescription = acceptanceDescription == null ? null : acceptanceDescription.trim();
    }

    public String getManagementLeader() {
        return managementLeader;
    }

    public void setManagementLeader(String managementLeader) {
        this.managementLeader = managementLeader == null ? null : managementLeader.trim();
    }

    public String getHospitalLeader() {
        return hospitalLeader;
    }

    public void setHospitalLeader(String hospitalLeader) {
        this.hospitalLeader = hospitalLeader == null ? null : hospitalLeader.trim();
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3 == null ? null : other3.trim();
    }
}