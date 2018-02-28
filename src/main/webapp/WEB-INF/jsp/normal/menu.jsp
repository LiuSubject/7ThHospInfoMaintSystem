<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked" id="nav">
        <li><a href="/normal/showComputerProblems">故障列表</a></li>
        <li><a href="/normal/addComputerProblems">故障申报</a></li>
        <li><a href="/normal/showMaterialApplication">申购列表</a></li>
        <li><a href="/normal/addMaterialApplication">物资申购</a></li>
        <li><a href="/normal/showSoftwareRequirements">需求列表</a></li>
        <li><a href="/normal/addSoftwareRequirements">软件需求</a></li>
        <c:if test= '${roles != null}'>
        <c:if test= '${roles.indexOf("infodean") != -1 || roles.indexOf("alldean") != -1}'>
            <li><a href="/normal/showEngineRoomInspection">巡检信息</a></li>
            <li><a href="/normal/addEngineRoomInspection">机房巡检</a></li>
        </c:if>
        </c:if>
        <li><a href="/logout">退出系统<sapn class="glyphicon glyphicon-log-out pull-right" /></a></li>
    </ul>
</div>