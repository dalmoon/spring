package com.javalec.springmybatis.dao;

import java.util.ArrayList;

import com.javalec.springmybatis.dto.ContentDto;

public interface IDao {
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String mWriter, String mContent);
	public ContentDto viewDao(String strID);
	public void deleteDao(String mId);
}
