package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Checkpassowrd {
	public int checkpassword(String account,String password) {
		ResultSet res;
		dbconn db=new dbconn();
		String pw;
		String sql="select password from user where account=?";
		res=db.select(sql,account);
		try {
			if(!res.next()) {
				return 0;
			}
			else {
				pw=res.getString("password");
				if(pw.equals(password)) {
					return 1;
				}
				else return 2;
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return 0;
	}
}
