<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>绍兴市第七人民医院</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/css/AdminLTE.min.css">
    <!-- 引入JQuery  bootstrap.js-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/app.js"></script>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="/js/jquery-1.11.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/app.js"></script>
    <![endif]-->
    <style type="text/css">
        body{
            padding:10px 0;
        }
        table,.date{
            width: 90%;
            margin:10px auto;
            font-size: 16px;
            border:1px solid;
        }
        .date{
            text-align:right;
            border:0;
        }
        table td{
            border:1px solid;
            padding:10px 3px;
            text-align: center;
        }
        .title{
            width:20% !important;
        }
        .text{
            width:30% !important;
            font-weight: normal;
        }
        .tr_height{
            height:60px;
        }
    </style>
</head>
<body>
<h3 class="text-center" style="margin-bottom:30px;">绍兴市第七人民医院信息物资请购表</h3>
<div class="date">日期：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日</div>
<table>
    <thead>
    </thead>
    <tbody>
    <tr class="tr_height">
        <td class="title">名称</td>
        <td class="text">{$info.name}</td>
        <td class="title">数量</td>
        <td class="text">{$info.number}</td>
    </tr>
    <tr class="tr_height">
        <td class="title">品牌</td>
        <td class="text">{$info.brand}</td>
        <td class="title">参考型号</td>
        <td class="text">{$info.model}</td>
    </tr>
    <tr class="tr_height">
        <td class="title">估价（单位/元）</td>
        <td class="text">{$info.judge}</td>
        <td class="title">总价</td>
        <td class="text">{$info.total}</td>
    </tr>
    <tr class="tr_height">
        <td class="title">使用、安装日期</td>
        <td class="text">{$info.use_date}</td>
        <td class="title">申请人</td>
        <td class="text">{$info.applicant}</td>
    </tr>
    <tr style="height:120px">
        <td class="title">请购理由</td>
        <td colspan="3" style="text-align: left;">{$info.reason}</td>
    </tr>
    <tr style="height:105px">
        <td class="title">申请科室意见</td>
        <td colspan="3" style="text-align: right;vertical-align: bottom;padding-right:10px;">年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日</td>
    </tr>
    <tr style="height:105px">
        <td class="title">分管院长意见</td>
        <td colspan="3" style="text-align: right;vertical-align: bottom;padding-right:10px;">年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日</td>
    </tr>
    <tr style="height:105px">
        <td class="title">信息科意见</td>
        <td colspan="3" style="text-align: right;vertical-align: bottom;padding-right:10px;">年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日</td>
    </tr>
    <tr style="height:105px">
        <td class="title">主管院长审批<br/>(金额>500元)</td>
        <td colspan="3" style="text-align: right;vertical-align: bottom;padding-right:10px;">年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;月&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日</td>
    </tr>
    </tbody>
</table>
<div class="text-center">
    <button class="btn btn-primary" type="button" id="btnSave">确定打印</button>
</div>
</body>
<script type="text/javascript">

    $(function() {
        $("#btnSave").click(function(){
            if (confirm("确定打印？（友情提示：打印前请先将浏览器打印设置为去掉页眉页脚。）")){
                $(this).hide();
                window.print();
            }
            else{

            }
        });
    });
</script>
</html>