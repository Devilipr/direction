<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
		<meta charset="utf-8" />
		<title>${fns:getConfig('productName')} 登录</title>
		<meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"> 
		<link rel="stylesheet" type="text/css" href="${ctxStatic1}/css/initialize.css"/>
		<!--<link rel="stylesheet" type="text/css" href="css/common.css"/>-->
		<link rel="stylesheet" type="text/css" href="${ctxStatic1}/css/login.css"/>
		<script type="text/javascript" src="${ctxStatic1}/js/jquery.js"></script>
		<script type="text/javascript" src="${ctxStatic1}/js/login.js"></script>
	</head>
	<body>
		<header>
			<div class="header-con">
				<img src="${ctxStatic1}/img/dengluzhuce-logo.png"/>
			</div>
		</header>
		<div class="container">
			<form class="form-signin" id="loginForm" class="form-signin" action="${ctx}/login" method="post">
				<h2 class="form-signin-heading">智能硬件后台系统</h2>
				<div class="login-wrap">
					<input type="text" class="form-text tel-box" id="username" name="username" value="${username}" placeholder="请输入账号" maxlength="11"/>
					<input type="password" class="form-text pwd" id="password" name="password" placeholder="请输入密码" />
				</div>
				<!--<p class="alert-box"></p>-->
				<%-- <div class="mask">
					<div class="code-alert">获取验证码成功</div>
				</div>
				<div class="login-else">
					<input type="text" placeholder="请输入验证码" class="form-text test-code"/>
					<span class="img-box">
					<c:if test="${isValidateCodeLogin}"><div class="validateCode">
					<label class="input-label mid" for="validateCode">验证码</label>
					<sys:validateCode name="validateCode" inputCssStyle="margin-bottom:0;"/>
					</div></c:if>
						<img src="img/dengluzhuce-logo.png" />
					</span>
				</div>
				<p class="alert-box"></p> --%>
				<label class="checkbox">
					<input type="checkbox" value="记住密码" />记住密码
				</label>
				<input type="submit" value="登录" class="login"/>
			</form>
		</div>
	</body>
</html>