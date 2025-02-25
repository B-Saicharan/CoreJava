package com.tnsif.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("org.postgresql.Driver");
	System.out.println("load is over");
	
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/teegala","postgres","1234");
	Statement st=conn.createStatement();
	
	String strselect="select sid from student";
	System.out.println("the sql statement"+strselect);
	ResultSet rs=st.executeQuery(strselect);
	System.out.println("the record are");
	int rowscount=0;
	while(rs.next()) {
		String sid=rs.getString("sid");
		System.out.println(sid);
	}
	
	
}
}
