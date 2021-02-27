import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("uid");
		String pass = request.getParameter("pwd");
		String type = request.getParameter("login");
	    System.out.println(user+" "+type);
	    
		CustomerDao customerDao = new CustomerDao();
		boolean customer = customerDao.getCustomer(user,pass);
		
		out.print("<html>");		
		if(!customer){
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			session.setAttribute("pass", pass);
			//session.setAttribute("custId", customer.getCustId());
			if(pass.equalsIgnoreCase("PASSWORD")) {
				RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
				rd.include(request, response);	
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("UserHomePage.jsp");
				rd.forward(request, response);
			}
			

		}
		else
		{
			out.print("<body>");
			out.print("<center><h1>Invalid Credentials..</h1></center>");
			RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
			rd.include(request, response);
			out.print("</body>");			
		}
		out.println("</html>");		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
	

}
