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
		<li><a href="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/">用户健康信息列表</a></li>
		<li class="active"><a href="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/form?id=${xUserHealthInfo.id}">用户健康信息<shiro:hasPermission name="xywy:xuserhealthinfo:xUserHealthInfo:edit">${not empty xUserHealthInfo.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="xywy:xuserhealthinfo:xUserHealthInfo:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="xUserHealthInfo" action="${ctx}/xywy/xuserhealthinfo/xUserHealthInfo/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">user_health_info_id：</label>
			<div class="controls">
				<form:input path="userHealthInfoId" htmlEscape="false" maxlength="11" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_userid：</label>
			<div class="controls">
				<form:input path="userHealthInfoUserid" htmlEscape="false" maxlength="11" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_zilinengli：</label>
			<div class="controls">
				<form:input path="userHealthInfoZilinengli" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_renzhinengli：</label>
			<div class="controls">
				<form:input path="userHealthInfoRenzhinengli" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_shentimailv：</label>
			<div class="controls">
				<form:input path="userHealthInfoShentimailv" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_shentitiwen：</label>
			<div class="controls">
				<form:input path="userHealthInfoShentitiwen" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_shengao：</label>
			<div class="controls">
				<form:input path="userHealthInfoShengao" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_tizhong：</label>
			<div class="controls">
				<form:input path="userHealthInfoTizhong" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_yaowei：</label>
			<div class="controls">
				<form:input path="userHealthInfoYaowei" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_tunwei：</label>
			<div class="controls">
				<form:input path="userHealthInfoTunwei" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_huxipinlv：</label>
			<div class="controls">
				<form:input path="userHealthInfoHuxipinlv" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_tizhizhishu：</label>
			<div class="controls">
				<form:input path="userHealthInfoTizhizhishu" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_zuocexueya：</label>
			<div class="controls">
				<form:input path="userHealthInfoZuocexueya" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_youcexueya：</label>
			<div class="controls">
				<form:input path="userHealthInfoYoucexueya" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_yinshixiguan：</label>
			<div class="controls">
				<form:input path="userHealthInfoYinshixiguan" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_duanlianpinlv：</label>
			<div class="controls">
				<form:input path="userHealthInfoDuanlianpinlv" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_xiyanqingkuang：</label>
			<div class="controls">
				<form:input path="userHealthInfoXiyanqingkuang" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_yinjiuqingkuang：</label>
			<div class="controls">
				<form:input path="userHealthInfoYinjiuqingkuang" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_congyeshijian：</label>
			<div class="controls">
				<form:input path="userHealthInfoCongyeshijian" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_shifouzaizhi：</label>
			<div class="controls">
				<form:input path="userHealthInfoShifouzaizhi" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_zhiyegongzhong：</label>
			<div class="controls">
				<form:input path="userHealthInfoZhiyegongzhong" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_zhiyebingqingkuang：</label>
			<div class="controls">
				<form:input path="userHealthInfoZhiyebingqingkuang" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_fenchenfanghucuoshi：</label>
			<div class="controls">
				<form:input path="userHealthInfoFenchenfanghucuoshi" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_fangshefanghucuoshi：</label>
			<div class="controls">
				<form:input path="userHealthInfoFangshefanghucuoshi" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_wuliufanghucuoshi：</label>
			<div class="controls">
				<form:input path="userHealthInfoWuliufanghucuoshi" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_huaxuefanghucuoshi：</label>
			<div class="controls">
				<form:input path="userHealthInfoHuaxuefanghucuoshi" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_kouchun：</label>
			<div class="controls">
				<form:input path="userHealthInfoKouchun" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_chilie：</label>
			<div class="controls">
				<form:input path="userHealthInfoChilie" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_yanbu：</label>
			<div class="controls">
				<form:input path="userHealthInfoYanbu" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_tingli：</label>
			<div class="controls">
				<form:input path="userHealthInfoTingli" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_zuoyanshili：</label>
			<div class="controls">
				<form:input path="userHealthInfoZuoyanshili" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_youyanshili：</label>
			<div class="controls">
				<form:input path="userHealthInfoYouyanshili" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_jiaozhengzuoyan：</label>
			<div class="controls">
				<form:input path="userHealthInfoJiaozhengzuoyan" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_jiaozhengyouyan：</label>
			<div class="controls">
				<form:input path="userHealthInfoJiaozhengyouyan" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_pifu：</label>
			<div class="controls">
				<form:input path="userHealthInfoPifu" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_kongmo：</label>
			<div class="controls">
				<form:input path="userHealthInfoKongmo" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_linbajie：</label>
			<div class="controls">
				<form:input path="userHealthInfoLinbajie" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_tongzhuangxiong：</label>
			<div class="controls">
				<form:input path="userHealthInfoTongzhuangxiong" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_luoyin：</label>
			<div class="controls">
				<form:input path="userHealthInfoLuoyin" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_xinlv：</label>
			<div class="controls">
				<form:input path="userHealthInfoXinlv" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_xinlvv：</label>
			<div class="controls">
				<form:input path="userHealthInfoXinlvv" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_zayin：</label>
			<div class="controls">
				<form:input path="userHealthInfoZayin" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_xiongbuyatong：</label>
			<div class="controls">
				<form:input path="userHealthInfoXiongbuyatong" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_fububaokuai：</label>
			<div class="controls">
				<form:input path="userHealthInfoFububaokuai" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_pida：</label>
			<div class="controls">
				<form:input path="userHealthInfoPida" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_ganda：</label>
			<div class="controls">
				<form:input path="userHealthInfoGanda" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_fubuyidongzhuoyin：</label>
			<div class="controls">
				<form:input path="userHealthInfoFubuyidongzhuoyin" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_xiazhishuizhong：</label>
			<div class="controls">
				<form:input path="userHealthInfoXiazhishuizhong" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_zubeidongmai：</label>
			<div class="controls">
				<form:input path="userHealthInfoZubeidongmai" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_gangmen：</label>
			<div class="controls">
				<form:input path="userHealthInfoGangmen" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_ruxian：</label>
			<div class="controls">
				<form:input path="userHealthInfoRuxian" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_gongjing：</label>
			<div class="controls">
				<form:input path="userHealthInfoGongjing" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_gongti：</label>
			<div class="controls">
				<form:input path="userHealthInfoGongti" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_waiyin：</label>
			<div class="controls">
				<form:input path="userHealthInfoWaiyin" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_yindao：</label>
			<div class="controls">
				<form:input path="userHealthInfoYindao" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_fujian：</label>
			<div class="controls">
				<form:input path="userHealthInfoFujian" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_penqiang：</label>
			<div class="controls">
				<form:input path="userHealthInfoPenqiang" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">user_health_info_qitabeizhu：</label>
			<div class="controls">
				<form:input path="userHealthInfoQitabeizhu" htmlEscape="false" maxlength="500" class="input-xlarge "/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="xywy:xuserhealthinfo:xUserHealthInfo:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>