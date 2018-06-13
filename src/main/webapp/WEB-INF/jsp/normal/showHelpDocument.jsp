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
                        <h2 style="text-align: center;margin-bottom: 20px ">获取帮助</h2>
                    </div>
                </div>
                <div class="panel-body">
                    <div class="row" id="post-list">
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/HIS系统门诊医生工作站操作说明.doc">门诊医生工作站HIS系统手册</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/HIS系统门诊医生工作站操作说明.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISOutpatientworkstation.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/HIS住院医生工作站操作手册.doc">住院医生工作站HIS系统手册</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/HIS住院医生工作站操作手册.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISHospitalDoctor.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/HIS住院护士工作站操作说明.doc">住院护士工作站HIS系统手册</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/HIS住院护士工作站操作说明.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISHospitalNurse.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/HIS系统药房操作说明.doc">药房操作说明手册</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/HIS系统药房操作说明.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISPharmacy.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/HIS系统医嘱系统医嘱录入要点.doc">HIS医嘱系统录入要点手册</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/HIS系统医嘱系统医嘱录入要点.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISOrder.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/HIS系统住院出院操作说明.doc">住院出院操作说明手册</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/HIS系统住院出院操作说明.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISOutpatientworkstation.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/HIS系统注册挂号收费操作手册.doc">HIS系统注册挂号收费操作手册</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/HIS系统注册挂号收费操作手册.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISRegistered.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <article class="post tag-ad">
                                <h3>
                                    <a href="${pageContext.request.contextPath}/doc/电子病历和his系统接口时间.doc">电子病历和HIS系统接口时间说明</a>
                                </h3>
                                <div class="post-featured-image" >
                                    <a class="thumbnail loaded" href="${pageContext.request.contextPath}/doc/电子病历和his系统接口时间.doc">
                                        <img src="${pageContext.request.contextPath}/images/HelpHISInterfaceTime.png" width="700" height="438" >
                                    </a>
                                </div>
                            </article>
                        </div>

                    </div>
                </div>


            </div>

        </div>
    </div>
</div>
</html>