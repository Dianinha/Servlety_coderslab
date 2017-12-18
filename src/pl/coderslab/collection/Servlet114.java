package pl.coderslab.collection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet114
 */
@WebServlet("/Servlet114")
public class Servlet114 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet114() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int tmp = r.nextInt(100)+1;
			nums.add(tmp);
		}
		PrintWriter pw = response.getWriter();
		pw.append("<html><head></head><body><table><tr>");
		for (int i = 0; i < 10; i++) {
			pw.append("<td>"+nums.get(i)+"</td>");
		}
		
		pw.append("</tr></table><br>");
		Collections.sort(nums);
		pw.append("<br><table><tr>");
		for (int i = 0; i < 10; i++) {
			pw.append("<td>"+nums.get(i)+"</td>");
		}
		
		pw.append("</tr></table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
