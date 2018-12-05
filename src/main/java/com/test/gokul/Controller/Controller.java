package com.test.gokul.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value="/test", method=RequestMethod.POST)
	@ResponseBody
	private int demoMethod(@RequestParam String username, String password) 
	{
		if(username.equalsIgnoreCase("GBK")) 
		{
			if(password.equals("gbk@123")) 
			{
				return 0;
			}
			else 
			{
				return 1;
			}
		}
		else 
		{
			return 2;
		}
	}
}
