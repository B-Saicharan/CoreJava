package com.tnsif.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertjdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/teegala","postgres","1234");
Statement st=conn.createStatement();

// insert query

//String str = "INSERT INTO student VALUES (107, 'sai')";
//System.out.println("sql statement"+str);
//int countno=st.executeUpdate(str);
//System.out.println(countno+"record inserted");


//// delete the data 
//String sqldelete="delete from student where sid=105";
//System.out.println("the sql statement "+sqldelete);
//
//int countdelte=st.executeUpdate(sqldelete);
//System.out.println(countdelte +" record deleted");


//Update the data after deletion
String sqlUpdate ="UPDATE student SET sname = 'sai charan' WHERE sid = 107";

System.out.println("The SQL statement: " + sqlUpdate);

int countUpdate = st.executeUpdate(sqlUpdate);
System.out.println(countUpdate + " record updated");


	}

}
