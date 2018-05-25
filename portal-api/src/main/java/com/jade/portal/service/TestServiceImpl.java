package com.jade.portal.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jade.portal.dao.TestDAO;
import com.jade.portal.model.Test;

@Service("testService")
@Transactional
public class TestServiceImpl implements TestService {
	Logger log = Logger.getLogger(this.getClass());
	
	private static Test test;
	
	@Autowired
	private TestDAO testDAO;
	
	@Override
	public List<Test> selectTestModelList() throws Exception {
		return testDAO.selectTestModelList();
	}

	@Override
	public Test selectTestModelDetail(Test test) throws Exception {
		// TODO Auto-generated method stub
		return testDAO.selectTestModelDetail(test);
	}
	
	@Override
	public void createTestModel(Test test) throws Exception {
		// TODO Auto-generated method stub
		testDAO.createTestModel(test);
	}

	@Override
	public Map<String, Object> selectTestMapDetail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return testDAO.selectTestMapDetail(map);
	}

	@Override
	public Map<String, Object> selectTestStringDetail(String idx) throws Exception {
		// TODO Auto-generated method stub
		return testDAO.selectTestStringDetail(idx);
	}

	@Override
	public void updateTestModel(Test test) throws Exception {
		// TODO Auto-generated method stub
		testDAO.updateTestModel(test);
		
	}

	@Override
	public void deleteTestModel(Test test) throws Exception {
		// TODO Auto-generated method stub
		testDAO.deleteTestModel(test);
	}

/*	@Override
	public void createTest(String contents, String crea_id) throws Exception {
		// TODO Auto-generated method stub
		testDAO.createTest(contents, crea_id);
		
	}*/

/*	@Override
	public List<Test> selectDBTestList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Test selectDBTestDetail(String idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}*/

	

}
