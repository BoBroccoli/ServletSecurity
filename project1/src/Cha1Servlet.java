import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Cha1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.isUserInRole("Admin")) {
		PrintWriter pWriter = resp.getWriter();
		pWriter.println("<html> <body> <h1 align=center>HF\'s Chapter1 Servlet</h1> <br>" + new java.util.Date()
				+ "</body> </html>" + "<a href='" + resp.encodeURL("/project1/abc.do") + "'>click me</a>" + req.getSession().getId());
		/*HttpSession session = req.getSession();
		if (session.isNew()) {
			pWriter.println("This is a new session");
		} else {
			pWriter.println("Welcom back!");
		}*/
	}
	}
			
}
