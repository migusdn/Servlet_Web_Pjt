//joinservice
package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDao;
import dto.UserDto;

@WebServlet("/joinservice")
public class joinservice extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//userdao 객체 선언
	private UserDao dao = new UserDao();
	//userdto 객체 선언
	private UserDto dto = new UserDto();
    public joinservice() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter Writer = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//Parameter로 넘어온 값들을 dto에 넣어준다.
		dto.setUser_id(request.getParameter("user_id").trim());
		dto.setPassword(request.getParameter("password").trim());
		dto.setNickname(request.getParameter("nickname").trim());
		dto.setName(request.getParameter("name").trim());
		int result = dao.register(dto);
		if(result == -1) {
			System.out.println("error");
			Writer.println("<script>");
			Writer.println("alert('fail')");
			Writer.println("</script>");
		}
		else {
			System.out.println("success");
			Writer.println("<script>");
			Writer.println("alert('success');");
			Writer.println("</script>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
