package com.javalec.springmybatis.dto;

public class ContentDto {
	
	int mId;
	String mWriter;
	String mContent;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmWriter() {
		return mWriter;
	}
	public void setmWriter(String mWriter) {
		this.mWriter = mWriter;
	}
	public String getmContent() {
		return mContent;
	}
	public void setmContent(String mContent) {
		this.mContent = mContent;
	}
	public ContentDto(int mId, String mWriter, String mContent) {
		super();
		this.mId = mId;
		this.mWriter = mWriter;
		this.mContent = mContent;
	}
	
	public ContentDto() {
		// TODO Auto-generated constructor stub
	}
}
