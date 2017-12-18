package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get5
 */
@WebServlet("/Get5")
public class Get5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Get5() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String comp = request.getParameter("company");
		String[] lang = request.getParameterValues("learn");
		PrintWriter pw = response.getWriter();
		pw.append("company: \n").append("- "+comp).append("\n"+"learn:");
		for (int i = 0; i < lang.length; i++) {
			pw.append("\n"+"- " +lang[i]);
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
// stronę HTML `index.html`, w której umieścisz link do servletu z dodatkowymi
// parametrami
// ``` ?company=coderslab&learn=php&learn=java&learn=ruby&learn=python ```
// po przejściu do servletu wyświetl informacje w następujący sposób:
// ````
// company:
// - coderslab
// learn:
// - php
// - java
// - ruby
// - python
// ````
