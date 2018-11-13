package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.taglibs.standard.tag.rt.core.OutTag;

public class EmpServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		PrintWriter out =arg1.getWriter();
		out.println("<h1>");
		out.println("this is generic servlet implementation");
		out.println("</h1>");
	}

}
