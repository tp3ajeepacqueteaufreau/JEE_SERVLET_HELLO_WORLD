

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(ServletRequest request, ServletResponse response) throws IOException{
		String clientName = request.getParameter("name");
		response.setContentType("text/html"); // Type MIME
		java.io.PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("Hello World " + clientName + " !");
		out.println("</body></html>");
	}
		

}
