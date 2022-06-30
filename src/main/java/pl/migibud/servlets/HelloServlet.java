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
import java.time.LocalDate;
import java.time.LocalDateTime;

@WebServlet(
		name = "HelloServlet",
		urlPatterns = "/hello"
)
public class HelloServlet extends HttpServlet {

	private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		resp.setStatus(HttpServletResponse.SC_OK);
		PrintWriter writer = resp.getWriter();
		writer.println("Hello oto servlet. Czas to: " + LocalDateTime.now());
		writer.println("Twoje id: "+req.getRemoteHost());
		writer.println("Accept: "+req.getHeader("accept"));
	}
}
