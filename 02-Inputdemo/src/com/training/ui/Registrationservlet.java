package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainig.entity.Customer;



/**
* Servlet implementation class Registrationservlet
*/
@WebServlet("/Regser")
public class Registrationservlet extends HttpServlet {
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
                PrintWriter out=response.getWriter();
                Customer customer = new Customer();
                
                String strId=request.getParameter("textId");
                
                String name=request.getParameter("txtName");
                String strGender=request.getParameter("gender");
                String strIsplg=request.getParameter("chkplg");
                String phno=request.getParameter("phone");
                String mailId=request.getParameter("mail");
                String address=request.getParameter("address");
                String strDoj=request.getParameter("doj");
                String balance=request.getParameter("balamt");
                String strRating=request.getParameter("txtRating");
                String desc=request.getParameter("textdes");
                if(desc!=null)
                {
                                customer.setDescription(desc);
                }
                if(strRating!=null)
                {
                                int rating=Integer.parseInt(strRating);
                                                                customer.setCustomerRating(rating);
                                                                }
                
                if(balance!=null)
                {
                                double balanceAmount=Double.parseDouble(balance);
                                customer.setBalanceAmount(balanceAmount);
                }
                if(strDoj!=null){
                                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
                                Date doj;
                                try {
                                                doj = sdf.parse(strDoj);
                                                customer.setDateOfJoining(doj);
                                } catch (ParseException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                }
                                
                }
                if(phno!=null){
                                customer.setPhone(phno);
                }
                if(mailId!=null)
                {
                                customer.setEmail(mailId);
                }
                if(address!=null)
                {
                                customer.setAddress(address);
                }
                if(strIsplg==null)
                {
                                customer.setPrivileaged(false);
                }
                else
                                {
                                if(strIsplg.equals("yes")){
                                customer.setPrivileaged(true);
                                }
                                
                }
                if(strGender!=null){
                                int gender=Integer.parseInt(strGender);
                                customer.setGender(gender);
                }
                if(strId!=null){
                                int id=Integer.parseInt(strId);
                                customer.setId(id);
                }
                if(name!=null)
                {
                                customer.setName(name);
                }
                //out.println(customer);
                out.println(customer.getId()+"<br>");
                out.println(customer.getName()+"<br>");
                out.println(customer.getEmail()+"<br>");
                out.println(customer.getPhone()+"<br>");
                out.println(customer.getAddress()+"<br>");
                out.println(customer.getBalanceAmount()+"<br>");
                out.println(customer.getDateOfJoining()+"<br>");
                out.println(customer.getCustomerRating()+"<br>");
                out.println(customer.getDescription()+"<br>");
                out.println(customer.isPrivileaged()+"<br>");
                out.println(customer.getGender()+"<br>");
//            out.println(customer.getId()+"<br>");
                
                }

}
