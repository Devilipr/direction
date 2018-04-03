<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>用户健康信息管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/">用户健康信息列表</a></li>
		<shiro:hasPermission name="xywy:xuserhealthinfo:xUserHealthInfo:edit"><li><a href="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/form">用户健康信息添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="xUserHealthInfo" action="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<shiro:hasPermission name="xywy:xuserhealthinfo:xUserHealthInfo:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="xUserHealthInfo">
			<tr>
				<shiro:hasPermission name="xywy:xuserhealthinfo:xUserHealthInfo:edit"><td>
    				<a href="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/form?id=${xUserHealthInfo.id}">修改</a>
					<a href="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/delete?id=${xUserHealthInfo.id}" onclick="return confirmx('确认要删除该用户健康信息吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>