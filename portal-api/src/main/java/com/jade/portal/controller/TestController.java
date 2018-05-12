package com.jade.portal.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String test() {		
		return "getTest";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String test(@PathVariable("id") String id,
			@RequestParam(value="name", required =false, defaultValue="World") String name) {
		return id+name;
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String test (@RequestBody String jsonStr  ) {
		return jsonStr;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String test (@PathVariable("id") String id,
			@RequestParam(value="name", required=false, defaultValue="World") String name,  
			@RequestParam(value="num", required=false, defaultValue="1") Integer num  ) {
		return id+" "+name+" "+num;
	}
}
