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
 * Servlet implementation class Cookie51
 */
@WebServlet("/Cookie51")
public class Cookie51 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Cookie51() {
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
		Cookie myCookie = new Cookie("User", "mycookie");
		response.addCookie(myCookie);
		pw.append("<html><head></head><body><a href=\"/SERVLETJEE/Cookie52\">Tutaj</a></body></html>");
		
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
// W projekcie stwórz dwa servlety Cookie51 i Cookie52. Następnie:
//
// Wymagamy aby użytkownik najpierw odwiedził stronę wygenerowaną przez servlet
// Cookie51, a dopiero potem mógł przejść do strony wygenerowanej przez
// Cookie5_2.
// Gdy użytkownik wejdzie na pierwszą stronę, zapisz odpowiednią informację w
// ciasteczku oraz wygeneruj link do drugiego servletu.
// Przy wejściu na stronę wygenerowaną przez servlet Cookie52 sprawdź czy dane
// ciasteczko istnieje:
// Jeżeli istnieje to je usuń oraz wypisz komunikat Witamy na stronie Cookie52
// jeżeli ciasteczka nie ma to przekieruj na adres servletu Cookie51 z adnotacją
// Nie odwiedziłeś jeszcze tej strony.
//
// Hint: Przetestuj servlety w różnych przeglądarkach, manualnie usuwając
// ciasteczka (możesz to zrobić w konsoli deweloperskiej).