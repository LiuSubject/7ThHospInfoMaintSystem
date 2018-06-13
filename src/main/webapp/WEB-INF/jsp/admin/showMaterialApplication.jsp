<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<title>申购列表</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<%--一分钟刷新一次页面--%>
	<meta http-equiv="refresh" content="60">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>

	<style type="text/css">
		td{
			text-align: center;
		}

		body {
			overflow-y: scroll;
		}
		.groupDeal {
			background-color: lightskyblue;
		}
	</style>
	<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

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
<![endif]--><body>
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
					<div class="row" style="text-align: right">
						<form class="form-horizontal form-inline" role="form" style="margin: 20px 0 10px 0;"
							  action="/admin/searchMaterialApplication" id="searchFunction" method="post">
							<div class="form-group col-sm-12">
								<input type="text" class="form-control" placeholder="请输入科室" id="findByDept"
									   name="findByDept" style="margin-left: 5px">
								<input type="text" class="form-control" placeholder="请输入申报人" id="findByName"
									   name="findByName" style="margin-left: 10px">
								<select class="form-control" name="findByFlag" id="findByFlag" style="margin-left: 10px">
									<option value="-1">选择状态：</option>
									<option value="0">提交中</option>
									<option value="1">处理中</option>
									<option value="2">已解决</option>
								</select>
								<input type="button" class="btn btn-primary" id="searchBtn" value="搜索"
									   style="margin-left: 10px;margin-right:20px">
							</div>
						</form>

					</div>
				</div>
				<table class="table table-bordered">
					<thead>
					<tr>
						<th style="text-align: center">申请人</th>
						<th style="text-align: center">科室</th>
						<th style="text-align: center">名称</th>
						<th style="text-align: center">数量</th>
						<th style="text-align: center">品牌</th>
						<th style="text-align: center">参考型号</th>
						<th style="text-align: center">估价</th>
						<th style="text-align: center">总价</th>
						<th style="text-align: center">使用/安装日期</th>
						<th style="text-align: center">状态</th>
						<th style="text-align: center">需审批</th>
						<th style="text-align: center"></th>
					</tr>
					</thead>
					<tbody>
					<c:forEach  items="${materialApplicationList}" var="item">
						<tr <c:if test='${item.groupVisible == 1
							&& item.flag != 2
							&& (roles.indexOf("material") != -1
								|| roles.indexOf("examiner") != -1)}'>class="groupDeal"</c:if>>
							<td>${item.applicant}</td>
							<td>${item.dept}</td>
							<td>${item.name}</td>
							<td>${item.number}</td>
							<td>${item.brand}</td>
							<td>${item.model}</td>
							<td>${item.judge}</td>
							<td>${item.total}</td>
							<td>${item.useDate}</td>
							<c:if test="${item.flag == 0}">
								<td><button class="btn btn-warning btn-sm" type="button">提交中</button></td>
							</c:if>
							<c:if test="${item.flag == 1}">
								<td><button class="btn btn-info btn-sm" type="button">处理中</button></td>
							</c:if>
							<c:if test="${item.flag == 2}">
								<td><button class="btn btn-success btn-sm" type="button">已解决</button></td>
							</c:if>
							<c:if test="${item.highApproved == 0}">
								<td><button class="btn btn-info btn-sm" type="button">否</button></td>
							</c:if>
							<c:if test="${item.highApproved == 1}">
								<td><button class="btn btn-warning btn-sm" type="button">是</button></td>
							</c:if>
							<td>
								<c:if test='${(roles.indexOf("material") != -1 || roles.indexOf("examiner") != -1)}'>
									<button class="btn btn-default btn-xs btn-info" type="button" onClick="location.href='/admin/editMaterialApplication?id=${item.id}'">处理申购</button>
								</c:if>
								<button class="btn btn-default btn-xs btn-danger btn-primary" type="button" onClick="location.href='/admin/checkMaterialApplication?id=${item.id}'">查看详情</button>
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
								<li><a href="/admin/showMaterialApplication?page=${pagingVO.upPageNo}">&laquo;上一页</a></li>
								<li class="active"><a href="javascript:location.reload();">${pagingVO.curentPageNo}</a></li>
								<c:if test="${pagingVO.curentPageNo+1 <= pagingVO.totalCount}">
									<li><a href="/admin/showMaterialApplication?page=${pagingVO.curentPageNo+1}">${pagingVO.curentPageNo+1}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+2 <= pagingVO.totalCount}">
									<li><a href="/admin/showMaterialApplication?page=${pagingVO.curentPageNo+2}">${pagingVO.curentPageNo+2}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+3 <= pagingVO.totalCount}">
									<li><a href="/admin/showMaterialApplication?page=${pagingVO.curentPageNo+3}">${pagingVO.curentPageNo+3}</a></li>
								</c:if>
								<c:if test="${pagingVO.curentPageNo+4 <= pagingVO.totalCount}">
									<li><a href="/admin/showMaterialApplication?page=${pagingVO.curentPageNo+4}">${pagingVO.curentPageNo+4}</a></li>
								</c:if>
								<li><a href="/admin/showMaterialApplication?page=${pagingVO.totalCount}">最后一页&raquo;</a></li>
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


    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    }
    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(2)").addClass("disabled")
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

    //  使IE8支持 placeholder
    $(function () {
        // Invoke the plugin
        $('input, textarea').placeholder();
    });
</script>
</html>