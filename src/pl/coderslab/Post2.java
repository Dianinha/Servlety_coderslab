package pl.coderslab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post2
 */
@WebServlet("/Post2")
public class Post2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Post2() {
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
		String[] badWords = { "kurwa", "dupa", "cholera", "kretyn", "chuj", "debil", "skurwysyn", "huj", "pieprzenie",
				"pierdolenie", "pierdolę", "jebać" };

		String agreement = "";

		boolean flag = false;
		try {
			agreement = request.getParameter("agreement");
			if (agreement != null) {
				flag = true;
			}
		} catch (Exception e) {
		}

		if (flag) {
			response.getWriter().append(request.getParameter("txt"));
		} else {
			String tmpTxt = request.getParameter("txt");

			for (int i = 0; i < badWords.length; i++) {
				if (tmpTxt.contains(badWords[i])) {
					String tmpStars = "";
					int wordLengh = badWords[i].length();
					for (int j = 0; j < wordLengh; j++) {
						tmpStars += "*";
					}
					tmpTxt = tmpTxt.replaceAll(badWords[i], tmpStars);

				}

			}
			response.getWriter().append(tmpTxt);

		}
	}

}
