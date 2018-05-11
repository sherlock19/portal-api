package com.jade.portal.controller;

import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public String test (@PathVariable("id") String id,
			@RequestParam(value="name", required =false, defaultValue="World") String n) {
		return id+n;
	}

}
