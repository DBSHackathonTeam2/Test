package com.ob.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	public RegisterServlet() {
		super();
	}
	    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName  = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String mailId = request.getParameter("mailId");
		String phoneNum = request.getParameter("phoneNum");
		Users users = new Users(firstName, lastName, userName, password, confirmPassword, mailId, phoneNum);
		UsersDAO usersDao = new UsersDAO();
		int x = usersDao.register(users);
		request.setAttribute("userData", users);
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		doGet(request, response);
	}
}
