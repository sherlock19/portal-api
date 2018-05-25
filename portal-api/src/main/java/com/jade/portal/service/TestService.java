package com.jade.portal.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.jade.portal.model.Test;

public interface TestService {
	List<Test> selectTestModelList() throws Exception;
	Test selectTestModelDetail(Test test) throws Exception;
	void createTestModel(Test test) throws Exception;
	Map<String, Object> selectTestMapDetail(Map<String, Object> map) throws Exception;
	Map<String, Object> selectTestStringDetail(String idx) throws Exception;
	void updateTestModel(Test test) throws Exception;
	void deleteTestModel(Test test) throws Exception;
/*	List<Test> selectDBTestList() throws Exception;
	Test selectDBTestDetail(String idx) throws Exception;*/
	/*void createTest(String contents, String crea_id) throws Exception;
*/
}
