package Person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/data")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// set the response type
		response.setContentType("text/html");

		// yeah! printwriter! woohoo!
		PrintWriter out = response.getWriter();

		// get parameters
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String[] enjoy = request.getParameterValues("enjoy");

		// print response
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Your information</h1>");
		out.println("<p> Name: " + name + "</p>");
		out.println("<p> Gender: " + gender + "</p>");
		out.print("<p> I enjoy: ");

		for (String s : enjoy) {
			out.print(s + ",");
		}

		out.println("</html>");
		out.println("</body>");

		out.close();
	}

}
