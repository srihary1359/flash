package sessionmanagehari;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession();
		
	int d=(int)session.getAttribute("k");
	
	d=d*d;
	PrintWriter out=resp.getWriter();
	System.out.println("sysocalled");
	out.println("square"+d);
	}
}
