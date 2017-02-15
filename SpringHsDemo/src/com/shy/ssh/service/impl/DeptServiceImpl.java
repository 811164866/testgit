package com.shy.ssh.service.impl;

import java.util.List;

import com.shy.ssh.dao.DeptDao;
import com.shy.ssh.model.DeptBean;
import com.shy.ssh.service.DeptService;

public class DeptServiceImpl implements DeptService {
	
	private DeptDao deptDao;

	public DeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public void addDept(DeptBean d) {
		deptDao.addDept(d);
	}

	@Override
	public List<DeptBean> getDeptBeans(String d) {
		List<DeptBean> li=deptDao.getDeptBeans(d);
		return li;
	}

	@Override
	public DeptBean getDeptBean(String d) {
		deptDao.getDeptBean(d);
		return null;
	}

}
