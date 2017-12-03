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
						<h2 style="text-align: center;">${materialApplication.name}</h2>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="/admin/editMaterialApplication" id="editfrom"
						  method="post">
						<div class="form-group">
							<label  class="col-sm-2 control-label">名称：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="name" name="name"
									   value="${materialApplication.name}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">数量：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="number" name="number"
									   value="${materialApplication.number}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">品牌：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="brand" name="brand"
									   value="${materialApplication.brand}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">参考型号：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="model" name="model"
									   value="${materialApplication.model}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">估价：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="judge" name="judge"
									   value="${materialApplication.judge}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">总价：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="total" name="total"
									   value="${materialApplication.total}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">使用日期：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="useDate" name="useDate"
									   value="${materialApplication.useDate}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">申请人：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="applicant" name="applicant"
									   value="${materialApplication.applicant}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">请购理由：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="reason" name="reason"
									   value="${materialApplication.reason}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">回复：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="reback" name="reback"
									   value="${materialApplication.reback}">
							</div>
						</div>
						<div class="form-group" style="text-align: center">
							<button class="btn btn-default" type="button" id="dealBtn">处理</button>
							<button class="btn btn-default" type="button" id="completeBtn">完成</button>
							<button class="btn btn-default" type="button" id="returnListBtn">返回</button>
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
    $("#nav li:nth-child(3)").addClass("active");


    //处理按钮点击
    $('#dealBtn').on('click', function() {
        var feedback=document.getElementById("feedback").value;
        window.location.href = "/admin/dealMaterialApplication?id=${materialApplication.id}&feedback="+feedback;
    });

    //完成按钮点击
    $('#completeBtn').on('click', function() {
        var feedback=document.getElementById("feedback").value;
        window.location.href = "/admin/completeMaterialApplication?id=${materialApplication.id}&feedback="+feedback;
    });

    //返回按钮点击
    $('#returnListBtn').on('click', function() {
        window.location.href = "/admin/showMaterialApplication";
    });
    setImgMaxSize();

</script>
</html>