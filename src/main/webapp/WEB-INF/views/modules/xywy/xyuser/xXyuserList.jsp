<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>用户基本信息管理</title>
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
		<li class="active"><a href="${ctx}/xywy/xyuser/xXyuser/">用户基本信息列表</a></li>
		<shiro:hasPermission name="xywy:xyuser:xXyuser:edit"><li><a href="${ctx}/xywy/xyuser/xXyuser/form">用户基本信息添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="xXyuser" action="${ctx}/xywy/xyuser/xXyuser/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>用户手机号：</label>
				<form:input path="userPhone" htmlEscape="false" maxlength="11" class="input-medium"/>
			</li>
			<li><label>用户姓名：</label>
				<form:input path="username" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>用户手机号</th>
				<th>用户姓名</th>
				<th>身份证号</th>
				<th>1男 2女</th>
				<shiro:hasPermission name="xywy:xyuser:xXyuser:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="xXyuser">
			<tr>
				<td><a href="${ctx}/xywy/xyuser/xXyuser/form?id=${xXyuser.id}">
					${xXyuser.userPhone}
				</a></td>
				<td>
					${xXyuser.username}
				</td>
				<td>
					${xXyuser.user.namecard}
				</td>
				<td>
					${xXyuser.userSex}
				</td>
				<shiro:hasPermission name="xywy:xyuser:xXyuser:edit"><td>
    				<a href="${ctx}/xywy/xyuser/xXyuser/form?id=${xXyuser.id}">修改</a>
					<a href="${ctx}/xywy/xyuser/xXyuser/delete?id=${xXyuser.id}" onclick="return confirmx('确认要删除该用户基本信息吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>