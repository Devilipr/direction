<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>用户详情表管理</title>
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
		<li><a href="${ctx}/xywy/xuserdetail/xUserDetail/">用户详情表列表</a></li>
		<li class="active"><a href="${ctx}/xywy/xuserdetail/xUserDetail/form?id=${xUserDetail.id}">用户详情表<shiro:hasPermission name="xywy:xuserdetail:xUserDetail:edit">${not empty xUserDetail.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xywy:xuserdetail:xUserDetail:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="xUserDetail" action="${ctx}/xywy/xuserdetail/xUserDetail/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">用户详细表ID：</label>
			<div class="controls">
				<form:input path="userDetailId" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">xyuser表ID：</label>
			<div class="controls">
				<form:input path="userDetailUserid" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">婚姻状况 1未选择：</label>
			<div class="controls">
				<form:input path="userDetailMarriage" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">年龄：</label>
			<div class="controls">
				<form:input path="userDetailAge" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">座机号：</label>
			<div class="controls">
				<form:input path="userDetailTelphone" htmlEscape="false" maxlength="30" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">居住情况 4其它：</label>
			<div class="controls">
				<form:input path="userDetailLivestatus" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">老人所属服务点（存储的是服务点的ID）：</label>
			<div class="controls">
				<form:input path="userDetailService" htmlEscape="false" maxlength="10" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">经济来源：</label>
			<div class="controls">
				<form:input path="userDetailEconomy" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">月收入：</label>
			<div class="controls">
				<form:input path="userDetailWage" htmlEscape="false" maxlength="7" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">慢性病：</label>
			<div class="controls">
				<form:input path="userDetailDisease" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">血型 1未选择2 A型 3 B型 4  O型 5 AB型 6 特殊血型：</label>
			<div class="controls">
				<form:input path="userDetailBloodType" htmlEscape="false" maxlength="1" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">失能情况：</label>
			<div class="controls">
				<form:input path="userDetailFailStatus" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">残疾情况：</label>
			<div class="controls">
				<form:input path="userDetailDisabilityStatus" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">医疗保障 1其它：</label>
			<div class="controls">
				<form:input path="userDetailHealthcare" htmlEscape="false" maxlength="3" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">医保号：</label>
			<div class="controls">
				<form:input path="userDetailHealthcareCode" htmlEscape="false" maxlength="30" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">文化程度 1未选择：</label>
			<div class="controls">
				<form:input path="userDetailCulture" htmlEscape="false" maxlength="2" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户上班单位：</label>
			<div class="controls">
				<form:input path="userDetailUnit" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户工作职称：</label>
			<div class="controls">
				<form:input path="userDetailJobs" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户特长：</label>
			<div class="controls">
				<form:input path="userDetailSpecialty" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户爱好：</label>
			<div class="controls">
				<form:input path="userDetailHobby" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">用户备注：</label>
			<div class="controls">
				<form:input path="userDetailRemark" htmlEscape="false" maxlength="255" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="xywy:xuserdetail:xUserDetail:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>