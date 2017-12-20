package pl.coderslab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie2
 */
@WebServlet("/addToCookie")
public class Cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Cookie	newCookie	=	new	Cookie(request.getParameter("key").replaceAll(" ", ""),	request.getParameter("value"));
		newCookie.setMaxAge(86400);
		response.addCookie(newCookie);
		response.getWriter().append("Dodano ciasteczko ");
		
		Cookie[] cookies = request.getCookies();
		String cookieValue = null;
		String cookieName = "";
		for (Cookie c : cookies) {
				cookieValue = c.getValue();
				cookieName = c. getName();
		}
		response.getWriter().append(cookieName+": ").append(" "+cookieValue);
	}

}
