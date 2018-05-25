package com.jade.portal.dao;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.jade.portal.model.Test;

@Repository("testDAO")
public class TestDAO extends AbstractDAO {
	
	
	@SuppressWarnings("unchecked")
	public List<Test> selectTestModelList() {		
		return (List<Test>)selectList("test.selectTestModelList");
	}
	
	@SuppressWarnings("unchecked")
	public Test selectTestModelDetail(Test test) {		
		return (Test)selectOne("test.selectTestModelDetail", test);
	}
	
	@SuppressWarnings("unchecked")
	public void createTestModel(Test test) {		
		insert("test.createTestModel", test);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectTestMapDetail(Map<String, Object> map) {		
		return (Map<String, Object>)selectOne("test.selectTestMapDetail", map);
	}
	
	public Map<String, Object> selectTestStringDetail(String idx){
		return (Map<String, Object>)selectOne("test.selectTestStringDetail", idx);
	}
	
	public void updateTestModel(Test test) {
		update("test.updateTestModel", test);
	}
	
	public void deleteTestModel(Test test) {
		update("test.deleteTestModel", test);
	}
	
	
/*	@SuppressWarnings("unchecked")
	public void createTest(String contents, String crea_id) {		
		selectOne("test.selectTestDetail", contents);
	}
	*/
/*	@SuppressWarnings("unchecked")
	public List<Test> selectDBTestList(){
		List<Test> listTest = new ArrayList<Test>();
		
		
		return listTest;
		
	}*/

}
