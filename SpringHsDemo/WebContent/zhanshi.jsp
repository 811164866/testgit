<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shy.ssh.model.*" import="com.shy.ssh.service.*" import="com.shy.ssh.service.impl.*" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="getDeptBeans">
	<table>
	<%
	DeptService ds=new DeptServiceImpl();
	List<DeptBean> ls=ds.getDeptBeans("部");
	System.out.print(ls.size());		
	%>
		<tr>
			<td>部门编号</td><td>部门名</td>
		</tr>
		
		<tr>
			
		</tr>
	</table>
</form>
</body>
</html>