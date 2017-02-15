package com.shy.ssh.dao;

import java.util.List;

import com.shy.ssh.model.DeptBean;

public interface DeptDao {
	void addDept(DeptBean d);
	
	List<DeptBean> getDeptBeans(String d);
	
	DeptBean getDeptBean(String d);
}
