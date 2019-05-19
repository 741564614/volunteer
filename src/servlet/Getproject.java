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

import dao.madel.Project;
import net.sf.json.JSONObject;
import dao.Queryallproject;



@WebServlet("/Getproject")
public class Getproject extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Getproject() {
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
		JSONObject json = new JSONObject();  
		response.setContentType("application/json;charset=utf-8");
		List<Project> project=new ArrayList<Project>();
		PrintWriter out=response.getWriter();
		Queryallproject q=new Queryallproject();
		project=q.queryallproject();
	    List<String> id=new ArrayList<String>();
	    List<String> projectname=new ArrayList<String>();
	    List<Date> starttime = new ArrayList<Date>();
	    List<Date> endtime=new ArrayList<Date>();
	    List<String> site=new ArrayList<String>();
	    List<String> content = new ArrayList<String>();
	    int[] hour=new int[project.size()];
	    List<String> pic=new ArrayList<String>();
	    List<String> term = new ArrayList<String>();
	    List<String> state = new ArrayList<String>();
	    for(int i=0;i<project.size();i++) {
	    	Project p=new Project();
	    	p=project.get(i);
	    	id.add(p.getid());
	    	projectname.add(p.getprojectname());
	    	starttime.add((Date) p.getstarttime());
	    	endtime.add((Date) p.getendtime());
		    site.add(p.getsite());
	        content.add(p.getcontent());
		    hour[i]=p.gethour();
		    pic.add(p.getpic());
		    term.add(p.getterm());
		    state.add(p.getstate());
	    }
	    json.accumulate("id",id);
	    json.accumulate("projectname",projectname);
	    json.accumulate("starttime",starttime);
	    json.accumulate("endtime", endtime);
	    json.accumulate("site",site );
	    json.accumulate("content", content);
	    json.accumulate("hour",hour );
	    json.accumulate("pic",pic );
	    json.accumulate("term", term);
	    json.accumulate("state",state );    
	    out.print(json);
	}
}
