package com.thinkgem.jeesite.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkgem.jeesite.web.vo.Response;

@RestController
@RequestMapping(value = "/api/App/")
public class ApiWapController {
	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	 @RequestMapping(value = "/sendPhoneCodeApp", method = RequestMethod.POST)
	 @ResponseBody
	 public Response sendPhoneCodeApp(HttpServletRequest request, HttpServletResponse response) {
		 	/*String re=request.getParameter("request");
		 
		 	String phone="18810283435";
		 	String code=SmsUtils.getFourRandom();
		 	try {
				SmsUtils.sendSms(phone,code);
				return Response.success();
			} catch (ClientException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			return Response.failure();
	 }
}
