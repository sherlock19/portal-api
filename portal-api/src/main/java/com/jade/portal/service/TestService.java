package com.jade.portal.service;

import java.util.List;
import java.util.Map;

public interface TestService {
	List<Map<String, Object>> selectTestList() throws Exception;
	Map<String, Object> selectTestDetail(Map<String, Object> map) throws Exception;

}
