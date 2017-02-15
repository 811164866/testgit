package com.shy.Action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

public class FileDownloadAction
{
	//声明下载文件流(struts)
	private InputStream downFile;	
	//声明下载地址
	private String filepath;
	//声明下载文件名称
	private String fname;
     
    public void setdownFile(InputStream dowoFile) {
		this.downFile = dowoFile;
	}
    public void setFname(String fname) {
		this.fname = fname;
	}
    public String getFname() {
		return fname;
	}
    public InputStream getDownFile() {
        return ServletActionContext.getServletContext().getResourceAsStream(filepath);
	}
    
    public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}


    public String exe1() throws Exception{
		setFilepath("img\\1.jpg");
    	System.out.println(ServletActionContext.getServletContext().getRealPath("/")+""+filepath);
        return "ok";
    }
}