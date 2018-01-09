<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
            font-size: 14px;
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
            width:40% !important;
            font-weight: normal;
        }
        .tr_height{
            height:20px;
        }
        .checkbox{
            padding-left: 20px;
            display: inline-block;
            margin:0;
        }
        .first{
            margin-right: 40px;
        }
    </style>
</head>
<body>
<h1 class="text-center" style="margin-bottom:30px;">绍兴市第七人民医院信息中心机房检查日志</h1>
    <table>
        <thead>
        </thead>
        <tbody>
        <tr>
            <td class="title">检查日期</td>
            <td colspan="2">{$info.date}</td>
        </tr>
        <tr class="tr_height">
            <td rowspan="10" class="title">服务器</td>
            <td class="text">EMR服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">HIS服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">LIS服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">PACS服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">虚拟云服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">OA服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">医保前置机</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">区域网前置机</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">应用服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">监控服务器</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="title">存储</td>
            <td class="text">HIS存储</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td rowspan="6" class="title">交换机</td>
            <td class="text">核心交换机</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">汇聚交换机</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">安全设备</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">UPS供电</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">气体灭火</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr class="tr_height">
            <td class="text">空调</td>
            <td class="text">
                <span class="checkbox first"><input type="checkbox" >正常</span>
                <span class="checkbox"><input type="checkbox" >异常</span>
            </td>
        </tr>
        <tr style="height:120px">
            <td class="title">异常原因<br/>解决结果</td>
            <td style="text-align: left;vertical-align: top;">{$info.ycyy}</td>
            <td style="text-align: left;vertical-align: top;">检查者：</td>
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