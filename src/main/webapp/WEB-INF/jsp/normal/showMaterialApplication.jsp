<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<title>申购列表</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>

	<style type="text/css">
		td{
			text-align: center;
		}
	</style>
	<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

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
					<h2 style="text-align: center;margin-bottom: 20px ">申购列表</h2>
				</div>
				<table class="table table-bordered">
					<thead>
					<tr>
						<th style="text-align: center">名称</th>
						<th style="text-align: center">数量</th>
						<th style="text-align: center">品牌</th>
						<th style="text-align: center">参考型号</th>
						<th style="text-align: center">估价</th>
						<th style="text-align: center">总价</th>
						<th style="text-align: center">使用/安装日期</th>
						<th style="text-align: center">申请人</th>
						<th style="text-align: center">状态</th>
						<th style="text-align: center"></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach  items="${materialApplicationList}" var="item">
						<tr>
							<td>${item.name}</td>
							<td>${item.number}</td>
							<td>${item.brand}</td>
							<td>${item.model}</td>
							<td>${item.judge}</td>
							<td>${item.total}</td>
							<td>${item.useDate}</td>
							<td>${item.applicant}</td>
							<c:if test="${item.flag == 0}">
								<td><button class="btn btn-warning btn-sm" type="button">提交中</button></td>
							</c:if>
							<c:if test="${item.flag == 1}">
								<td><button class="btn btn-info btn-sm" type="button">处理中</button></td>
							</c:if>
							<c:if test="${item.flag == 2}">
								<td><button class="btn btn-success btn-sm" type="button">已解决</button></td>
							</c:if>
							<td style="text-align: center">
								<button class="btn btn-default btn-xs btn-danger btn-primary" onClick="location.href='/normal/checkMaterialApplication?id=${item.id}'">查看详情</button>
								<!--弹出框-->
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
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
    $("#nav li:nth-child(4)").addClass("active");
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

    $("#searchBtn").click(function () {
        $("#searchFunction").submit();
    });
</script>
</html>