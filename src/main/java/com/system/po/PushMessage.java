package com.system.po;

public class PushMessage {
    private Integer id;
    //创建人工号
    private String founder;
    //创建时间
    private String createTime;
    //推送状态："0"为未发送,"1"为已发送
    private String pushStatus;
    //推送方式："0"为透传
    private String pushWay;
    //消息类型："0"为电脑故障，"1"为物资申购，"2"为机房巡检
    private String msgType;
    //消息目标："0"为管理用户组，"1"为普通用户组
    private String msgTarget;
    //消息部分1
    private String msgContent1;
    //消息部分2
    private String msgContent2;
    //消息部分3
    private String msgContent3;
    //发送时间
    private String pushTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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