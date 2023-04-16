package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Provider 
{
	public static Connection getOracleConnection() throws SQLException
	{
		Connection con =null;
		try {
			Class<?> forName = Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(forName);
			System.out.println("This is inside driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oes","root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside Connectiondemo");
		//System.out.println(con.getMetaData());
		return con;
	}

}
