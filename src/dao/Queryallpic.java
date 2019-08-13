package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.madel.User;
//获取所有负责人[姓名]
public class Queryallpic {
	public List<User> queryallpic(){
		List<User> user=new ArrayList<User>();
		dbconn db=new dbconn();
		db.getConnection();
		String sql="select *from user where identity = 'p'";
		ResultSet res=db.select(sql);
		try {
			while(res.next()) {
				User user1=new User();
				user1.setname(res.getString("name"));
				user1.setaccount(res.getString("account"));
				user1.setpassword(res.getString("password"));
				user1.settel(res.getString("tel"));
				user1.setQQ(res.getString("QQ"));
				user1.setemail(res.getString("email"));
				user1.setmajor(res.getString("major"));
				user1.setidentity(res.getString("identity"));
				user1.sethours(res.getInt("hours"));

				user.add(user1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
