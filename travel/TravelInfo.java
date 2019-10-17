package travel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TravelInfo
 */
@WebServlet("/entry")
public class TravelInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TravelInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set response content type
		response.setContentType("text/html");
		
		// Activate print writer
		PrintWriter out = response.getWriter();
		
		// get paramaters
		String name = request.getParameter("name");
		String lastName = request.getParameter("last");
		String[] country = request.getParameterValues("country");
		String transport = request.getParameter("transport");
		String about = request.getParameter("about");
		
		//print response
		out.println("<html><body>");
		out.println("<p>This is your travel plan Mr. or Ms.: " + lastName + "</p>");
		out.print("<p>You will get to following contry/countries: ");
		for(String s: country)
		out.print(s + ", ");
		out.print("</p>");
		out.println("<p>You will get there by: " + transport + "</p>");
		out.println("<p>Info about you is: " + about + "</p>");
		out.println("</body></html>");
		out.close();
	}

}
