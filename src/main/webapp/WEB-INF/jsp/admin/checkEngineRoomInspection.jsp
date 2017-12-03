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
						<h2 style="text-align: center;">${engineRoomInspection.date}</h2>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="/admin/editEngineRoomInspection" id="editfrom"
						  method="post">
						<div class="form-group">
							<label  class="col-sm-2 control-label">检查日期：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="date" name="date"
									   value="${engineRoomInspection.date}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">检查者：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="examiner" name="examiner"
									   value="${engineRoomInspection.examiner}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">EMR服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="emr" name="emr"
									   value="${engineRoomInspection.emr}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">HIS服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="his" name="his"
									   value="${engineRoomInspection.his}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">LIS服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="lis" name="lis"
									   value="${engineRoomInspection.lis}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">PACS服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="pacs" name="pacs"
									   value="${engineRoomInspection.pacs}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">云服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="xny" name="xny"
									   value="${engineRoomInspection.xny}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">OA服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="oa" name="oa"
									   value="${engineRoomInspection.oa}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">医保前置：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="yb" name="yb"
									   value="${engineRoomInspection.yb}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">区域网前置：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="qyw" name="qyw"
									   value="${engineRoomInspection.qyw}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">应用服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="yy" name="yy"
									   value="${engineRoomInspection.yy}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">监控服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="jk" name="jk"
									   value="${engineRoomInspection.jk}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">HIS存储：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="hiscc" name="hiscc"
									   value="${engineRoomInspection.hiscc}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">核心交换机：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="hx" name="hx"
									   value="${engineRoomInspection.hx}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">汇聚交换机：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="hj" name="hj"
									   value="${engineRoomInspection.hj}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">安全设备：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="aqsb" name="aqsb"
									   value="${engineRoomInspection.aqsb}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">UPS供电：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="ups" name="ups"
									   value="${engineRoomInspection.ups}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">气体灭火：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="qtmh" name="qtmh"
									   value="${engineRoomInspection.qtmh}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">空调：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="kt" name="kt"
									   value="${engineRoomInspection.kt}" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">原因/结果：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="ycyy" name="ycyy"
									   value="${engineRoomInspection.ycyy}" readonly="readonly">
							</div>
						</div>


						<div class="form-group" style="text-align: center">
							<button class="btn btn-default" id="returnListBtn">返回</button>
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


    //返回按钮点击
    $('#returnListBtn').on('click', function() {
        window.location.href = "/admin/showEngineRoomInspection";
    });


</script>
</html>