package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post5
 */
@WebServlet("/Post5")
public class Post5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Post5() {
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
		PrintWriter pw = response.getWriter();
		double temp = Double.parseDouble(request.getParameter("degrees"));
		String what = request.getParameter("convertionType");
		if(what.equals("Przelicz na stopnie Fahrenheita")){
			String st = "na stopnie Fahrenheita";
			double tempF = 32.0 + (9.0/5.0*temp);
			long roundedInt = Math.round(tempF * 100);
			double result = (double) roundedInt/100;
			pw.append("Przeliczona temperatura " + temp + "stopni Celsjusza " + st+ " to: "+result);
		}
		else {
			String st = "na stopnie Celsjusza";
			double tempC = (5.0/9.0)* (temp-32.0);
			long roundedInt = Math.round(tempC * 100);
			double result = (double) roundedInt/100;
			System.out.println(tempC);
			pw.append("Przeliczona temperatura " + temp + " stopni Fahrenheita " + st+ " to: "+result);
		}
	}

}
