<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<title>巡检信息</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>

	<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

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
					<h2 style="text-align: center;margin-bottom: 20px " class="col-md-10">巡检信息</h2>
					<div class="row" style="text-align: right">
						<form class="form-horizontal form-inline" role="form" style="margin: 20px 0 10px 0;"
							  action="/admin/searchEngineRoomInspection" id="searchFunction" method="post">
							<div class="form-group col-sm-12">
								<input type="text" class="form-control" placeholder="请输入巡检人" id="findByExaminer"
									   name="findByExaminer" style="margin-left: 10px">
								<input type="button" class="btn btn-primary" id="searchBtn" value="搜索"
									   style="margin-left: 10px;margin-right:20px">
							</div>
						</form>

					</div>
				</div>
				<table class="table table-bordered">
					<thead>
					<tr>
						<th style="text-align: center">检查日期</th>
						<th style="text-align: center">检查者</th>
						<th style="text-align: center">创建日期</th>
						<th style="text-align: center"></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach  items="${engineRoomInspectionList}" var="item">
						<tr>
							<td style="text-align: center">${item.date}</td>
							<td style="text-align: center">${item.examiner}</td>
							<td style="text-align: center">${item.createTime}</td>
							<td style="text-align: center">
								<button class="btn btn-default btn-info btn-primary" onClick="location.href='/admin/checkEngineRoomInspection?id=${item.id}'">查看详情</button>
								<!--弹出框-->
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<div class="panel-footer">
					<c:if test="${pagingVO != null}">
						<nav style="text-align: center">
							<ul class="pagination">
								<li><a href="/admin/showEngineRoomInspection?page=${pagingVO.upPageNo}">&laquo;上一页</a></li>
								<li class="active"><a href="">${pagingVO.curentPageNo}</a></li>
								<c:if test="${pagingVO.curentPageNo+1 <= pagingVO.totalCount}">
									<li><a href="/admin/showEngineRoomInspection?page=${pagingVO.curentPageNo+1}">${pagingVO.curentPageNo+1}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+2 <= pagingVO.totalCount}">
									<li><a href="/admin/showEngineRoomInspection?page=${pagingVO.curentPageNo+2}">${pagingVO.curentPageNo+2}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+3 <= pagingVO.totalCount}">
									<li><a href="/admin/showEngineRoomInspection?page=${pagingVO.curentPageNo+3}">${pagingVO.curentPageNo+3}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+4 <= pagingVO.totalCount}">
									<li><a href="/admin/showEngineRoomInspection?page=${pagingVO.curentPageNo+4}">${pagingVO.curentPageNo+4}</a></li>
								</c:if>
								<li><a href="/admin/showEngineRoomInspection?page=${pagingVO.totalCount}">最后一页&raquo;</a></li>
							</ul>
						</nav>
					</c:if>
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
    $("#nav li:nth-child(6)").addClass("active");
    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    }
    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(1)").addClass("disabled")
    }
    </c:if>

/*    function confirmd() {
        var msg = "您真的确定要删除吗？！";
        if (confirm(msg)==true){
            return true;
        }else{
            return false;
        }
    }*/

//	搜索按钮点击
    $("#searchBtn").click(function () {
        $("#searchFunction").submit();
    });
</script>
</html>