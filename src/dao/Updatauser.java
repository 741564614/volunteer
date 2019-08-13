package dao;



public class Updatauser {
	dbconn db=new dbconn();
	public void updatauser(String account,String QQ,String tel,String email) {
		String sql="update user set QQ=?,tel=?,email=? where account=?";
		db.update(sql,QQ,tel,email,account);
	}
	public void updatapassword(String account,String password) {
		String sql="update user set password=? where account=?";
		db.update(sql, password,account);
	}
	public void result(String account,int hours) {
		String sql="update user set hours=? where account=?";
		db.update(sql, hours,account);
	}
}
