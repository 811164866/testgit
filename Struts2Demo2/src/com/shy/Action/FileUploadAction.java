package com.shy.Action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

public class FileUploadAction{
	private File file;
	private String fileFileName;
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	
	public String uploadFile() throws Exception{
		String root=ServletActionContext.getServletContext().getRealPath("/img");
		System.out.println("�õ��ļ�����"+fileFileName);
		System.out.println("�õ��ļ�����������˾���·����"+root);
		InputStream is=new FileInputStream(file);
		OutputStream os=new FileOutputStream(new File(root,fileFileName));
		byte b[]=new byte[1024];
		int len=0;
		while((len=is.read(b))!=-1){
			os.write(b, 0, len);
			
		}
		os.close();
		is.close();
		ServletActionContext.getRequest().setAttribute("imgSrc", "img/"+fileFileName);
		return "ok";
	}
}
