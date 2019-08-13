package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Addproject;
import dao.madel.Project;

/**
 * Servlet implementation class Enter
 */
@WebServlet("/Enter")
public class Enter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enter() {
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
		Project p=new Project();
		int a=0;
		p.setid(request.getParameter("id"));
		p.setprojectname(request.getParameter("projectname"));
		String starttime=request.getParameter("starttime");
		String endtime=request.getParameter("endtime");
		p.setcontent(request.getParameter("content"));
		try {
		     a = Integer.parseInt(request.getParameter("hour"));
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		Date Starttime = null;
		Date Endtime=null;
		p.setpic(request.getParameter("picid"));
		p.sethour(a);
		p.setstate("S");
		p.setsite(request.getParameter("site"));
		p.setterm(request.getParameter("term"));
		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
		try {
			Starttime=(Date) formatter.parse(starttime);
			Endtime=(Date) formatter.parse(endtime);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		p.setstarttime(Starttime);
		p.setendtime(Endtime);
		Addproject add=new Addproject();
		add.addproject(p);
		out.print("录入成功");
	}
}
