package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo4
 */
@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String[] subjects={"english","physics","maths"};
		double[] marks ={70.0, 75.0, 85.0};
		response.setContentType("text/html");
		double total=0;
		double average = 0;
		out.println("<table>");
		out.println("<th> subjects </th>"+""+"<th> Marks </th>");
		 for(int i=0;i<subjects.length;i++)
		 {
		out.println("<tr colspan='2'>");
		out.println("<td>"+subjects[i]+"  \t"+marks[i]+"</td>");
		out.println("</tr>");
		total=total+marks[i];
		average=average+marks[i];
		
	}
		 out.println("</table>");
		 out.println("total:"+total+"<br>");
		 out.println("average:"+average/marks.length);

}
}
