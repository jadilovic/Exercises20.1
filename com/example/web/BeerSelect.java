package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.*;

public class BeerSelect extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();

		BeerExpert expert = new BeerExpert();
		
		// out.println("Beer Selection Advice<br>");
		String c = request.getParameter("color");
		// out.println("<br>Got Beer Color " + c);
		
		List<String> beers = expert.getBrands(c);
		request.setAttribute("styles", beers);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		
		// out.println("<br>You should get following beers: ");
		// for(String beer: beers)
		// out.print(beer + ", ");
		
		// beers = expert.getNew();
		// out.println("<br>Also try new beers like: ");
		// Iterator<String> it = beers.iterator();
		
		// while(it.hasNext()){
		//	out.print(it.next() + ", ");
		// }
		
	}

}
