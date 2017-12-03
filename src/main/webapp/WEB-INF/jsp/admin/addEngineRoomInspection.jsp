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
						<h2 style="text-align: center;margin-bottom: 20px " class="col-md-10">机房巡检</h2>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="/admin/addEngineRoomInspection" id="editfrom"
						  method="post">
						<div class="form-group">
							<label  class="col-sm-2 control-label">检查日期：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="date" name="date"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">检查者：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="examiner" name="examiner"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">EMR服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="emr" name="emr"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">HIS服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="his" name="his"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">LIS服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="lis" name="lis"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">PACS服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="pacs" name="pacs"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">云服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="xny" name="xny"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">OA服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="oa" name="oa"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">医保前置：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="yb" name="yb"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">区域网前置：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="qyw" name="qyw"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">应用服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="yy" name="yy"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">监控服务器：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="jk" name="jk"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">HIS存储：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="hiscc" name="hiscc"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">核心交换机：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="hx" name="hx"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">汇聚交换机：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="hj" name="hj"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">安全设备：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="aqsb" name="aqsb"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">UPS供电：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="ups" name="ups"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">气体灭火：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="qtmh" name="qtmh"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">空调：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="kt" name="kt"
								>
							</div>
						</div>
						<div class="form-group">
							<label  class="col-sm-2 control-label">原因/结果：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="ycyy" name="ycyy"
								>
							</div>
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
    $("#nav li:nth-child(5)").addClass("active");
    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    }
    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(1)").addClass("disabled")
    }
    </c:if>


    //返回按钮点击
    $('#returnListBtn').on('click', function() {
        window.location.href = "/admin/showEngineRoomInspection";
    });


</script>
</html>