
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Hello_xml extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
    public Hello_xml() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter Writer = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		Writer.println("<html>");
		Writer.println("<head><title>XML Mapping</title></head>");
		Writer.println("<body>");
		Writer.println("<h1>XML Mapping<h1>");
		Writer.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
