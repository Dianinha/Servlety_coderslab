package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess03_Add
 */
@WebServlet("/addToSession")
public class Sess03_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sess03_Add() {
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
		pw.append("<html><head></head><body>");
		pw.append("<form action=\"addToSession\" method=\"POST\">");
		pw.append(
				"<label>Klucz:<input type=\"text\" name=\"key\"> </label><label>Wartosc:<input type=\"text\" name=\"value\"></label><input type=\"submit\"> </form>");
		pw.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		HttpSession sess = request.getSession();
		sess.setAttribute(request.getParameter("key"), request.getParameter("value"));
	}

}


