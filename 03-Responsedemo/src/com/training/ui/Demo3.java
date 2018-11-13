package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo3
 */
@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
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
		PrintWriter out = response.getWriter();
		List<String> playerNames = new ArrayList<>();
		playerNames.add("Kowshik(TL)");
		playerNames.add("Dhoni");
		playerNames.add("virat");
		playerNames.add("YuviKing");
		playerNames.add("Dada");
		playerNames.add("pant");
		playerNames.add("jaddu");
		playerNames.add("Bajji");
		response.setContentType("text/html");
		out.println("<ul>");
		for (String string : playerNames) {
		
			out.print("<li>"+string+"<li>");
			
		
	}
		out.println("<ul>");
	}
}
