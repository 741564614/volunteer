package dao;

public class Projectover {
	public void over(String id) {
		String sql="update project set state=? where id=?";
		dbconn db=new dbconn();
		String state="E";
		db.update(sql,state,id);
		
	}
}
