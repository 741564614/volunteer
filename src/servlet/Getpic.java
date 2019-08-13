package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Queryallpic;
import dao.madel.User;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class Getpic
 */
@WebServlet("/Getpic")
public class Getpic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getpic() {
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
		JSONObject json = new JSONObject();  
		response.setContentType("application/json;charset=utf-8");
		List<User> pic=new ArrayList<User>();
		PrintWriter out=response.getWriter();
		Queryallpic q=new Queryallpic();
		pic=q.queryallpic();
	    List<String> account=new ArrayList<String>();
	    List<String> major=new ArrayList<String>();
	    List<String> name=new ArrayList<String>();
	    List<String> QQ = new ArrayList<String>();
	    int[] hour=new int[pic.size()];
	    List<String> tel=new ArrayList<String>();
	    List<String> email = new ArrayList<String>();
	    for(int i=0;i<pic.size();i++) {
	    	User p=new User();
	    	p=pic.get(i);
	    	account.add(p.getaccount());
	    	major.add(p.getmajor());
	    	name.add(p.getname());
	    	QQ.add(p.getQQ());
	    	tel.add(p.gettel());
	    	email.add(p.getemail());
	    	hour[i]=p.gethours();
		    
	    }
	    json.accumulate("account",account);
	    json.accumulate("major",major);
	    json.accumulate("name",name);
	    json.accumulate("QQ", QQ);
	    json.accumulate("tel",tel );
	    json.accumulate("email", email);
	    json.accumulate("hour",hour);   
	    out.print(json);
		
		
		
	}
}
