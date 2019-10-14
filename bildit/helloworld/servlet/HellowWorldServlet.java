package bildit.helloworld.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HellowWorldServlet
 */
@WebServlet("/HelloServlet")
public class HellowWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HellowWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// napraviti novi PrintWriter objekt za ispis odgovora
		PrintWriter out = response.getWriter();

		Date datum = new Date();
		
		// odgovor za ispisati u browseru
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello World</h1>");
		out.println("<p>Simple servlet</p>");
		out.println("<p>Todays date is</p>" + datum + "<p>Bosnian Time</p>");
		out.println("</body>");
		out.println("</html>");

		// zatvoriti PrintWriter
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
