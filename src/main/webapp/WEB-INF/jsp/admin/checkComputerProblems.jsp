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
        }    </style>
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
                        <h2 id="faultUrgentTitle" style="text-align: center;">${computerProblems.title}</h2>
                    </div>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="/admin/editComputerProblems" id="editfrom"
                          method="post">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">故障类型：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="title" name="title"
                                       value="${computerProblems.title}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">科室：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="dept" name="dept"
                                       value="${computerProblems.dept}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">申报人：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="name" name="name"
                                       value="${computerProblems.name}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">联系方式：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="tel" name="tel"
                                       value="${computerProblems.tel}" readonly="readonly">
                            </div>
                        </div>
                        <div id="textareadetail" class="form-group">
                            <label class="col-sm-2 control-label">详情描述：</label>
                            <div class="col-sm-8">
                                <textarea  type="text" class="form-control" rows="5" id="detail" name="detail"  readonly="readonly">${computerProblems.detail}</textarea>
                            </div>
                        </div>
                        <div id="textareareback" class="form-group">
                            <label class="col-sm-2 control-label">反馈：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="feedback" name="feedback"
                                       value="${computerProblems.reback}" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">上传图片：</label>
                            <div class="col-sm-6">
                                <img src="${pageContext.request.contextPath}/upload/${computerProblems.img}"
                                     id="uploadImg"/>
                            </div>
                        </div>
                        <div class="form-group" style="text-align: center">
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
                                        ${fn:trim(computerProblems.name)}<br>
                                        ${fn:trim(computerProblems.createTime)}<br>
                                        <hr class="hr0" />
                                        ${fn:trim(computerProblems.title)}:<br>
                                        ${fn:trim(computerProblems.detail)}<br>
                                    </div>
                                </div>
                            </li>
                            <c:if test='${computerProblems.feedbackId1 != null && computerProblems.feedbackId1 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                            ${fn:trim(computerProblems.feedbackName1)}<br>
                                            ${fn:trim(computerProblems.feedbackTime1)}<br>
                                            <hr class="hr0" />
                                            ${fn:trim(computerProblems.feedbackContent1)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${computerProblems.feedbackId2 != null && computerProblems.feedbackId2 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                            ${fn:trim(computerProblems.feedbackName2)}<br>
                                            ${fn:trim(computerProblems.feedbackTime2)}<br>
                                            <hr class="hr0" />
                                            ${fn:trim(computerProblems.feedbackContent2)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${computerProblems.feedbackId3 != null && computerProblems.feedbackId3 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                            ${fn:trim(computerProblems.feedbackName3)}<br>
                                            ${fn:trim(computerProblems.feedbackTime3)}<br>
                                            <hr class="hr0" />
                                            ${fn:trim(computerProblems.feedbackContent3)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${computerProblems.feedbackId4 != null && computerProblems.feedbackId4 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                            ${fn:trim(computerProblems.feedbackName4)}<br>
                                            ${fn:trim(computerProblems.feedbackTime4)}<br>
                                            <hr class="hr0" />
                                            ${fn:trim(computerProblems.feedbackContent4)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test='${computerProblems.feedbackId5 != null && computerProblems.feedbackId5 !=""}'>
                                <li class="alt_info">
                                    <div class="number">
                                        处理
                                    </div>
                                    <div class="content">
                                        <div>
                                            ${fn:trim(computerProblems.feedbackName5)}<br>
                                            ${fn:trim(computerProblems.feedbackTime5)}<br>
                                            <hr class="hr0" />
                                            ${fn:trim(computerProblems.feedbackContent5)}<br>
                                        </div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test="${computerProblems.flag != 2}">
                                <li class="alt_wait">
                                    <div class="number">
                                    </div>
                                    <div class="content_wait">
                                        <div></div>
                                    </div>
                                </li>
                            </c:if>
                            <c:if test="${computerProblems.flag == 2}">
                                <li class="alt_success">
                                    <div class="number">
                                        解决
                                    </div>
                                    <div class="content">
                                        <div>
                                            ${fn:trim(computerProblems.leaderName)}<br>
                                            ${fn:trim(computerProblems.doneTime)}<br>
                                            <hr class="hr0" />
                                            ${fn:trim(computerProblems.reback)}<br>
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
    $("#nav li:nth-child(2)").addClass("active");

    //标红处理
    if (${computerProblems.faultUrgent == 1}) {
        $("#faultUrgentTitle").addClass("Urgent");
    }
    //返回按钮点击
    $('#returnListBtn').on('click', function () {
        window.location.href = "/admin/showComputerProblems";
    });


    //设置图片最大尺寸
    function setImgMaxSize() {
        var uploadImg = document.getElementById('uploadImg');
        if (uploadImg.width > 600) {
            uploadImg.height = uploadImg.height * 600 / uploadImg.width;
            uploadImg.width = 600;
        }
    }

    //时间轴缩放
    $("#slideToggle").click(function() {
        $("#timeLine").slideToggle();
    });


    setImgMaxSize();
</script>
</html>