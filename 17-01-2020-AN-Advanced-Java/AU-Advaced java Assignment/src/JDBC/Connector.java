package JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.*;

public class Connector {
public static Connection con;
	
	public static void main(String args[]) {
		try {
			 
			connectToMySQL();
			
			CallableStatement statement = null;
			String q1="use employee";
			statement = con.prepareCall(q1);
			
			 statement.executeQuery();
			 
			String query = "{CALL data()}";
			statement = con.prepareCall(query);
			 ResultSet result1 = statement.executeQuery();
			 
			 
			 List<emp> l=new LinkedList<>();
			 while(result1.next()) {
				 emp e=new emp();
				 //System.out.println(result1);
				 e.setid(result1.getInt("id"));
				 e.setidid(result1.getInt("dept_id"));
				 e.setfname(result1.getString("firstname"));
				 e.setlname(result1.getString("lastname"));
				 e.setdname(result1.getString("dept_name"));
				 l.add(e);
				 
		            	
		            }
			 System.out.printf(" %4s %10s %10s %8s %8s","id\n","id", "firstname","lastname","d_id","dep_name");
			 for(emp row: l) {
				 System.out.printf("\n %4d %10s %10s %8d %8s",row.getid(),row.getfname(),row.getlname(),row.getdid(),row.getdname());
			 }
			 con.close();
			 
		} catch(Exception e) {
            System.err.println("Error 4: "+e.getMessage());
		}
		
	}
	public static void connectToMySQL() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/employee","root","root");
	    } catch (ClassNotFoundException e) {
	        System.err.println("Error 1: "+e.getMessage());
	    } catch (SQLException e) {
	        System.err.println("Error 2: "+e.getMessage());
	    } catch (Exception e) {
	        System.err.println("Error 3: "+e.getMessage());
	    }
	}
}

		
