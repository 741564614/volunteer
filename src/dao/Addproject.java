package dao;

import dao.madel.Project;
//添加新项目
public class Addproject {
	public void addproject(Project project) {
		dbconn db=new dbconn();
		db.getConnection();
		String sql="insert into project values(?,?,?,?,?,?,?,?,?,?)";
			db.insert(sql, project.getid(),project.getprojectname(),project.getstarttime(),project.getendtime(),project.getsite(),project.getcontent(),project.gethour(),project.getpic(),project.getterm(),project.getstate());		
	}
}
