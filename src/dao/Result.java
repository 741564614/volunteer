package dao;

public class Result {
	public void result(String id,String account,String describe,int hour) {
		String sql="insert into result values(?,?,?,?)";
		dbconn db=new dbconn();
		db.insert(sql,account,id,hour,describe);
	}
	public void updata(String id,String account,String describe,int hour) {
		String sql="updata result set gain=?,describe=? where r_account=? and r_id=?";
		dbconn db=new dbconn();
		db.update(sql,hour,describe,account,id);
	}
}
