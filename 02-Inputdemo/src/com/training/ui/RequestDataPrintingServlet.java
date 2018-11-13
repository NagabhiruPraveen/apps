package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDataPrintingServlet
 */
@WebServlet("/rdps")
public class RequestDataPrintingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		request.getRequestURI();
		out.println("<br>");
			out.println(request.getRequestURL());
			out.println("<br>");
			out.println(request.getServerName());
			out.println("<br>");
			out.println(request.getServerPort());
			out.println("<br>");
			out.println(request.getServletPath());
			out.println("<br>");
			out.println(request.getLocale());
			out.println("<br>");
			out.println(request.getLocalName());
			out.println("<br>");
			out.println(request.getRemoteAddr());
			out.println("<br>");
			out.println(request.getRemotePort());
			out.println("<br>");
			out.println(request.getRemoteHost());
			out.println("<br>");
			out.println(request.getRemoteUser());
	
	}

}
