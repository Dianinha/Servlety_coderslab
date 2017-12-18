package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get62
 */
@WebServlet("/Get62")
public class Get62 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Get62() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String year = request.getParameter("year");
		PrintWriter pw = response.getWriter();
		pw.append("<html><head></head><body>");
		Random r = new Random();
		int tmp;
		for (int i = 0; i <= 4; i++) {
			tmp = r.nextInt(21)-10;
			pw.append("<a href='/SERVLETJEE/Get63?year=" + year +"&mix="+tmp+"'> Rok " + year +" , mix "+tmp+" </a><br>");
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
