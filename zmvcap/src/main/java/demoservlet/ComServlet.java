package demoservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ComServlet extends HttpServlet {

	protected void doGet(HttpServlet request , HttpServletResponse response) throws ServletException,IOException {
	       response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	        out.println("<h1 style='color:green'> Today's Date on Server:"+new String()+"</h1>"); 
  
   

	
	}
 }	




