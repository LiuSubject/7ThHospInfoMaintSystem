<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <title></title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <!-- 引入时间轴 -->
    <link rel="stylesheet" type="text/css" href="/css/timeline.css">
    <!-- 引入JQuery  bootstrap.js-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <style type="text/css">
        .Urgent {
            color: #c9302c;
        }
        /*分割线*/
        .hr0{
            height:1px;border:none;border-top:1px dashed #cccccc;
        }

        body {
            overflow-y: scroll;
        }
    </style>
</head>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1"/>

<script type="text/javascript" src="/js/jquery-1.11.1.min.js"></script>
<script src="/js/html5shiv.min.js"></script>
<script src="/js/respond.min.js"></script>
<script type="text/javascript" src="/js/jquery.placeholder.js"></script>
<![endif]-->
<!--[if IE 9]>
<script type="text/javascript" src="/js/jquery.placeholder.js"></script>
<![endif]-->
<body>
<!-- 顶栏 -->
<jsp:include page="top.jsp"></jsp:include>
<!-- 中间主体 -->
<div class="container" id="content">
    <div class="row">
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="col-md-10">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <div class="row">
                        <h2 id="softwareRequirementsName" style="text-align: center;">软件修改需求</h2>
                    </div>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="/admin/editSoftwareRequirements" id="editfrom"
                          method="post">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">申请人：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="applicant" name="applicant"
                                       value="${softwareRequirements.applicant}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">使用日期：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="useDate" name="useDate"
                                       value="${softwareRequirements.useDate}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">名称：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="name" name="name"
                                       value="${softwareRequirements.name}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">数量：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="number" name="number"
                                       value="${softwareRequirements.number}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">请购理由：</label>
                            <div class="col-sm-8">
                                <textarea  type="text" class="form-control" rows="5" id="reason" name="reason" readonly="readonly">${softwareRequirements.reason}</textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">申请科室意见：</label>
                            <div class="col-sm-8">
                                <textarea  type="text" class="form-control" rows="5" id="bmyj" name="bmyj" readonly="readonly">${softwareRequirements.bmyj}</textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">品牌：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="brand" name="brand"
                                       value="${softwareRequirements.brand}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">参考型号：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="model" name="model"
                                       value="${softwareRequirements.model}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">估价：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="judge" name="judge"
                                       value="${softwareRequirements.judge}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">总价：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="total" name="total"
                                       value="${softwareRequirements.total}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">信息科意见：</label>
                            <div class="col-sm-8">
                                <textarea  type="text" class="form-control" rows="5" id="xxkyj" name="xxkyj" readonly="readonly">${softwareRequirements.xxkyj}</textarea>
                            </div>
                        </div>
                        <c:if test="${softwareRequirements.highLeaderApproved1 == 1}">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" style="text-align: center">主管院长审查意见：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="highLeaderReback1" name="highLeaderReback1"
                                           value="${softwareRequirements.highLeaderReback1}" readonly="readonly">
                                </div>
                            </div>
                        </c:if>
                        <c:if test="${softwareRequirements.highApproved == 1}">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">审批结果：</label>
                                <div class="col-sm-8">
                                    <c:if test="${softwareRequirements.approvedFlag == 0}">
                                        <td><button class="btn btn-warning btn-sm" type="button">审批中</button></td>
                                    </c:if>
                                    <c:if test="${softwareRequirements.approvedFlag == 1}">
                                        <td><button class="btn btn-success btn-sm" type="button">通过</button></td>
                                    </c:if>
                                    <c:if test="${softwareRequirements.approvedFlag == 2}">
                                        <td><button class="btn btn-info btn-sm" type="button">否定</button></td>
                                    </c:if>
                                </div>
                            </div>
                        </c:if>
                        <div class="form-group" style="text-align: center">
                            <button class="btn btn-default" id="printBtn" type="button">打印预览</button>
                            <button class="btn btn-default" id="returnListBtn" type="button">返回</button>
                        </div>
                    </form>
                    <div id="slideToggle">
                        <hr class="hr0" />

                        <h3 style="text-align: center;">处理详情</h3>
                        <hr class="hr0" />

                    </div>
                    <div id="timeLine">
                        <ul class="timeline col-sm-10">
                            <li class="alt_warn">
                                <div class="number">
                                    提交
                                </div>
                                <div class="content">
                                    <div>
                                        ${fn:trim(softwareRequirements.applicant)}<br>
                                        ${fn:trim(softwareRequirements.createTime)}<br>
                                        <hr class="hr0" />
                                        ${fn:trim(softwareRequirements.name)}:<br>
                                        ${fn:trim(softwareRequirements.reason)}<br>
                                    </div>
                                </div>
                            </li>
                            <c:if test="${softwareRequirements.highApproved == 1}">
                                <li class="alt_approve">
                                        <%--审批标识--%>
                                    <div class="number">
                                        审批
                                    </div>
                                    <div class="content">
                                        <div>
                                        <c:if test="${softwareRequirements.approvedFlag == 0 }">
                                            审批中
                                        </c:if>
                                        <c:if test="${softwareRequirements.approvedFlag == 1 }">
                                            审批通过
                                        </c:if>
                                        <c:if test="${softwareRequirements.approvedFlag == 2 }">
                                            审批未通过
                                        </c:if>
                                        <hr class="hr0" />
                                        <c:if test="${softwareRequirements.highLeaderApproved1 == 1 }">
                                            分管院长审批意见:<br>
                                            ${fn:trim(softwareRequirements.highLeaderReback1)}<br><br>
                                        </c:if>
                                        <c:if test="${softwareRequirements.highLeaderApproved2 == 1 }">
                                            信息主管院长审批意见:<br>
                                            ${fn:trim(softwareRequirements.highLeaderReback2)}<br><br>
                                        </c:if>
                                        <c:if test="${softwareRequirements.highLeaderApproved3 == 1 }">
                                            院长审批意见:<br>
                                            ${fn:trim(softwareRequirements.highLeaderReback3)}<br><br>
                                        </c:if>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${softwareRequirements.feedbackId1 != null && softwareRequirements.feedbackId1 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                                ${fn:trim(softwareRequirements.feedbackName1)}<br>
                                                ${fn:trim(softwareRequirements.feedbackTime1)}<br>
                                            <hr class="hr0" />
                                                ${fn:trim(softwareRequirements.feedbackContent1)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${softwareRequirements.feedbackId2 != null && softwareRequirements.feedbackId2 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                                ${fn:trim(softwareRequirements.feedbackName2)}<br>
                                                ${fn:trim(softwareRequirements.feedbackTime2)}<br>
                                            <hr class="hr0" />
                                                ${fn:trim(softwareRequirements.feedbackContent2)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${softwareRequirements.feedbackId3 != null && softwareRequirements.feedbackId3 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                                ${fn:trim(softwareRequirements.feedbackName3)}<br>
                                                ${fn:trim(softwareRequirements.feedbackTime3)}<br>
                                            <hr class="hr0" />
                                                ${fn:trim(softwareRequirements.feedbackContent3)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${softwareRequirements.feedbackId4 != null && softwareRequirements.feedbackId4 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                                ${fn:trim(softwareRequirements.feedbackName4)}<br>
                                                ${fn:trim(softwareRequirements.feedbackTime4)}<br>
                                            <hr class="hr0" />
                                                ${fn:trim(softwareRequirements.feedbackContent4)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${softwareRequirements.feedbackId5 != null && softwareRequirements.feedbackId5 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                                ${fn:trim(softwareRequirements.feedbackName5)}<br>
                                                ${fn:trim(softwareRequirements.feedbackTime5)}<br>
                                            <hr class="hr0" />
                                                ${fn:trim(softwareRequirements.feedbackContent5)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test="${softwareRequirements.flag != 2}">
                                <%--待完成标识--%>
                                <li class="alt_wait">
                                    <div class="number">
                                    </div>
                                    <div class="content_wait">
                                        <div></div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test="${softwareRequirements.flag == 2}">
                                <li class="alt_success">
                                    <div class="number">
                                        反馈
                                    </div>
                                    <div class="content">
                                        <div>
                                                ${fn:trim(softwareRequirements.leaderName)}<br>
                                                ${fn:trim(softwareRequirements.doneTime)}<br>
                                            <hr class="hr0" />
                                                ${fn:trim(softwareRequirements.reback)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>

            </div>

        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $("#nav li:nth-child(4)").addClass("active");

    //可处理标识
    if (${softwareRequirements.groupVisible == 1}) {
        $("#softwareRequirementsName").addClass("Urgent");
    }

    //返回按钮点击
    $('#returnListBtn').on('click', function () {
        window.location.href = "/admin/showSoftwareRequirements";
    });

    //打印按钮点击
    $('#printBtn').on('click', function () {
        var herf = "/admin/printSoftwareRequirements?id="+${softwareRequirements.id};
        window.location.href = herf;
    });

    //时间轴缩放
    $("#slideToggle").click(function() {
        $("#timeLine").slideToggle();
    });


</script>
</html>