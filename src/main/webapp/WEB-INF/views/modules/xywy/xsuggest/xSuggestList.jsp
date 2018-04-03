<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>用户意见反馈管理</title>
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
		<li class="active"><a href="${ctx}/xywy/xsuggest/xSuggest/">用户意见反馈列表</a></li>
		<shiro:hasPermission name="xywy:xsuggest:xSuggest:edit"><li><a href="${ctx}/xywy/xsuggest/xSuggest/form">用户意见反馈添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="xSuggest" action="${ctx}/xywy/xsuggest/xSuggest/" method="post" class="breadcrumb form-search">
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
				<shiro:hasPermission name="xywy:xsuggest:xSuggest:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="xSuggest">
			<tr>
				<shiro:hasPermission name="xywy:xsuggest:xSuggest:edit"><td>
    				<a href="${ctx}/xywy/xsuggest/xSuggest/form?id=${xSuggest.id}">修改</a>
					<a href="${ctx}/xywy/xsuggest/xSuggest/delete?id=${xSuggest.id}" onclick="return confirmx('确认要删除该用户意见反馈吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>