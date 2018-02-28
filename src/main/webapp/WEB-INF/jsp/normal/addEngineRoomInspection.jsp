<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<style>
</style>
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
                        <h2 style="text-align: center;margin-bottom: 20px " class="col-md-10">机房巡检</h2>
                    </div>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" role="form" id="editfrom"
                          method="post">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">检查日期：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="date" name="date"
                                >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">检查者：</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="examiner" name="examiner"
                                >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">EMR服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="emr" id="emr">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">HIS服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="his" id="his">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">LIS服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="lis" id="lis">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">PACS服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="pacs" id="pacs">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">云服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="xny" id="xny">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">OA服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="oa" id="oa">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">医保前置：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="yb" id="yb">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">区域网前置：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="qyw" id="qyw">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">应用服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="yy" id="yy">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">监控服务器：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="jk" id="jk">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">HIS存储：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="hiscc" id="hiscc">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">核心交换机：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="hx" id="hx">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">汇聚交换机：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="hj" id="hj">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">安全设备：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="aqsb" id="aqsb">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">UPS供电：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="ups" id="ups">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">气体灭火：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="qtmh" id="qtmh">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">空调：</label>
                            <div class="col-sm-8">
                                <select class="form-control" name="kt" id="kt">
                                    <option value="0">未检查</option>
                                    <option value="1">正常</option>
                                    <option value="2">异常</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">原因/结果：</label>
                            <div class="col-sm-8">
                                <textarea  type="text" class="form-control" rows="5" id="ycyy" name="ycyy" placeholder="请输入原因/结果"></textarea>
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


    <c:if test="${pagingVO != null}">
    if (${pagingVO.curentPageNo} == ${pagingVO.totalCount}) {
        $(".pagination li:last-child").addClass("disabled")
    }
    if (${pagingVO.curentPageNo} == ${1}) {
        $(".pagination li:nth-child(2)").addClass("disabled")
    }
    </c:if>

    //用户信息填入
    $.ajax({
        url:"/normal/getApplicantInfo",
        async:true,
        success: function(data){
            document.getElementById("examiner").value = data.appliName;
        }
    });

    //返回按钮点击
    $('#returnListBtn').on('click', function () {
        window.location.href = "/normal/showEngineRoomInspection";
    });

    //初始化时间插件
    $('#date').datetimepicker({
        language:  'zh-CN',
        format:'yyyy-mm-dd',
        minView: "month",
        todayBtn:  1,
        autoclose: 1

    });

    //使IE8支持 placeholder
    $(function () {
        // Invoke the plugin
        $('input,textarea').placeholder();
    });

    /*//防止数据重复提交
    $("#formSubmit").one("click",function(){
        $("#editfrom").submit();
    });*/
</script>
</html>