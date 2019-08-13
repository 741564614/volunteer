package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.madel.Project;

/**
 * Servlet implementation class Selectproject
 */
@WebServlet("/Selectproject")
public class Selectproject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Selectproject() {
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
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		session.setAttribute("id", request.getParameter("id"));
		dao.Getproject g=new dao.Getproject();
		Project p=new Project();
		p=g.get(request.getParameter("id"));
		session.setAttribute("projectname", p.getprojectname());
		session.setAttribute("starttime", p.getstarttime());
		session.setAttribute("endtime", p.getendtime());
		session.setAttribute("site", p.getsite());
		session.setAttribute("term", p.getterm());
		session.setAttribute("content", p.getcontent());
		session.setAttribute("hour", p.gethour());
		session.setAttribute("state", p.getstate());
		
	}
}
