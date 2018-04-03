<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>用户健康信息管理</title>
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
		<li><a href="${ctx}/xywy/xuserhealth/xUserHealth/">用户健康信息列表</a></li>
		<li class="active"><a href="${ctx}/xywy/xuserhealth/xUserHealth/form?id=${xUserHealth.id}">用户健康信息<shiro:hasPermission name="xywy:xuserhealth:xUserHealth:edit">${not empty xUserHealth.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xywy:xuserhealth:xUserHealth:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="xUserHealth" action="${ctx}/xywy/xuserhealth/xUserHealth/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">用户健康信息表：</label>
			<div class="controls">
				<form:input path="userHealthId" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">xyuser表ID：</label>
			<div class="controls">
				<form:input path="userHealthUserid" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">健康总分数：</label>
			<div class="controls">
				<form:input path="userHealthScoreTotal" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">疲劳指数：</label>
			<div class="controls">
				<form:input path="userHealthScoreFatigue" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">身心负荷：</label>
			<div class="controls">
				<form:input path="userHealthScoreMind" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">身体素质：</label>
			<div class="controls">
				<form:input path="userHealthScoreBody" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">心脏功能：</label>
			<div class="controls">
				<form:input path="userHealthScoreHeart" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">睡眠分析，总时间（分钟）：</label>
			<div class="controls">
				<form:input path="userHealthSleepTotal" htmlEscape="false" maxlength="4" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">睡眠目标（分钟）：</label>
			<div class="controls">
				<form:input path="userHealthSleepTarget" htmlEscape="false" maxlength="4" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">PPG心率(bpm)：</label>
			<div class="controls">
				<form:input path="userHealthHeartRatePpg" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">ECG心率(bpm)：</label>
			<div class="controls">
				<form:input path="userHealthHeartRateEcg" htmlEscape="false" maxlength="4" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">ECG高压(mmHg）：</label>
			<div class="controls">
				<form:input path="userHealthBloodPressureHigh" htmlEscape="false" maxlength="4" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">ECG低压(mmHg）：</label>
			<div class="controls">
				<form:input path="userHealthBloodPressureLow" htmlEscape="false" maxlength="4" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">HRV分析 0心电未异常 1心率过缓 2心率过快：</label>
			<div class="controls">
				<form:input path="userHealthHrvStatus" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="xywy:xuserhealth:xUserHealth:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>