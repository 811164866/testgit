<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传下载</title>
</head>
<body>
　　<form action="uploadAction" method="post" enctype="multipart/form-data">
    　　	<table>
    		<tr>
    			<td>file: </td><td> <input type="file" name="file"><a href="fileDownload">下载</a></td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center"><input type="submit" value="上传"></td>
    		</tr>
    	</table>
    </form>
</body>
</html>