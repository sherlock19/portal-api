package com.jade.portal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jade.portal.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<List> getTestList() throws Exception {
		
		List<Map<String, Object>> list = testService.selectTestList(); 
		if(list.isEmpty()) {
			return new ResponseEntity<List>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{idx}", method=RequestMethod.GET)
	public ResponseEntity getTestDetail(@PathVariable("idx") String idx) throws Exception {
				
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("idx", idx);
		
		Map<String, Object> obj = testService.selectTestDetail(map);
		if(obj.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity(obj, HttpStatus.OK);
	}
	
	/*
	@RequestMapping(value="/{txt}", method=RequestMethod.GET)
	public String test(@PathVariable("txt") String txt,
			@RequestParam(value="name", required =false, defaultValue="World") String name) {
		return txt+name;
	}*/
	
	
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
