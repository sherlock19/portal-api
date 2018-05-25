package com.jade.portal.model;

import java.sql.Date;

public class Test {
	private String idx;
	private String contents;
	private String del_gb;
	private Date crea_dtm;
	private String crea_id;
	
	public Test() {
		
	}
	
	public Test(String contents, String crea_id) {
		this.contents = contents;
		this.crea_id = crea_id;
	}
	
	public void setIdx(String idx) {
		this.idx = idx;
	}
	
	public String getIdx() {
		return idx;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setDel_gb(String del_gb) {
		this.del_gb = del_gb;
	}
	
	public String getDel_gb() {
		return del_gb;
	}
	
	public void setCrea_dtm(Date crea_dtm) {
		this.crea_dtm = crea_dtm;
	}
	
	public Date getCrea_dtm() {
		return crea_dtm;
	}	
	
	public void setCrea_id(String crea_id) {
		this.crea_id = crea_id;
	}
	
	public String getCrea_id() {
		return crea_id;
	}
	
	@Override
	public String toString() {
		return "idx : "+idx+"contents : "+contents+"del_gb : "+del_gb+"crea_dtm : "+crea_dtm+"crea_id : "+crea_id;
	}
}
