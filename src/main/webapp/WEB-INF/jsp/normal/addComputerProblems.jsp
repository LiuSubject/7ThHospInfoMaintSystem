<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
						<h2 style="text-align: center;margin-bottom: 20px " class="col-md-10">故障申报</h2>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="/normal/addComputerProblems" id="editfrom" method="post" enctype="multipart/form-data">
						<div class="form-group">
							<label  class="col-sm-2 control-label">标题：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="title" name="title" placeholder="请输入标题">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">科室：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="dept" name="dept" placeholder="请输入科室">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">申报人：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">联系方式：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="tel" name="tel" placeholder="请输入联系方式">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">故障类型：</label>
							<div class="col-sm-8">
								<select class="form-control" name="type" id="type">
									<option value="1">电脑问题</option>
									<option value="2">打印机问题</option>
									<option value="3">监控问题</option>
									<option value="4">网络问题</option>
									<option value="5">病区软件问题</option>
									<option value="6">门诊软件问题</option>
									<option value="7">其它问题</option>
								</select>
							</div>
						</div>
						<div id="textareadetail" class="form-group">
							<label  class="col-sm-2 control-label">详情描述：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" name="detail" placeholder="请输入描述">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">上传图片：</label>
							<input class="col-sm-3 control-label" type="file" name="photo" id="photo">
						</div>
						<div class="form-group" style="text-align: center">
							<button class="btn btn-default" type="submit">提交</button>
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
    $("#nav li:nth-child(1)").addClass("active");
    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    }
    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(1)").addClass("disabled")
    }
    </c:if>
</script>
</html>