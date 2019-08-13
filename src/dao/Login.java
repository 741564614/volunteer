package dao;

public class Login {
	public void login(String id,String account) {
		String sql="insert into login values(?,?)";
		dbconn db=new dbconn();
		db.insert(sql,account,id);
	}
	public void cancel(String account) {
		String sql="delete from login where l_account=?";
		dbconn db=new dbconn();
		db.delete(sql,account);
	}
	public void sign(String account,String id,int sign) {
		String sql="update login set sign=?, where l_account=? and l_id=?";
		dbconn db=new dbconn();
		db.update(sql,sign,account,id);
	}
}
