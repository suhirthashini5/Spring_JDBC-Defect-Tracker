package com.sgic.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class ProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String projectName=request.getParameter("projectName");
		String projectDescription=request.getParameter("projectDescription");

		if(projectName.length()==0 || projectDescription.length()==0) {
			response.sendRedirect("project.jsp?msg=notvalid"); 
		

		}else {
			
			try {
			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
			JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
			int result = jdbcTemplate.update("INSERT INTO spring(`name`, `description`) VALUES ('"+projectName+"', '"+projectDescription+"');");  
			System.out.println(result+" records affected");  
			response.sendRedirect("project.jsp?msg=success");  
		}catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("project.jsp?msg=error");  
		}  
		}

	}
	
}

