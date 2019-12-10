package com.woniu;

import java.io.Serializable;

public class Test implements Serializable{

   private Integer id;
   private String deptName;
public Test(Integer id, String deptName) {
	super();
	this.id = id;
	this.deptName = deptName;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
@Override
public String toString() {
	return "Test [id=" + id + ", deptName=" + deptName + "]";
}
}
