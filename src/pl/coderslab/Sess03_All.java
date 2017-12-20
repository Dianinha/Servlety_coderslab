package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess03_All
 */
@WebServlet("/showAllSession")
public class Sess03_All extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sess03_All() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.append("<html><head></head><body><table>");
		HttpSession sess = request.getSession();
		Enumeration<String> sesskeys = sess.getAttributeNames();
		
		while (sesskeys.hasMoreElements()) {
			String s= sesskeys.nextElement();
			String val = (String) sess.getAttribute(s);
			pw.append("<tr>");
			pw.append("<td>"+s+"</td>");
			pw.append("<td>"+val+"</td>");
			pw.append("</tr>");
			pw.append("<br>");
		}
		
		pw.append("</table></body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
//Dodaj do servletu Sess03_All funkcjonalność, która wyświetli w formie tabeli
//wszystkie dane znajdujące się w sesji (zarówno klucz jak i wartość). Do
//przechowywania kluczy wszystkich wartości w sesji użyj dodatkowej zmiennej
//sesyjnej, która będzie przechowywać w tablicy lub liście wszystkie klucze.
//
