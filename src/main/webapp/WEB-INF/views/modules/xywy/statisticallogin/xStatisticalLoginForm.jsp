<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>上线统计表管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/xywy/statisticallogin/xStatisticalLogin/">上线统计表列表</a></li>
		<li class="active"><a href="${ctx}/xywy/statisticallogin/xStatisticalLogin/form?id=${xStatisticalLogin.id}">上线统计表<shiro:hasPermission name="xywy:statisticallogin:xStatisticalLogin:edit">${not empty xStatisticalLogin.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xywy:statisticallogin:xStatisticalLogin:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="xStatisticalLogin" action="${ctx}/xywy/statisticallogin/xStatisticalLogin/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">上线统计表ID：</label>
			<div class="controls">
				<form:input path="statisticalLoginId" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">日期 如20180101不带时分秒的时间戳：</label>
			<div class="controls">
				<form:input path="statisticalLoginTime" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">上线总人数(每天)：</label>
			<div class="controls">
				<form:input path="statisticalLoginTotal" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="xywy:statisticallogin:xStatisticalLogin:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>