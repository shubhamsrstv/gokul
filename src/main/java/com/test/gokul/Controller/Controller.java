package com.test.gokul.Controller;

import org.springframework.web.bind.annotation.*;

import com.test.gokul.beans.Entity;

@org.springframework.stereotype.Controller
public class Controller {

	Entity ent = new Entity();

	@CrossOrigin
	@RequestMapping(value="/test", method=RequestMethod.POST)
	@ResponseBody
	private Entity demoMethod(@RequestParam String username, String password)
	{
		if(username.equalsIgnoreCase("GBK")) 
		{
			if(password.equals("gbk@123")) 
			{
				ent.setValue(0);
				return ent;
			}
			else 
			{
				ent.setValue(1);
				return ent;
			}
		}
		else 
		{
			ent.setValue(2);
			return ent;
		}
	}
}
