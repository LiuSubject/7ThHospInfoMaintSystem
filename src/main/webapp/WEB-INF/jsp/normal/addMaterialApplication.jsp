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
						<h2 style="text-align: center;margin-bottom: 20px " class="col-md-10">物资申购</h2>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-horizontal" role="form" action="/normal/addMaterialApplication"  method="post" id="editfrom">
						<div class="form-group">
							<label class="col-sm-2 control-label">申请人：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="applicant" name="applicant"
									   placeholder="请输入申请人">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">科室：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="dept" name="dept"
									   placeholder="请输入申请科室">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">名称：</label>
							<div class="col-sm-8">
								<select class="form-control" name="nameCode" id="nameCode">
								</select>
								<%--存入故障名称--%>
								<input type="text" class="form-control" id="name" name="name" style="display:none">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">数量：</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" id="number" name="number" placeholder="请输入数量">
							</div>
						</div>
						<div class="form-group" style="display:none">
							<label class="col-sm-2 control-label">品牌：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="brand" name="brand" placeholder="请输入品牌">
							</div>
						</div>
						<div class="form-group" style="display:none">
							<label class="col-sm-2 control-label">参考型号：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="model" name="model" placeholder="请输入参考型号">
							</div>
						</div>
						<div class="form-group" style="display:none">
							<label class="col-sm-2 control-label">估价：</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" id="judge" name="judge" placeholder="请输入估价">
							</div>
						</div>
						<div class="form-group" style="display:none">
							<label class="col-sm-2 control-label">总价：</label>
							<div class="col-sm-8">
								<input type="number" class="form-control" id="total" name="total" placeholder="请输入总价">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">使用日期：</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="useDate" name="useDate"
									   placeholder="请输入使用日期" onfocus=this.blur() >
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">请购理由：</label>
							<div class="col-sm-8">
								<textarea  type="text" class="form-control" rows="5" id="reason" name="reason" placeholder="请输入请购理由"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">申请科室意见：</label>
							<div class="col-sm-8">
								<textarea  type="text" class="form-control" rows="5" id="bmyj" name="bmyj" placeholder="请输入申请科室意见"></textarea>
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
    $("#nav li:nth-child(4)").addClass("active");
    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    }
    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(2)").addClass("disabled")
    }
    </c:if>

    //  使IE8支持 placeholder
    $(function () {
        // Invoke the plugin
        $('input, textarea').placeholder();
    });

    //用户信息填入
    $.ajax({
        url:"/normal/getApplicantInfo",
        async:true,
        success: function(data){
            document.getElementById("dept").value = data.appliDept;
            document.getElementById("applicant").value = data.appliName;

        }
    });

    //物资列表填入
    $.ajax({
        url:"/normal/getMaterialTypeList",
        async:true,
        success: function(data){
            var list = data.materialApplicationTypeList;
            if(list){                                               //判断
                for(var i=0; i<list.length; i++){                   //遍历，动态赋值
                    var optionString = "";
                    optionString ="<option value=\""
                        + list[i].materialCode+"\">"
                        + list[i].materialName+"</option>";         //动态添加数据
                    $("#nameCode").append(optionString);                // 为当前Id为type的select添加数据。
                }
            }
            //申购项目初始值设置
            document.getElementById("name").value = $("#nameCode").find("option:selected").text();
        }
    });


    //申购项目保存
    $("#nameCode").change(function(){
        document.getElementById("name").value = $("#nameCode").find("option:selected").text();
    });

    //初始化时间插件
    $('#useDate').datetimepicker({
        language:  'zh-CN',
        format:'yyyy-mm-dd',
        minView: "month",
        todayBtn:  1,
        autoclose: 1

    });

    //防止数据重复提交
    $("#formSubmit").one("click",function(){
        $("#editfrom").submit();
    });
</script>
</html>