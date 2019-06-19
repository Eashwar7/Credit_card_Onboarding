package com.cognizant.creditcard.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.creditcard.dao.UserDAO;

public class UserBO 
{
	public AppBean trackApplication(String uid, String pass)
	{
		UserDAO userdao= new UserDAO();
		AppBean appbean=new AppBean();
		boolean result=userdao.valUser(uid,pass);
		if(result)
		{
			appbean=userdao.trackApplication(uid);
		}
		return appbean;
	}
	public UserBean registerUser(UserBean userbean)
	{
		UserDAO userdao= new UserDAO();
		UserBean ub=new UserBean();
		boolean result=userdao.valUser(userbean.getUid(),userbean.getPassword());
		if(result)
		{
			userbean.setStatus('t');
			userdao.insertUser(userbean);
			
		}
		else
			return ub; 
		ub=userdao.fetchUser(userbean.getUid());
		userdao.apply(userbean.getUid());
		return ub;
	}

}