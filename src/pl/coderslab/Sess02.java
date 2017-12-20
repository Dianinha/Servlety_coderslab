package pl.coderslab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess02
 */
@WebServlet("/Sess02")
public class Sess02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sess02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		HttpSession session = request.getSession();
		int grade = Integer.parseInt(request.getParameter("grade"));
		List<Integer> list = null;
		if(session.getAttribute("grades")==null){
			list = new ArrayList<>();
			list.add(grade);
			session.setAttribute("grades", list);
		}
		else {
			list = (ArrayList<Integer>) session.getAttribute("grades");
			list.add(grade);
			session.setAttribute("grades", list);
		}
		
		int sum = (int) list.stream().mapToInt(i -> i.intValue()).sum();
		double avr = (double)sum/(double)list.size();
		response.getWriter().append("Srednia:" + avr);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}

}

