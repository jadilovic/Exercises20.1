package bildit.dice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ch2Dice
 */
@WebServlet(name = "C2Dice", urlPatterns = { "/Dice" })
public class Ch2Dice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ch2Dice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String d1 = Integer.toString((int)((Math.random()*6)+1));
		String d2 = Integer.toString((int)((Math.random()*6)+1));
		PrintWriter out = response.getWriter();
		
		out.println("<html> <body>"
		+ "<h1 align=center>HF’s Chap 2 Dice Roller</h1>" 
		+"<p>" + d1 + " and " + d2 + " were rolled" 
		+ "</body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
