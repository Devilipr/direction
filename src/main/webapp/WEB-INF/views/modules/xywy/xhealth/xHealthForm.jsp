<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>用户APP上一键测量记录管理</title>
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
		<li><a href="${ctx}/xywy/xhealth/xHealth/">用户APP上一键测量记录列表</a></li>
		<li class="active"><a href="${ctx}/xywy/xhealth/xHealth/form?id=${xHealth.id}">用户APP上一键测量记录<shiro:hasPermission name="xywy:xhealth:xHealth:edit">${not empty xHealth.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xywy:xhealth:xHealth:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="xHealth" action="${ctx}/xywy/xhealth/xHealth/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">健康id：</label>
			<div class="controls">
				<form:input path="healthId" htmlEscape="false" maxlength="11" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户id：</label>
			<div class="controls">
				<form:input path="healthUserid" htmlEscape="false" maxlength="11" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">测量时间（精确到秒 Y-m-d H:i:s）：</label>
			<div class="controls">
				<input name="healthDate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${xHealth.healthDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">心率：</label>
			<div class="controls">
				<form:input path="healthHeartRate" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收缩压（高压mmHg）：</label>
			<div class="controls">
				<form:input path="healthBloodPressureHigh" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">舒张压（低压mmHg）：</label>
			<div class="controls">
				<form:input path="healthBloodPressureLow" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">HRV分析 0心电未异常 1心率过缓 2心率过快：</label>
			<div class="controls">
				<form:input path="healthHrvStatus" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">逗号隔开的字符串/100,200,300：</label>
			<div class="controls">
				<form:input path="healthEcgRawData" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">逗号隔开的字符串/100,200,300：</label>
			<div class="controls">
				<form:input path="healthPpgRawData" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">健康总分数：</label>
			<div class="controls">
				<form:input path="healthScoreTotal" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">疲劳指数：</label>
			<div class="controls">
				<form:input path="healthScoreFatigue" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">身心负荷：</label>
			<div class="controls">
				<form:input path="healthScoreMind" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">身体素质：</label>
			<div class="controls">
				<form:input path="healthScoreBody" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">心脏功能：</label>
			<div class="controls">
				<form:input path="healthScoreHeart" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="xywy:xhealth:xHealth:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>