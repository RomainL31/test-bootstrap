package com.example.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	@RequestMapping(value="/",method = RequestMethod.GET)
    public String home(){
        return "report";
    }
    
    @ResponseBody
    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public String Greeting(){
    	return "Message From SpringBoot Service - Hello World!";
    }
}
