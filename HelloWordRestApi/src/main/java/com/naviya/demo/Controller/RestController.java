package com.naviya.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/")
	public String firstFucn()
	{
		return "please type /home to go further";
	}
	
	@RequestMapping("/home")
	public String secondFunc()
	{
		return "Welcom to the world of API's";
	}


}

