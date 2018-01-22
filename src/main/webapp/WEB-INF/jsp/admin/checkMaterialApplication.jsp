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
<meta http-equiv="X-UA-Compatible" content="IE=9"/>
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
                        <h2 style="text-align: center;">${materialApplication.name}</h2>
                    </div>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="/admin/editMaterialApplication" id="editfrom"
                          method="post">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">申请人：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="applicant" name="applicant"
                                       value="${materialApplication.applicant}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">使用日期：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="useDate" name="useDate"
                                       value="${materialApplication.useDate}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">名称：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="name" name="name"
                                       value="${materialApplication.name}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">数量：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="number" name="number"
                                       value="${materialApplication.number}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">请购理由：</label>
                            <div class="col-sm-8">
                                </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">品牌：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="brand" name="brand"
                                       value="${materialApplication.brand}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">参考型号：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="model" name="model"
                                       value="${materialApplication.model}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">估价：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="judge" name="judge"
                                       value="${materialApplication.judge}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">总价：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="total" name="total"
                                       value="${materialApplication.total}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">信息科意见：</label>
                            <div class="col-sm-8">
                                <textarea  type="text" class="form-control" rows="5" id="xxkyj" name="xxkyj" readonly="readonly">${materialApplication.xxkyj}</textarea>
                            </div>
                        </div>
                        <c:if test="${materialApplication.highLeaderApproved1 == 1}">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" style="text-align: center">分管院长审查意见：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="highLeaderReback1" name="highLeaderReback1"
                                           value="${materialApplication.highLeaderReback1}" readonly="readonly">
                                </div>
                            </div>
                        </c:if>
                        <c:if test="${materialApplication.highLeaderApproved2 == 1}">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" style="text-align: center">信息主管副院长审批：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="highLeaderReback2" name="highLeaderReback2"
                                           value="${materialApplication.highLeaderReback2}" readonly="readonly">
                                </div>
                            </div>
                        </c:if>
                        <c:if test="${materialApplication.highLeaderApproved3 == 1}">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">院长审批：</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="highLeaderReback3" name="highLeaderReback3"
                                           value="${materialApplication.highLeaderReback3}" readonly="readonly">
                                </div>
                            </div>
                        </c:if>
                        <c:if test="${materialApplication.highApproved == 1}">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">审批结果：</label>
                                <div class="col-sm-8">
                                    <c:if test="${materialApplication.approvedFlag == 0}">
                                        <td><button class="btn btn-warning btn-sm" type="button">审批中</button></td>
                                    </c:if>
                                    <c:if test="${materialApplication.approvedFlag == 1}">
                                        <td><button class="btn btn-success btn-sm" type="button">通过</button></td>
                                    </c:if>
                                    <c:if test="${materialApplication.approvedFlag == 2}">
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
                    <div id="timeLine" style="display: none">
                        <ul class="timeline col-sm-10">
                            <li class="alt_warn">
                                <div class="number">
                                    提交
                                </div>
                                <div class="content">
                                    <pre>${fn:trim(materialApplication.applicant)}<br>${fn:trim(materialApplication.createTime)}<br><hr class="hr0" />${fn:trim(materialApplication.name)}:<br>${fn:trim(materialApplication.reason)}<br></pre>
                                </div>
                            </li>
                            <c:if test="${materialApplication.highApproved == 1}">
                                <li class="alt_approve">
                                        <%--审批标识--%>
                                    <div class="number">
                                        审批
                                    </div>
                                    <div class="content">
                                        <c:if test="${materialApplication.approvedFlag == 0 }">
                                            <pre>审批中</pre>
                                        </c:if>
                                        <c:if test="${materialApplication.approvedFlag == 1 }">
                                            <pre>审批通过</pre>
                                        </c:if>
                                        <c:if test="${materialApplication.approvedFlag == 2 }">
                                            <pre>审批不通过</pre>
                                        </c:if>

                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${materialApplication.feedbackId1 != null && materialApplication.feedbackId1 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <pre>${fn:trim(materialApplication.feedbackName1)}<br>${fn:trim(materialApplication.feedbackTime1)}<br><hr class="hr0" />${fn:trim(materialApplication.feedbackContent1)}<br></pre>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${materialApplication.feedbackId2 != null && materialApplication.feedbackId2 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <pre>${fn:trim(materialApplication.feedbackName2)}<br>${fn:trim(materialApplication.feedbackTime2)}<br><hr class="hr0" />${fn:trim(materialApplication.feedbackContent2)}<br></pre>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${materialApplication.feedbackId3 != null && materialApplication.feedbackId3 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <pre>${fn:trim(materialApplication.feedbackName3)}<br>${fn:trim(materialApplication.feedbackTime3)}<br><hr class="hr0" />${fn:trim(materialApplication.feedbackContent3)}<br></pre>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${materialApplication.feedbackId4 != null && materialApplication.feedbackId4 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <pre>${fn:trim(materialApplication.feedbackName4)}<br>${fn:trim(materialApplication.feedbackTime4)}<br><hr class="hr0" />${fn:trim(materialApplication.feedbackContent4)}<br></pre>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${materialApplication.feedbackId5 != null && materialApplication.feedbackId5 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <pre>${fn:trim(materialApplication.feedbackName5)}<br>${fn:trim(materialApplication.feedbackTime5)}<br><hr class="hr0" />${fn:trim(materialApplication.feedbackContent5)}<br></pre>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test="${materialApplication.flag != 2}">
                                <%--待完成标识--%>
                                <li class="alt_wait">
                                    <div class="number">
                                    </div>
                                    <div class="content_wait">
                                        <pre></pre>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test="${materialApplication.flag == 2}">
                                <li class="alt_success">
                                    <div class="number">
                                        反馈
                                    </div>
                                    <div class="content">
                                        <pre>${fn:trim(materialApplication.leaderName)}<br>${fn:trim(materialApplication.doneTime)}<br><hr class="hr0" />${fn:trim(materialApplication.reback)}<br></pre>
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


    //返回按钮点击
    $('#returnListBtn').on('click', function () {
        window.location.href = "/admin/showMaterialApplication";
    });

    //打印按钮点击
    $('#printBtn').on('click', function () {
        var herf = "/admin/printMaterialApplication?id="+${materialApplication.id};
        window.location.href = herf;
    });

    //时间轴缩放
    $("#slideToggle").click(function() {
        $("#timeLine").slideToggle();
    });


</script>
</html>