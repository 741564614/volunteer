package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.madel.Project;

public class Getproject {
	public Project get(String id) {
		Project project=new Project();
		dbconn db=new dbconn();
		ResultSet res;
		String sql ="select pic,starttime,endtime,projectname,site,content,hour,term,state from project where id=?";
		try {
			res=db.select(sql,id);
			project.setid(id);
			project.setpic(res.getString("pic"));
			project.setprojectname(res.getString("projectname"));
			project.setsite(res.getString("site"));
			project.setcontent(res.getString("content"));
			project.setstarttime(res.getDate("starttime"));
			project.setendtime(res.getDate("endtime"));
			project.sethour(res.getInt("hour"));
			project.setterm(res.getString("term"));
			project.setstate(res.getString("state"));
			
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return project;
	}
}
