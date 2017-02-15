package com.shy.ssh.service;

import java.util.List;

import com.shy.ssh.model.DeptBean;

public interface DeptService {
	void addDept(DeptBean d);
	
	List<DeptBean> getDeptBeans(String d);
	
	DeptBean getDeptBean(String d);
}
