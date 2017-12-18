package pl.coderslab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get3
 */
@WebServlet("/Get3")
public class Get3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Get3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int width = 5;
			int height = 10;
			String paramW=request.getParameter("width");
			String paramH=request.getParameter("height");
			try {
				width=Integer.parseInt(paramW);
				height=Integer.parseInt(paramH);
			} catch (Exception e) {
			}
			for (int i = 1; i <= width; i++) {
				for (int j = 1; j <= height; j++) {
					response.getWriter().append(i*j+"   ");
				}
				response.getWriter().append("\n");
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
