package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SkillDAO
{
	
	public List<Skill> listAllSkill()
	
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = null;
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Reset1998@");
		
		Statement statement = (Statement) con.createStatement();
		 
		ResultSet results = ((java.sql.Statement) statement).executeQuery("SELECT * FROM Skills");
		 
		 
		 
		while (results.next()) {

		 
		 
		  String data = results.getString(1);
		  
		  System.out.println(data);
	}
	//The above method is used to fetch all the skills from skill table and returns the list of skills.
	//Display the skills in ascending order based on name.
		}
}
