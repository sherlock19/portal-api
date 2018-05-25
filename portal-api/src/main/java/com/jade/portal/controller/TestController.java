package com.jade.portal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jade.portal.common.CommandMap;
import com.jade.portal.model.Test;
import com.jade.portal.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/model", method=RequestMethod.GET)
	public ResponseEntity<List<Test>> getTestModelAll() throws Exception {
		
		List<Test> testList = testService.selectTestModelList(); 
		if(testList.isEmpty()) {
			return new ResponseEntity<List<Test>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Test>>(testList, HttpStatus.OK);
	}	
	
	@RequestMapping(value="/model/{idx}", method=RequestMethod.GET)
	public ResponseEntity<Test> getTestModelDetail(@PathVariable("idx") String idx) throws Exception {
				
		Test test = new Test();
		test.setIdx(idx);
		
		Test newTest = testService.selectTestModelDetail(test);
		if(newTest == null) {
			return new ResponseEntity<Test>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Test>(newTest, HttpStatus.OK);
	}
	
	@RequestMapping(value="/model", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void createTest (@RequestBody Test test) throws Exception {
		testService.createTestModel(test);
	}
	
	@RequestMapping(value="/model/model", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void createTestModel (@ModelAttribute Test test) throws Exception {
		testService.createTestModel(test);
	}
	
	@RequestMapping(value="/model/model/{idx}", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void updateTestModel (@RequestBody Test test, @PathVariable("idx") String idx) throws Exception {
		testService.updateTestModel(test);
	}
	
	@RequestMapping(value="/map/{idx}", method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getTestMapDetail(@PathVariable("idx") String idx) throws Exception {
				
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("idx", idx);
		
		Map<String, Object> obj = testService.selectTestMapDetail(map);
		if(obj.isEmpty()) {
			return new ResponseEntity<Map<String, Object>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Map<String, Object>>(obj, HttpStatus.OK);
	}
	
	@RequestMapping(value="/string/{idx}", method=RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getTestStringDetail(@PathVariable("idx") String idx) throws Exception {

		
		Map<String, Object> obj = testService.selectTestStringDetail(idx);
		if(obj.isEmpty()) {
			return new ResponseEntity<Map<String, Object>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Map<String, Object>>(obj, HttpStatus.OK);
	}

	@RequestMapping(value="/string", method=RequestMethod.POST, consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces="text/plain;charset=UTF-8")
	@ResponseStatus(HttpStatus.CREATED)
	public void createTestString (String contents, String crea_id) throws Exception {
		Test test = new Test();
		test.setContents(contents);
		test.setCrea_id(crea_id);
		
		testService.createTestModel(test);
	}


	 	



/*	@RequestMapping(value="/db/", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Test> getAllTest(){
		List<Test> testObj = testService.selectDBTestList();
		return testObj;
	}
	
	@RequestMapping(value="/db/{idx}", method=RequestMethod.GET, headers="Accept=application/json")
	public Test getTest(@PathVariable String idx) {
		Test test = testService.selectDBTestDetail(idx);
		return test;
	}
	*/
	/*
	@RequestMapping(value="/{txt}", method=RequestMethod.GET)
	public String test(@PathVariable("txt") String txt,
			@RequestParam(value="name", required =false, defaultValue="World") String name) {
		return txt+name;
	}*/
	

/*	
	@RequestMapping(value="/", method=RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String test (@RequestBody String jsonStr  ) {
		return jsonStr;
	}*/

	

	
/*	@RequestMapping(value="/{id}", method=RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public String test (@PathVariable("id") String id,
			@RequestParam(value="name", required=false, defaultValue="World") String name,  
			@RequestParam(value="num", required=false, defaultValue="1") Integer num  ) {
		return id+" "+name+" "+num;
	}*/
}
