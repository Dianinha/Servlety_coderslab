package pl.coderslab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get1
 */
@WebServlet("/Get1")
public class Get1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		int f=0;
		int s = 0;
		try {
			f=Integer.parseInt(first);
			s=Integer.parseInt(second);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(f!=0&&s!=0){
			for (int i = f; i <= s; i++) {
				response.getWriter().append(""+i);
			}
		}
		else{
			response.getWriter().append("Brak przesłanych zmiennych");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
