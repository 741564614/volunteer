package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.Checkpassowrd;
import dao.Getuser;
import dao.madel.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		access(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void access(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		HttpSession session = request.getSession();
		Checkpassowrd c=new Checkpassowrd();
		int i=c.checkpassword(account, password);
		Getuser g=new Getuser();
		User u=new User();
		if(i==1) {
			u=g.getuser(account);
			session.setAttribute("account",account); //用Session保存用户名
			session.setAttribute("password",password); //保存密码
			session.setAttribute("major", u.getmajor());
			session.setAttribute("name", u.getname());
			session.setAttribute("QQ", u.getQQ());
			session.setAttribute("tel", u.gettel());
			session.setAttribute("email", u.getemail());
			session.setAttribute("hours", u.gethours());
			response.sendRedirect("user.jsp");
			
		}
		else out.print("账户或密码错误");
	}
}
