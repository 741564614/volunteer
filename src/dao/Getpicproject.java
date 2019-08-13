package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.madel.Project;

public class Getpicproject {
	public Project getproject(String pic) {
		Project project=new Project();
		dbconn db=new dbconn();
		ResultSet res;
		String sql="select id,starttime,endtime,projectname,site,content,hour,term,state from project where pic=?";
		try {
			res=db.select(sql, pic);
			project.setid(res.getString("id"));
			project.setprojectname(res.getString("projectname"));
			project.setsite(res.getString("site"));
			project.setcontent(res.getString("content"));
			project.setstarttime(res.getDate("starttime"));
			project.setendtime(res.getDate("endtime"));
			project.sethour(res.getInt("hour"));
			project.setpic(pic);
			project.setterm(res.getString("term"));
			project.setstate(res.getString("state"));
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return project;
	}
}
