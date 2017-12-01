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
						<h2 style="text-align: center;">故障申报</h2>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="/admin/addComputerProblems" id="editfrom" method="post" enctype="multipart/form-data">
						<div class="form-group">
							<label  class="col-sm-2 control-label">标题</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="title" name="title" placeholder="请输入标题">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">科室</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="dept" name="dept" placeholder="请输入科室">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">申报人</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">联系方式</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="tel" name="tel" placeholder="请输入联系方式">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">故障类型</label>
							<div class="col-sm-10">
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
							<label  class="col-sm-2 control-label">详情描述</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="detail" placeholder="请输入描述">
							</div>
						</div>
						<div class="mui-input-row">
							<label>上传图片</label>
							<input type="file" name="photo" id="photo" accept="photo/*">
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
    $("#nav li:nth-child(1)").addClass("active")
</script>
</html>