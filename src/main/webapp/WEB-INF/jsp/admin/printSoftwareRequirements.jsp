<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>

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
            padding:5px 5px;
            text-align: left;
            vertical-align:top;
        }
        .title{
            width:20% !important;
        }
        .text{
            width:30% !important;
            font-weight: normal;
        }
        .tr_height{
            height:25px;
        }
        @page {
            margin: 0;
        }
        .checkbox{
            padding-left: 30px;
            display: inline-block;
            margin:0;
        }
        .noboderTd{
            border-top-style:none;
            border-bottom-style:none
        }
        .noboderTr{
            border-top-style:none;
            border-bottom-style:none
        }
    </style>
</head>
<body>
<h2 class="text-center" style="margin-bottom:30px; font-weight:bold">软件修改需求申请表</h2>
<div class="date">编号：_____________</div>
<table>
    <thead>
    </thead>
    <tbody>
    <tr class="tr_height">
        <td class="text">科室名称：</td>
        <td class="text" class="text" style="border-right-style:none">${softwareRequirements.dept}</td>
        <td class="text" style="text-align: right;vertical-align: bottom;padding-right:10px; border-left-style:none;border-right-style:none"></td>
        <td class="text" style="border-left: none"></td>
    </tr>
    <tr class="tr_height">
        <td colspan="2" class="title" >反馈人：${softwareRequirements.applicantName}</td>
        <td colspan="2" class="title" >反馈日期：${softwareRequirements.applicantTime}</td>
    </tr>
    <tr class="tr_height">
        <td class="text" style="border-right-style:none">软件模块名称：</td>
        <td colspan="2" class="text" style="border-left-style:none;border-right-style:none">${softwareRequirements.applicantModule}</td>
        <td colspan="1" style="text-align: right;vertical-align: bottom;padding-right:10px; border-left-style:none"></td>
    </tr>
    <tr style="height:100px">
        <td colspan="4" class="text" style="border-bottom-style: none">需求类别：
            <span class="checkbox first"><input type="checkbox" ${"流程变更" eq softwareRequirements.requireType?"checked":""} >流程变更</span>
            <span class="checkbox"><input type="checkbox" ${"功能变更" eq softwareRequirements.requireType?"checked":""} >功能变更</span>
            <span class="checkbox"><input type="checkbox" ${"应用出错" eq softwareRequirements.requireType?"checked":""} >应用出错</span>
            <span class="checkbox"><input type="checkbox" ${"系统升级" eq softwareRequirements.requireType?"checked":""} >系统升级</span>
            <span class="checkbox"><input type="checkbox" ${"功能新增" eq softwareRequirements.requireType?"checked":""} >功能新增</span>
            <span class="checkbox"><input type="checkbox" ${"数据维护" eq softwareRequirements.requireType?"checked":""} >数据维护</span>
            <br>详细内容：${softwareRequirements.details}
        </td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="border-right: none" ></td>
        <td colspan="2" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none">科室负责人：</td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="border-right: none"></td>
        <td colspan="4" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none">确认日期：</td>
    </tr>
    <tr style="height:100px">
        <td colspan="2" class="title" >主管科室意见（签字）：<br>
            ${softwareRequirements.deptComments}
        </td>
        <td colspan="2" class="title" >主管院长意见：<br>
            ${softwareRequirements.highLeaderReback1}
        </td>
    </tr>
    <tr style="height:100px">
        <td colspan="4" class="text" style="border-bottom-style: none">处理意见：（软件公司开发填写）<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            （&nbsp;${softwareRequirements.timeRequired}&nbsp;）天内完成；不能完成详细说明原因。<br>
            ${softwareRequirements.handlingComments}
        </td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="border-right: none" ></td>
        <td colspan="2" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none">开发商代表：</td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="border-right: none"></td>
        <td colspan="4" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none">确认日期：</td>
    </tr>
    <tr style="height:45px">
        <td colspan="4" class="text" style="border-bottom-style: none">信息组意见（签字）：<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${softwareRequirements.infoComments}
        </td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="border-right: none" ></td>
        <td colspan="2" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none">科室负责人：</td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="border-right: none"></td>
        <td colspan="4" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none">确认日期：</td>
    </tr>
    <tr style="height:45px">
        <td colspan="4" class="text" style="border-bottom-style: none">验收结果：
            <span class="checkbox first"><input type="checkbox" ${1 eq softwareRequirements.acceptanceType?"checked":""} >修改已按上诉反馈完成，验收合格。</span><br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="checkbox"><input type="checkbox" ${2 eq softwareRequirements.acceptanceType?"checked":""}>不需要做了</span><br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="checkbox"><input type="checkbox" ${3 eq softwareRequirements.acceptanceType?"checked":""}>已更新，但需求有变化</span><br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;说明：${softwareRequirements.acceptanceDescription}
        </td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:280px;border-left-style: none;border-right-style: none">信息科负责人：</td>
        <td colspan="2" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none">验收日期：</td>
    </tr>
    <tr class="noboderTr">
        <td colspan="2" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:280px;border-left-style: none;border-right-style: none;border-bottom-style: solid">开发商代表：</td>
        <td colspan="2" class="noboderTd" style="text-align: left;vertical-align: bottom;padding-left:80px;border-left-style: none;border-bottom-style: solid">验收日期：</td>
    </tr>
    <tr style="height:70px">
        <td colspan="4" class="text" style="border-color: #ffffff">
            注：1、凡涉及到流程变更、功能变更、功能新增、及系统优化的需求，需要信息科负责人签字确认。<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2、关于功能新增，如果在项目合同中涉及，则经开发商代表确认过后开始开发；如果超出合同范围，则需项目双方共同协商。
        </td>
    </tr>
    </tbody>
</table>
<div class="text-center">
    <button class="btn btn-primary" type="button" id="btnSave">打印</button>
</div>
</body>
<script type="text/javascript">

    $(function() {
        $("#btnSave").click(function(){
            if (confirm("（友情提示：打印前请先将浏览器打印设置为去掉页眉页脚。）确定打印？")){
                $(this).hide();
                window.print();
            }
            else{

            }
        });
    });
</script>
</html>