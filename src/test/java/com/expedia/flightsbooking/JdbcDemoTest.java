package com.expedia.flightsbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JdbcDemoTest {

	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	String DB_URL=null;
	String USERNAME=null;
	String PWD=null;		
	
	@BeforeClass
	public void beforeClass()
	{
		//Connection con=PropFileDUtil.myConnection();
		DB_URL="jdbc:oracle:thin:@//localhost:1524/PDB1";
		USERNAME="hr";
		PWD="hr5";
		
		
	}
	
	@Test
	public void test1()
	{
		try
		{
		con=DriverManager.getConnection(DB_URL, USERNAME, PWD);
		st=con.createStatement();	
		ResultSet rs=st.executeQuery("select city from locations where city like 'S%'");
			
				//("select name from v$pdbs");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@AfterClass
	public void tearDown() throws SQLException
	{
       con.close();
	}

}
