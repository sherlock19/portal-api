package com.jade.portal.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("testDAO")
public class TestDAO extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectTestList() {		
		return (List<Map<String, Object>>)selectList("test.selectTestList");
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectTestDetail(Map<String, Object> map) {		
		return (Map<String, Object>)selectOne("test.selectTestDetail", map);
	}

}
