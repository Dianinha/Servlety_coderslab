package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie7
 */
@WebServlet("/rememberMe")
public class Cookie7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Cookie7() {
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
		Cookie [] cookies = request.getCookies();
		if(cookies==null){
		pw.append("<html><head></head><body>");
		pw.append("<form action=\"rememberMe\" method=\"post\">Name:<br><input type=\"text\" name=\"name\";>");
		pw.append(
				"<br> <input type=\"checkbox\" name=\"rem\" value=\"ok\"> Remember me! <br><input type=\"submit\" value=\"Send\";></form>");
		pw.append("</body></html>");
	}
		else {
			String name = "";
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("Remembered"))
				name = cookie.getValue();
			}
			pw.append("Hello ").append(name).append(". You are remembered in cookie. Omniomniom.");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String name = request.getParameter("name");
		String ok = request.getParameter("rem");

		if (ok != null) {
			Cookie c1 = new Cookie("Remembered", name);
			response.addCookie(c1);
		}
		

	}

}

// Dopisz obsługę metody POST w servlecie. Sevlet powinien wyświetlić komunikat
// Cześć {imię przesłane w formularzu}. W przypadku zaznaczenia checkboxa, imię
// użytkownika zapamiętaj w ciasteczku.
// Dodaj funkcjonalność, która w przypadku wejścia na stronę metodą GET sprawdzi
// czy istnieje odpowiednie ciasteczko. Jeżeli tak to nie wyświetlaj formularza
// do logowania tylko wyświetl komunikat Cześć {imię przesłane w formularzu}.
// Twoje dane zostały wczytane z ciasteczka
//
