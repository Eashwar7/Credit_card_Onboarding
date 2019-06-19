package com.cognizant.creditcard.dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.creditcard.model.AppBean;
import com.cognizant.creditcard.model.UserBean;
import com.cognizant.creditcard.util.DbConnector;

public class UserDAO 
{
	public void apply(String uid)
	{
		
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		int id=0;
		try
		{
			conn=DbConnector.getConnection();
			Statement s=conn.createStatement();			
			//s=conn.prepareStatement("select application_id from application where application_id=(select max(application_id) from application)");
			rs=s.executeQuery("select application_id from application where application_id=(select max(application_id) from application)");
			while(rs.next()) {
			id=rs.getInt("application_id");
			break;
			}
			st=conn.prepareStatement("insert into application values(?,?,?,'submitted')");
			Date date = new java.util.Date();
			long t = date.getTime();
			st.setString(1, uid);
			st.setInt(2, id+1);
			st.setDate(3, new java.sql.Date(t));
			st.execute();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public AppBean trackApplication(String uid)
	{
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		AppBean appbean=new AppBean();
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
		try
		{
			conn=DbConnector.getConnection();
			st=conn.prepareStatement("select * from application where uid_number=?");
			st.setString(1, uid);
			rs=st.executeQuery();
			if(rs.next())
			{
				appbean.setUid(rs.getString(1));
				appbean.setApplication_id(rs.getString(2));
				appbean.setApplication_date(rs.getDate(3));
				appbean.setStatus(rs.getString(4));
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return appbean;
	}
	public boolean valUser(String uid,String pass) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		boolean result=false;
		try
		{
			conn=DbConnector.getConnection();
			st=conn.prepareStatement("select * from user_exist where uid_number=? and password=?");
			st.setString(1, uid);
			st.setString(2, pass);
			rs=st.executeQuery();
			if(rs.next())
			{
				result=true;
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public void insertUser(UserBean userbean) {
		Connection conn=null;
		PreparedStatement st=null;
		//boolean result=false;
		try
		{
			conn=DbConnector.getConnection();
			st=conn.prepareStatement("insert into user_details values(?,?,?,?,?,?,?,?)");
			st.setString(1, userbean.getFname());
			st.setString(2, userbean.getLname());
			st.setInt(3, userbean.getAge());
			st.setString(4, userbean.getGender());
			st.setString(5, userbean.getContactno());
			st.setString(6, String.valueOf(userbean.getStatus()));
			st.setString(7, userbean.getUid());
			st.setString(8, userbean.getPassword());
			st.execute();
			/*if(st.execute())
			{
				result=true;
			}*/
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//return result;
	}
	public UserBean fetchUser(String uid)
	{
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement st=null;
		UserBean userbean=new UserBean();
		try
		{
			conn=DbConnector.getConnection();
			st=conn.prepareStatement("select *from user_exist where uid_number=?");
			st.setString(1, uid);
			rs=st.executeQuery();
			while(rs.next())
			{
				userbean.setFname(rs.getString(1));
				userbean.setLname(rs.getString(2));				
				userbean.setAge(rs.getInt(3));
				userbean.setGender(rs.getString(4));
				userbean.setContactno(rs.getString(5));
				userbean.setUid(rs.getString(6));
				userbean.setPassword(rs.getString(7));
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userbean;
	}
}
