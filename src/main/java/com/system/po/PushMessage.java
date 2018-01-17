package com.system.po;

public class PushMessage {
    private Integer id;

    private String createCode;

    private String founder;

    private String createTime;

    private String pushStatus;

    private String pushWay;

    private String msgType;

    private String msgTarget;

    private String msgContent1;

    private String msgContent2;

    private String msgContent3;

    private String pushTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode == null ? null : createCode.trim();
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(String pushStatus) {
        this.pushStatus = pushStatus == null ? null : pushStatus.trim();
    }

    public String getPushWay() {
        return pushWay;
    }

    public void setPushWay(String pushWay) {
        this.pushWay = pushWay == null ? null : pushWay.trim();
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getMsgTarget() {
        return msgTarget;
    }

    public void setMsgTarget(String msgTarget) {
        this.msgTarget = msgTarget == null ? null : msgTarget.trim();
    }

    public String getMsgContent1() {
        return msgContent1;
    }

    public void setMsgContent1(String msgContent1) {
        this.msgContent1 = msgContent1 == null ? null : msgContent1.trim();
    }

    public String getMsgContent2() {
        return msgContent2;
    }

    public void setMsgContent2(String msgContent2) {
        this.msgContent2 = msgContent2 == null ? null : msgContent2.trim();
    }

    public String getMsgContent3() {
        return msgContent3;
    }

    public void setMsgContent3(String msgContent3) {
        this.msgContent3 = msgContent3 == null ? null : msgContent3.trim();
    }

    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime == null ? null : pushTime.trim();
    }
}