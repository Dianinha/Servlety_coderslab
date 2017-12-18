package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get4
 */
@WebServlet("/Get4")
public class Get4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Get4() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		String parameter = request.getParameter("param");
		if (parameter!=null&&!parameter.equals("")){
			pw.append("Dane zostaly przeslane.");
			int number = 0;
			try {
				number = Integer.parseInt(parameter);
				pw.append("\n"+ "Dzielniki "+number+" to: ");
				
				for (int i = 1; i <= number; i++) {
					if (number%i==0) {
						pw.append(" " + i + " ");
					}
					else{
					}
				}
			} catch (Exception e) {
				pw.append("Przeslana wartosc to nie liczba");
			}
			
		}
		else{
			pw.append("Dane nie zostały przeslane");
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
