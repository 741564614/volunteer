package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.madel.User;

public class Getuser {
	public User getuser(String account) {
		User user=new User();
		String sql="select account,password,name,tel,QQ,email,major,identity,hours from user where account=?";
		ResultSet res;
		dbconn db=new dbconn();
		res=db.select(sql,account);
		try {
			user.setaccount(res.getString("account"));
			user.setpassword(res.getString("password"));
			user.setname(res.getString("name"));
			user.settel(res.getString("tel"));
			user.setQQ(res.getString("QQ"));
			user.setemail(res.getString("email"));
			user.setmajor(res.getString("major"));
			user.setidentity(res.getString("identity"));
			user.sethours(res.getInt("hours"));
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return user;
	}
}
