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
								<input type="date" class="form-control" id="date" name="date"
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
								<select class="form-control" name="emr" id="emr"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">HIS服务器：</label>
							<div class="col-sm-8">
								<select class="form-control" name="his" id="his"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">LIS服务器：</label>
							<div class="col-sm-8">
								<select class="form-control" name="lis" id="lis"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">PACS服务器：</label>
							<div class="col-sm-8">
								<select class="form-control" name="pacs" id="pacs"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">云服务器：</label>
							<div class="col-sm-8">
								<select class="form-control" name="xny" id="xny"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">OA服务器：</label>
							<div class="col-sm-8">
								<select class="form-control" name="oa" id="oa"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">医保前置：</label>
							<div class="col-sm-8">
								<select class="form-control" name="yb" id="yb"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">区域网前置：</label>
							<div class="col-sm-8">
								<select class="form-control" name="qyw" id="qyw"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">应用服务器：</label>
							<div class="col-sm-8">
								<select class="form-control" name="yy" id="yy"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">监控服务器：</label>
							<div class="col-sm-8">
								<select class="form-control" name="jk" id="jk"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">HIS存储：</label>
							<div class="col-sm-8">
								<select class="form-control" name="hiscc" id="hiscc"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">核心交换机：</label>
							<div class="col-sm-8">
								<select class="form-control" name="hx" id="hx"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">汇聚交换机：</label>
							<div class="col-sm-8">
								<select class="form-control" name="hj" id="hj"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">安全设备：</label>
							<div class="col-sm-8">
								<select class="form-control" name="aqsb" id="aqsb"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">UPS供电：</label>
							<div class="col-sm-8">
								<select class="form-control" name="ups" id="ups"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">气体灭火：</label>
							<div class="col-sm-8">
								<select class="form-control" name="qtmh" id="qtmh"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">空调：</label>
							<div class="col-sm-8">
								<select class="form-control" name="kt" id="kt"
										onfocus="this.defaultIndex=this.selectedIndex;"
										onchange="this.selectedIndex=this.defaultIndex;">
									<option value="0">未检查</option>
									<option value="1">正常</option>
									<option value="2">异常</option>
								</select>
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
							<button class="btn btn-default" id="returnListBtn" type="button">返回</button>
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
	//改变菜单状态
    $("#nav li:nth-child(5)").addClass("active");

	//选项调整
	/*	等同于：
		 for (var i=0; i<typeSelect.length; i++) {
			 if (typeSelect[i].value == engineRoomInspection.emr) {
				 typeSelect[i].selected = true;
			 }
		 }*/
    $("#emr option")[${engineRoomInspection.emr}].selected = true;
    $("#his option")[${engineRoomInspection.his}].selected = true;
    $("#lis option")[${engineRoomInspection.lis}].selected = true;
    $("#pacs option")[${engineRoomInspection.pacs}].selected = true;
    $("#xny option")[${engineRoomInspection.xny}].selected = true;
    $("#oa option")[${engineRoomInspection.oa}].selected = true;
    $("#yb option")[${engineRoomInspection.yb}].selected = true;
    $("#qyw option")[${engineRoomInspection.qyw}].selected = true;
    $("#yy option")[${engineRoomInspection.yy}].selected = true;
    $("#jk option")[${engineRoomInspection.jk}].selected = true;
    $("#hiscc option")[${engineRoomInspection.hiscc}].selected = true;
    $("#hx option")[${engineRoomInspection.hx}].selected = true;
    $("#hj option")[${engineRoomInspection.hj}].selected = true;
    $("#aqsb option")[${engineRoomInspection.aqsb}].selected = true;
    $("#ups option")[${engineRoomInspection.ups}].selected = true;
    $("#qtmh option")[${engineRoomInspection.qtmh}].selected = true;
    $("#kt option")[${engineRoomInspection.kt}].selected = true;

    //返回按钮点击
    $('#returnListBtn').on('click', function() {
        window.location.href = "/admin/showEngineRoomInspection";
    });


</script>
</html>