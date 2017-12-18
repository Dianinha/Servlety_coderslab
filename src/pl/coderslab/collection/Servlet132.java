package pl.coderslab.collection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet132
 */
@WebServlet("/Servlet032")
public class Servlet132 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet132() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String products[] = {
			    "Asus Transformr;2999.99",
			    "iPhone 6';3499.18",
			    "Converse Sneakers;125.00",
			    "LG OLED55B6P OLED TV;6493.91",
			    "Samsung HT-J4100;800.99",
			    "Alpine Swiss Dress Belt;99.08",
			    "60 Watt LED;1.50",
			    "Arduino Nano;3.26",
			};
		String id = request.getParameter("id");
		int idInt = Integer.parseInt(id);
		PrintWriter pw = response.getWriter();
		pw.append("<html><head></head><body>");
		if(idInt<products.length){
		for (int i = 0; i < products.length; i++) {
			if(i==idInt){
				pw.append(products[i].toString());
			}
		}
		}
		else{
			pw.append("Product not found.");
		}
		
		pw.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
