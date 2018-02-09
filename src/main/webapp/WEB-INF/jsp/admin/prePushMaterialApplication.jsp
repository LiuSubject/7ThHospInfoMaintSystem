<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title></title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <!-- 引入JQuery  bootstrap.js-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <style type="text/css">
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
<%--引入时间插件--%>
<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
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
                        <h2 style="text-align: center;margin-bottom: 20px " class="col-md-10">申购推送</h2>
                    </div>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="/admin/pushMaterialApplication" method="post" id="editfrom">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">分管院长：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="viceDean" id="viceDean">
                                    <option value="-1">不推送</option>
                                    <c:forEach  items="${deans}" var="item">
                                        <c:if test='${item.rolename.indexOf("dpdean") != -1}'>
                                            <option value="${item.roleid}">${item.realName}</option>
                                        </c:if>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">信息主管副院长：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="infoVice" id="infoVice">
                                    <option value="-1">不推送</option>
                                    <c:forEach  items="${deans}" var="item">
                                        <c:if test='${item.rolename.indexOf("infodean") != -1}'>
                                            <option value="${item.roleid}">${item.realName}</option>
                                        </c:if>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">院长：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="dean" id="dean">
                                    <option value="-1">不推送</option>
                                    <c:forEach  items="${deans}" var="item">
                                        <c:if test='${item.rolename.indexOf("alldean") != -1}'>
                                            <option value="${item.roleid}">${item.realName}</option>
                                        </c:if>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <%--数据中转--%>
                        <input type="text" id="material_id" name="material_id" value="${material_id}" style="display:none">
                        <input type="text" id="material_feedback" name="material_feedback" value="${material_feedback}" style="display:none">
                        <div class="form-group" style="text-align: center">
                            <button class="btn btn-default" type="button" id="formSubmit">推送</button>
                            <button class="btn btn-default" type="reset">返回</button>
                        </div>
                    </form>
                </div>

            </div>

        </div>
    </div>
</div>
<div class="container" id="footer">
    <div class="row">
        <div class="col-md-12"></div>
    </div>
</div>
</body>
<script type="text/javascript">



    //防止数据重复提交
    $("#formSubmit").one("click",function(){
        $("#editfrom").submit();
    });
</script>
</html>