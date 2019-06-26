package com.jxgm.DBConnection;
import java.sql.*;

public class DB{
    private static String dburl="jdbc:postgresql://localhost:5432/shop";
	private static String dbUserName="hjh";
	private static String dbPassword="1234";
    private static String jdbcName="org.postgresql.Driver";
	
	public static Connection getCon() throws SQLException{
        try {
		Class.forName(jdbcName);
		} catch (ClassNotFoundException e) {
		}
		Connection con=DriverManager.getConnection(dburl,dbUserName,dbPassword);
		return con;
	}

	public void closeCon(Connection con) throws SQLException{
		if(con!=null){
			con.close();
		}
	}

	public static void main(String[] args){
		DB db=new DB();
		try{
		db.getCon();
		System.out.println("数据库连接成功!");
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}