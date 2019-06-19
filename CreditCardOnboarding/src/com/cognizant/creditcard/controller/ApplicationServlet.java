package com.cognizant.creditcard.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.creditcard.model.AppBean;
import com.cognizant.creditcard.model.UserBO;

/**
 * Servlet implementation class ApplicationServlet
 */
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("uid");
		String pass=request.getParameter("pass");
		UserBO userbo=new UserBO();
		AppBean appbean=userbo.trackApplication(uid, pass);
		RequestDispatcher dispatcher=null;
		dispatcher=request.getRequestDispatcher("Status.jsp");
		request.setAttribute("msg", appbean);
		request.setAttribute("uid", appbean.getUid());
		request.setAttribute("application_id",appbean.getApplication_id());
		request.setAttribute("application_date",appbean.getApplication_date());
		request.setAttribute("status", appbean.getStatus());
		dispatcher.forward(request, response);
		
	}

}
