package com.shy.Action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.shy.Model.Tag;
import com.shy.Model.User;

public class UserAction {
	
	private User user;
	private String yhbh;
	private String agree;
	private String[] check;
	private String[] love;
	private String type;
	private List<Tag> loves=new ArrayList<Tag>();
	private	List<Tag> checks=new ArrayList<Tag>();
	
	public List<Tag> getLoves() {
		return loves;
	}



	public void setLoves(List<Tag> loves) {
		this.loves = loves;
	}



	public List<Tag> getChecks() {
		return checks;
	}



	public void setChecks(List<Tag> checks) {
		this.checks = checks;
	}



	public String getYhbh() {
		return yhbh;
	}



	public void setYhbh(String yhbh) {
		this.yhbh = yhbh;
	}



	public String getAgree() {
		return agree;
	}



	public void setAgree(String agree) {
		this.agree = agree;
	}

	
	
	public String[] getCheck() {
		return check;
	}



	public void setCheck(String[] check) {
		this.check = check;
	}



	public String[] getLove() {
		return love;
	}



	public void setLove(String[] love) {
		this.love = love;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public User getUser() {
		return user;
	}





	public void setUser(User user) {
		this.user = user;
	}



	public String say() throws IOException{
//		HttpServletResponse resp=ServletActionContext.getResponse();
//		resp.getWriter().write("I LOVE YOU");
//		return null;
		if(user.getName().equals("aaa")&&user.getPass().equals("aaa"))
		{
			return "yes";
		}else{
			return "no";
		}
	}
	public String addUser(){
		System.out.println(toString());
		return null;
	}




	@Override
	public String toString() {
		return "UserAction [yhbh=" + yhbh + ", agree=" + agree + ", check=" + Arrays.toString(check) + ", love="
				+ Arrays.toString(love) + ", type=" + type + ", loves=" + loves + ", checks=" + checks + "]";
	}

	
	
	


	public String showJapTagJsp(){
		Tag t1=new Tag();
		t1.setLabel("zuqiu");
		t1.setValue("01");
		Tag t2=new Tag();
		t2.setLabel("lanqiu");
		t2.setValue("02");
		Tag t3=new Tag();
		t3.setLabel("paiqiu");
		t3.setValue("03");
		loves.add(t1);
		loves.add(t2);
		loves.add(t3);
		Tag t4=new Tag();
		t4.setLabel("a");
		t4.setValue("a");
		Tag t5=new Tag();
		t5.setLabel("b");
		t5.setValue("b");
		checks.add(t4);
		checks.add(t5);
		return "JapTagJsp";
	}
	
}	
