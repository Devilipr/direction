package com.thinkgem.jeesite.web.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.exceptions.ClientException;
import com.thinkgem.jeesite.common.utils.AESCrypt;
import com.thinkgem.jeesite.common.utils.SmsUtils;

@RestController
@RequestMapping(value = "/api/App/")
public class ApiWapController {
	 private Logger logger = LoggerFactory.getLogger(this.getClass());
	 @RequestMapping(value = "/sendPhoneCodeApp", method = RequestMethod.POST)
	 @ResponseBody
	 public String sendPhoneCodeApp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 
		 String re=request.getParameter("request");
		 String code=SmsUtils.getFourRandom();
		 //String re = "h8fUcVl3mhIoa2oTIdn0JuvRDPWycMAewgNMmbZy+bB5Lzr0I6vGr2JRwYrLC7V17Jqim/6cdH/r59s0aH0MYQeQjRnuy20A0T8My2wDOeoNAiEeQvK1T3dOO9rxyEFHYZuT4kKT1aSu6QC9G40DRMOlEAMNWgiFwxLzh/6x6icapYmfR0t3t8Hs+jnHKRTAiGkpnc9FWnLSR/IQKRHYrYp5STErGLLZOIcJGy9ZPMJWrMyIyJzBetqA5oLMIxu3QrvHE+3Km2+0kliZkEhR+mlChrWk9V8k6oayVNSlXBBtcgX/f4G0uNadrCmBNZquAtSutYOkYW23ooyDWKGC6g==";
		 	try {
		 		AESCrypt aes=new AESCrypt();
				String json=aes.decrypt(re);
//				String json = "{\"time\":1472139660,\"user_password\":\"1111\",\"user_phone\":\"18612345678\",\"sign\":\"QuCRzejbYWKAB0CaxDEnFuwuLtye5rtzkZ248Cz1Owwy3o+Zj9mhUeEEChiGq9HOXYe8OZ8Tvn0gNpWfAJDK8ZVmWLhURmhaTaaUPjGppUuPciLZuQBF1\\/kQ09VRP0evKHdbwmx5k7OrbyUaHa8oqv58GHXg30XHlhYXp1rkgVg=\"}";
				System.out.println(json);
				Map mapTypes = JSON.parseObject(json); 
				String phone=(String) mapTypes.get("user_phone");
			 	SmsUtils.sendSms(phone,code);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return "";
			}
		 	AESCrypt aes1=new AESCrypt(); 
		 	Map<String,String> map = new HashMap<String,String>();
		 	map.put("status","1");
		 	map.put("msg","获取短信验证码成功");
		 	map.put("data",code);
		 	String da=aes1.encrypt(JSONUtils.toJSONString(map));
		 	System.out.println(da);
		 	Map<String,String> map1 = new HashMap<String,String>();
		 	map1.put("response", da);
			return JSONUtils.toJSONString(map1);
	 }
	 public static void main(String[] args) {
		
	}
}
