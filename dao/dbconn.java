package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class dbconn {
	//三属性
	private  Connection conn;
	private  PreparedStatement pre;
	private  ResultSet res;
	//四方法
	//方法一 连接数据库
	public void getConnection() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/volunteersystem?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false\",\"root\",\"root");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//方法二 关闭数据库
	public void closeConnetion() {
		if(res!=null) {
			try {
			res.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		if(pre!=null) {
			try {
				pre.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//方法三 查询数据
	public  ResultSet select(final String sql,Object...args) {
		getConnection();
		try {
			pre=conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				pre.setObject(i+1, args[i]);
				}
		    res=pre.executeQuery();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	//方法四 删除数据
	public void delete(final String sql,Object...args) {
		getConnection();
		try {
			pre= conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				pre.setObject(i+1, args[i]);
				}
			pre.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//方法五 插入数据
	public void insert(String sql,Object...args) {
		try {
			getConnection();
			pre= conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				pre.setObject(i+1, args[i]);
				}
			pre.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//方法六 更新数据
	public  void update(final String sql,Object...args) {
		try {
			getConnection();
			pre= conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				pre.setObject(i+1, args[i]);
				}
			pre.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
