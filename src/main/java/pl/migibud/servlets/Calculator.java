package pl.migibud.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
		name = "Calculator",
		urlPatterns = "/calc"
)
public class Calculator extends HttpServlet {

	private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		String arga = req.getParameter("a");
		String argb = req.getParameter("b");
		try{
			int a = Integer.parseInt(arga);
			int b = Integer.parseInt(argb);
			writer.println("wynik="+(a+b));
		}catch (NumberFormatException e){
			writer.println("błędne dane");
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
	}
}
