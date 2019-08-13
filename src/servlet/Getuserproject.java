package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.QueryUserProject;
import dao.madel.Project;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class Getuserproject
 */
@WebServlet("/Getuserproject")
public class Getuserproject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getuserproject() {
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
	public void access(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("application/json;charset=utf-8");
		List<Project> project=new ArrayList<Project>();
		QueryUserProject q=new QueryUserProject();
		HttpSession session = request.getSession();
		String account=(String) session.getAttribute("account");
		project=q.queryuserProjects(account);
	    session.setAttribute("project", project);
		response.sendRedirect("second/happening.jsp");
	}
}
