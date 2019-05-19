package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.madel.User;

public class QueryVolunteer {
	public List<User> queryvolunteer(String id){//´«µÝÏîÄ¿id
		List<User> user =new ArrayList<User>();
		dbconn db=new dbconn();
		db.getConnection();
		String sql="select *from register where r_id=?";
		ResultSet res=db.select(sql, id);
		try {
			while(res.next()) {
				User user1=new User();
				user1.setname(res.getString("name"));
				user1.setaccount(res.getString("account"));
				user1.setmajor(res.getString("major"));
				user1.setQQ(res.getString("QQ"));
				user1.settel(res.getString("tel"));
				user1.setemail("email");
				user.add(user1);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		
		return user;
	}
}
