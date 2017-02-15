package com.shy.ssh.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.shy.ssh.dao.DeptDao;
import com.shy.ssh.model.DeptBean;

public class DeptDaoImpl implements DeptDao {

	private HibernateTemplate hibernateTemplate;
     
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public void addDept(DeptBean d) {
		
		hibernateTemplate.save(d);
	}

	@Override
	public List<DeptBean> getDeptBeans(String d) {
		return hibernateTemplate.execute(new HibernateCallback<List<DeptBean>>() {

			@Override
			public List<DeptBean> doInHibernate(Session session) throws HibernateException, SQLException {
				String sql = "select * from dept where deptname like'%"+d+"%'";
				List<DeptBean> db = (List<DeptBean>)session.createSQLQuery(sql).addEntity(DeptBean.class).list();
				return db;
			}
		});
	}
	

	@Override
	public DeptBean getDeptBean(String d) {
		return hibernateTemplate.execute(new HibernateCallback<DeptBean>() {
			@Override
			public DeptBean doInHibernate(Session session) throws HibernateException, SQLException {
				String sql = "select * from dept where deptno="+d;
				DeptBean db = (DeptBean)session.createSQLQuery(sql).addEntity(DeptBean.class).uniqueResult(); 
				return db;
			}
		});
	}	
	
	
	public static void main(String liu[])
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptDao deptDao = (DeptDao)ac.getBean("deptDao"); 
//		DeptBean db = deptDao.getDeptBean("123");
//		System.out.println(db.getDeptName());
		List<DeptBean> db = deptDao.getDeptBeans("²¿");
		for(DeptBean d:db)
		{
			System.out.println(d.getDeptName());
		}
	}


}
