package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.madel.Project;

public class Queryuserproject {
	public List<Project> queryallproject(String account){
		List<Project> project=new ArrayList<Project>();
		dbconn db=new dbconn();
		db.getConnection();
		Getproject get=new Getproject();
		String sql="select t_id from result where t_account=?";
		ResultSet res=db.select(sql,account);
		try {
			while(res.next()) {
				Project project1=new Project();
				project1=get.get(res.getString("t_id"));
				project.add(project1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return project;
	}
}
