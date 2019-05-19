package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.madel.Project;
//获取所有项目
public class Queryallproject {
	public List<Project> queryallproject(){
		List<Project> project=new ArrayList<Project>();
		dbconn db=new dbconn();
		db.getConnection();
		String sql="select *from project";
		ResultSet res=db.select(sql);
		try {
			while(res.next()) {
				Project project1=new Project();
				project1.setid(res.getString("id"));
				project1.setprojectname(res.getString("projectname"));
				project1.setstarttime(res.getDate("starttime"));
				project1.setendtime(res.getDate("endtime"));
				project1.setsite(res.getString("site"));
				project1.setcontent(res.getString("content"));
				project1.sethour(res.getInt("hour"));
				project1.setpic(res.getString("pic"));
				project1.setterm(res.getString("term"));
				project1.setstate(res.getString("state"));
				project.add(project1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return project;
	}
}
