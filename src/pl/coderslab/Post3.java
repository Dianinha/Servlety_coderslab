package pl.coderslab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post3
 */
@WebServlet("/Post3")
public class Post3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Post3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String sa = "";
		String sb = "";
		String sc="";
		sa = request.getParameter("a");
		sb = request.getParameter("b");
		sc = request.getParameter("c");
		double a=0, b=0, c=0;
		try {
			a = Double.parseDouble(sa);
			b = Double.parseDouble(sb);
			c = Double.parseDouble(sc);
			double delta = b*b-(4*a*c);
			double x1, x2;
			double x0;
			if (delta<0) {
				response.getWriter().append("Nie ma miejsc zerowych");
			}
			else if (delta==0){
				x0 = -b/(2*a);
				response.getWriter().append("Jedno miejsce zerowe: " + x0);
			}
			else {
				x1 = (-b+Math.sqrt(delta))/(2*a);
				x2 = (-b-Math.sqrt(delta))/(2*a);
				response.getWriter().append("Dwa miejsca zerowe: " + x1 + " i " + x2);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
