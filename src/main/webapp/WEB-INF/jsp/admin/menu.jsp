<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked" id="nav">
        <li><a href="/admin/showComputerProblems">故障列表</a></li>
        <li><a href="/admin/addComputerProblems">故障申报</a></li>
        <c:if test= '${roles != null}'>
        <c:if test= '${roles.indexOf("material") != -1 || roles.indexOf("examiner") != -1}'>
        <%--非物资组及审查组不可见--%>
        <li><a href="/admin/showMaterialApplication">申购列表</a></li>
        <li><a href="/admin/addMaterialApplication">物资申购</a></li>
        </c:if>
        <c:if test= '${roles.indexOf("hardware") != -1 || roles.indexOf("examiner") != -1}'>
        <%--非硬件组及审查组不可见--%>
        <li><a href="/admin/showEngineRoomInspection">巡检信息</a></li>
        <li><a href="/admin/addEngineRoomInspection">机房巡检</a></li>
        </c:if>
        </c:if>
        <li><a href="/logout">退出系统<sapn class="glyphicon glyphicon-log-out pull-right" /></a></li>
    </ul>
</div>