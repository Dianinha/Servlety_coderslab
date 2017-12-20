package pl.coderslab;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie6
 */
@WebServlet("/Cookie6")
public class Cookie6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Cookie6() {
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
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");

		PrintWriter pw = response.getWriter();
		Map<String, String> colors = new HashMap<>();
		colors.put("czerwony", "RED");
		colors.put("zielony", "GREEN");
		colors.put("niebieski", "BLUE");
		colors.put("rozowy", "PINK");
		colors.put("zolty", "YELLOW");

		String bg = "";
		String txt = "";

		Cookie myCookieText = new Cookie("text", request.getParameter("txt"));
		Cookie myCookieColor = new Cookie("background", request.getParameter("bg"));
		
		response.addCookie(myCookieColor);
		response.addCookie(myCookieText);

		Cookie[] cookies = request.getCookies();

		String rememberedBg = "";
		String rememberedTxt = "";
		
		
		if (cookies != null) {
			pw.append("<html><head><meta charset=\"utf-8\"></head><body>");
			for (Cookie cookie : cookies) {
				String cName = cookie.getName();
				if (cName.equals("text")) {
					rememberedTxt = cookie.getValue();
				} else if (cName.equals("background")) {
					rememberedBg = cookie.getValue();
				}
			}

			for (String string : colors.keySet()) {
				if (rememberedBg.equals(string)) {
					bg = colors.get(string);
				}
				if (rememberedTxt.equals(string)) {
					txt = colors.get(string);
				}
			}
			pw.append("<p>Wybrałeś kolor tekstu jako: " + rememberedTxt + ", oraz tła jako: " + rememberedBg
					+ ". Twój wybór został zapisany w ciasteczku.</p>");
			pw.append("<p style=\"background-color:" + bg + "; color:" + txt
					+ "\">Wybrałes kolor tekstu jako: "+rememberedTxt+" oraz kolor tla jako: "+rememberedBg+"</p>");
			pw.append("</body></html>");

		}
		else {
			response.sendRedirect("index_6.html");
		}
		
	}

}
