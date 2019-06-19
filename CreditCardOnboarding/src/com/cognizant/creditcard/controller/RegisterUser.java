package com.cognizant.creditcard.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.creditcard.dao.UserDAO;
import com.cognizant.creditcard.model.UserBO;
import com.cognizant.creditcard.model.UserBean;

/**
 * Servlet implementation class RegisterUser
 */
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("uid");
        String fn=request.getParameter("fname");
        String ln=request.getParameter("lname");
        String bc=request.getParameter("age");
        int age=Integer.parseInt(bc);
        String gend=request.getParameter("gender");
        String cno=request.getParameter("number");     
        String pwd=request.getParameter("pwd");
		UserBean userbean=new UserBean();
		userbean.setFname(fn);
		userbean.setLname(ln);
		userbean.setAge(age);
		userbean.setGender(gend);
		userbean.setContactno(cno);
		userbean.setUid(uid);
		userbean.setPassword(pwd);
		UserBO userbo=new UserBO();		
		userbean=userbo.registerUser(userbean);	
		RequestDispatcher dispatcher=null;
		if(userbean.getUid().equals(uid))
		{
			dispatcher=request.getRequestDispatcher("Success.jsp");
			request.setAttribute("fname", userbean.getFname());
			request.setAttribute("lname",userbean.getLname());
			request.setAttribute("uid",userbean.getUid());
			request.setAttribute("msg", "Details verified successfully done");
			dispatcher.forward(request, response);
		}
		else
		{
			dispatcher=request.getRequestDispatcher("Failure.jsp");
			request.setAttribute("msg", "Please provide the correct details");
			dispatcher.forward(request, response);
			
		}
	}

}
