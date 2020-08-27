package com.revature.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher redir = request.getRequestDispatcher("/login.html"); //defining req dispatcher
		redir.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//insert logic for if you want to fail login.
		
		if (request.getParameter("username").equals("Becca")) {
			HttpSession session = request.getSession();			
			session.setAttribute("username", request.getParameter("username"));
			response.sendRedirect("http://localhost:1234/LoginProject/success");
		} else {
			response.sendRedirect("http://localhost:1234/LoginProject/fail");
		}
	}

}
