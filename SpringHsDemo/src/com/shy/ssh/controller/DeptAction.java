package com.shy.ssh.controller;

import java.util.List;

import com.shy.ssh.model.DeptBean;
import com.shy.ssh.service.DeptService;
import com.shy.ssh.service.impl.DeptServiceImpl;

/**
 * 文档注释
 * 
 * @author lenovo
 *
 */
public class DeptAction {

	private DeptBean dept;

	/*
	 * 用来接收页面输入的参数（dept）
	 */
	public DeptBean getDept() {
		return dept;
	}

	public void setDept(DeptBean dept) {
		this.dept = dept;
	}

	/*
	 * 用来执行业务层代码
	 */
	private DeptService deptService;

	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}

	public String addDept() {
		// 调用业务层方法保存数据
		deptService.addDept(dept);
		return "ok";
	}
	
	public List<DeptBean> getDeptBeans(){
		List<DeptBean> li=deptService.getDeptBeans("部");
		return li;
	}
}
