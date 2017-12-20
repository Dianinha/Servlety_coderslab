package pl.coderslab;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess01Get
 */
@WebServlet("/Sess01Get")
public class Sess01Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sess01Get() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		if (sess.getAttribute("counter") == null) {
			response.getWriter().append("Nie ma takiej sesji");
		} else {
			System.out.println(sess.getAttribute("counter"));
			int counter = ((int)(sess.getAttribute("counter"))) + 1;
			
			response.getWriter().append("Wartosc atrybutu counter:" + sess.getAttribute("counter"));
			sess.setAttribute("counter", counter);
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
