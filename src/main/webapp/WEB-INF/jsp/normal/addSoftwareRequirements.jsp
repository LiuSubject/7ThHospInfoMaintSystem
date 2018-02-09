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
                        <h2 style="text-align: center;margin-bottom: 20px " class="col-md-10">需求申请</h2>
                    </div>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" action="/normal/addSoftwareRequirements" id="editfrom"
                          method="post" enctype="multipart/form-data">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">需求类别：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="requireType" id="requireType">
                                    <option value="流程变更">流程变更</option>
                                    <option value="功能变更">功能变更</option>
                                    <option value="应用出错">应用出错</option>
                                    <option value="系统升级">系统升级</option>
                                    <option value="功能新增">功能新增</option>
                                    <option value="数据维护">数据维护</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">软件及模块名称：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="applicantModule" name="applicantModule" placeholder="请输入软件及模块名称">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">科室：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="dept" name="dept" placeholder="请输入科室">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">反馈人：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="applicantName" name="applicantName" placeholder="请输入姓名">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">反馈日期：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="applicantTime" name="applicantTime"
                                       placeholder="请输入反馈日期" onfocus=this.blur() >
                            </div>
                        </div>
                        <div id="textareadetail" class="form-group">
                            <label class="col-sm-2 control-label">详情内容：</label>
                            <div class="col-sm-8">
                                <textarea type="text" class="form-control" rows="5" id="details" name="details"
                                          placeholder="请输入描述"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">主管科室意见：</label>
                            <div class="col-sm-8">
                                <textarea  type="text" class="form-control" rows="5" id="deptComments" name="deptComments" placeholder="请输入申请科室意见"></textarea>
                            </div>
                        </div>
                        <div class="form-group" style="text-align: center">
                            <button class="btn btn-default" type="button" id="formSubmit">提交</button>
                            <button class="btn btn-default" type="reset">重置</button>
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
    <%--设置菜单中--%>
    $("#nav li:nth-child(8)").addClass("active");
    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    }
    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(2)").addClass("disabled")
    }
    </c:if>
    //用户信息填入
    $.ajax({
        url: "/normal/getApplicantInfo",
        async: true,
        success: function (data) {
            document.getElementById("dept").value = data.appliDept;
            document.getElementById("applicantName").value = data.appliName;

        }
    });

    //使IE8支持 placeholder
    $(function () {
        // Invoke the plugin
        $('input,textarea').placeholder();
    });

    //防止数据重复提交
    $("#formSubmit").one("click",function(){
        $("#editfrom").submit();
    });

    //初始化时间插件
    $('#applicantTime').datetimepicker({
        language:  'zh-CN',
        format:'yyyy-mm-dd',
        minView: "month",
        todayBtn:  1,
        autoclose: 1

    });
</script>
</html>