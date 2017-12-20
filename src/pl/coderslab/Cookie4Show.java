package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie4Show
 */
@WebServlet("/Cookie4Show")
public class Cookie4Show extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Cookie4Show() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Cookie[] cookies = request.getCookies();
		String cookieValue = null;
		pw.append("<html><head></head><body>");
		for (Cookie c : cookies) {
			cookieValue = c.getValue();
			pw.append("Cookie: " + c.getName()).append(" " + cookieValue);
			pw.append("<a href=\"/SERVLETJEE/Cookie4Del?cookiename=" + c.getName() +"\" > Usun ciasteczko </a><br>");
		}
		pw.append("</body></html>");
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
