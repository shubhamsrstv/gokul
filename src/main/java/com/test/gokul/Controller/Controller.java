package com.test.gokul.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.gokul.beans.Entity;

@org.springframework.stereotype.Controller
public class Controller {

	Entity ent = new Entity();
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	@ResponseBody
	private int demoMethod(@RequestParam String username, String password) 
	{
		if(username.equalsIgnoreCase("GBK")) 
		{
			if(password.equals("gbk@123")) 
			{
				ent.setValue(0);
				return ent.getValue();
			}
			else 
			{
				ent.setValue(1);
				return ent.getValue();
			}
		}
		else 
		{
			ent.setValue(2);
			return ent.getValue();
		}
	}
}
