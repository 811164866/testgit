package com.shy.ssh.controller;

import java.util.List;

import com.shy.ssh.model.DeptBean;
import com.shy.ssh.service.DeptService;
import com.shy.ssh.service.impl.DeptServiceImpl;

/**
 * �ĵ�ע��
 * 
 * @author lenovo
 *
 */
public class DeptAction {

	private DeptBean dept;

	/*
	 * ��������ҳ������Ĳ�����dept��
	 */
	public DeptBean getDept() {
		return dept;
	}

	public void setDept(DeptBean dept) {
		this.dept = dept;
	}

	/*
	 * ����ִ��ҵ������
	 */
	private DeptService deptService;

	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}

	public String addDept() {
		// ����ҵ��㷽����������
		deptService.addDept(dept);
		return "ok";
	}
	
	public List<DeptBean> getDeptBeans(){
		List<DeptBean> li=deptService.getDeptBeans("��");
		return li;
	}
}
