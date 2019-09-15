

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Hello_annotation")
public class Hello_annotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Hello_annotation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter Writer = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		Writer.println("<html>");
		Writer.println("<head><title>Annotation Mapping</title></head>");
		Writer.println("<body>");
		Writer.println("<h1>Annotation Mapping<h1>");
		Writer.println("</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
