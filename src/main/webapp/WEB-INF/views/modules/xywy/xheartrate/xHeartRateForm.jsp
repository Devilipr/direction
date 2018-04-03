<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>用户睡眠心率及全天心率记录管理</title>
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
		<li><a href="${ctx}/xywy/xheartrate/xHeartRate/">用户睡眠心率及全天心率记录列表</a></li>
		<li class="active"><a href="${ctx}/xywy/xheartrate/xHeartRate/form?id=${xHeartRate.id}">用户睡眠心率及全天心率记录<shiro:hasPermission name="xywy:xheartrate:xHeartRate:edit">${not empty xHeartRate.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xywy:xheartrate:xHeartRate:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="xHeartRate" action="${ctx}/xywy/xheartrate/xHeartRate/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">心率id：</label>
			<div class="controls">
				<form:input path="heartRateId" htmlEscape="false" maxlength="11" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户id：</label>
			<div class="controls">
				<form:input path="heartRateUserid" htmlEscape="false" maxlength="11" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">日期（Y-m-d）：</label>
			<div class="controls">
				<input name="heartRateDate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${xHeartRate.heartRateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">原始数据（24条，逗号隔开）：</label>
			<div class="controls">
				<form:input path="heartRateRawData" htmlEscape="false" maxlength="255" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">睡眠平均心率（bpm）：</label>
			<div class="controls">
				<form:input path="heartRateSleepAvg" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">全天最大心率（bpm）：</label>
			<div class="controls">
				<form:input path="heartRateAlldayMax" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">全天最小心率（bpm）：</label>
			<div class="controls">
				<form:input path="heartRateAlldayMin" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">全天平均心率（bpm）：</label>
			<div class="controls">
				<form:input path="heartRateAlldayAvg" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="xywy:xheartrate:xHeartRate:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>