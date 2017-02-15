<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="addUser">
	<s:textfield  name="yhbh" label="用户编号"></s:textfield>
	<s:checkbox name="agree" label="是否同意" fieldValue="1"></s:checkbox>
	<!-- 
	<s:checkboxlist list="#{1:'a',2:'b',3:'c'}" listKey="key" listValue="value" label="字母" name="check"></s:checkboxlist>
	<s:checkboxlist list="#{1:'lanqiu',2:'zuqiu'}" listKey="key" listValue="value" label="爱好" name="love"></s:checkboxlist>
	 -->
	<s:checkboxlist list="checks" listKey="value" listValue="label" label="字母" name="check"></s:checkboxlist>
	
	<s:checkboxlist list="loves" listKey="value" listValue="label" label="爱好" name="love"></s:checkboxlist>
	
	<s:radio list="#{1:'NO.1',2:'NO.2'}" listKey="key" listValue="value" name="type"></s:radio>
	
	<s:select list="{}" headerValue="---请选择---" headerKey="0">
		<s:optgroup label="字母大区" list="checks" listKey="value" listValue="label"  ></s:optgroup>
		<s:optgroup label="爱好大区" list="loves" listKey="value" listValue="label"  ></s:optgroup>
	</s:select>
	
	<s:submit label="注册" type="button"></s:submit>
</s:form>
</body>
</html>