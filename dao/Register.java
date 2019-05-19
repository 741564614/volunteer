package dao;

public class Register {
	public void register(String id,String account) {
		String sql="insert into reigster values(?,?)";
		dbconn db=new dbconn();
		db.insert(sql,account,id);
	}
	public void cancel(String account) {
		String sql="delete from reigster where r_account=?";
		dbconn db=new dbconn();
		db.delete(sql,account);
	}
}
