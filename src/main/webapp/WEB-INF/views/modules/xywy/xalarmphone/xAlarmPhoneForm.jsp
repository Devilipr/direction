<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>报警器设置电话记录管理</title>
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
		<li><a href="${ctx}/xywy/xalarmphone/xAlarmPhone/">报警器设置电话记录列表</a></li>
		<li class="active"><a href="${ctx}/xywy/xalarmphone/xAlarmPhone/form?id=${xAlarmPhone.id}">报警器设置电话记录<shiro:hasPermission name="xywy:xalarmphone:xAlarmPhone:edit">${not empty xAlarmPhone.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xywy:xalarmphone:xAlarmPhone:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="xAlarmPhone" action="${ctx}/xywy/xalarmphone/xAlarmPhone/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">id：</label>
			<div class="controls">
				<form:input path="alarmPhoneId" htmlEscape="false" maxlength="11" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">主机号：</label>
			<div class="controls">
				<form:input path="alarmPhoneHostid" htmlEscape="false" maxlength="6" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">报警电话1：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum1" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">拨号开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum1Tel" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">短信开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum1Msg" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">报警电话2：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum2" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">拨号开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum2Tel" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">短信开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum2Msg" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">报警电话3：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum3" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">拨号开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum3Tel" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">短信开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum3Msg" htmlEscape="false" maxlength="1" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">报警电话4：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum4" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">拨号开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum4Tel" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">短信开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum4Msg" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">报警电话5：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum5" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">拨号开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum5Tel" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">短信开关，0-关闭，1-打开：</label>
			<div class="controls">
				<form:input path="alarmPhoneNum5Msg" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="xywy:xalarmphone:xAlarmPhone:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>