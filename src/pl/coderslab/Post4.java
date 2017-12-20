package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post4
 */
@WebServlet("/Post4")
public class Post4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Post4() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Random r = new Random();
		int paramsNum = r.nextInt(5) + 5;
		PrintWriter pw = response.getWriter();
		pw.append("<html><head></head><body><form action=\"Post4\" method=\"post\">");
		for (int i = 0; i < paramsNum; i++) {
			pw.append("<br>Podaj liczbe:<br> <input type=\"text\" name=\"number\"><br>");
		}
		pw.append(" <input type=\"submit\" value=\"Wyslij\" style=\"width: 91px; height: 42px; \"> </form></body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String[] params = request.getParameterValues("number");
		List<Integer> paramansInt = new ArrayList<>();
		
			for (int i = 0; i < params.length; i++) {
				try {
					int tmp = Integer.parseInt(params[i]);
					paramansInt.add(tmp);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			Collections.sort(paramansInt);
			for (Integer integer : paramansInt) {
				response.getWriter().append(integer + " ");
			}
			
		
	}

}
