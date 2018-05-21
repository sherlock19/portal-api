package com.jade.portal.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jade.portal.dao.TestDAO;

@Service("testService")
public class TestServiceImpl implements TestService {
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private TestDAO testDAO;
	
	@Override
	public List<Map<String, Object>> selectTestList() throws Exception {
		return testDAO.selectTestList();
	}

	@Override
	public Map<String, Object> selectTestDetail(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return testDAO.selectTestDetail(map);
	}

	

}
