package com.springau.doa;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.jdbc.*;
import com.springau.exceptions.EmployeeNotFoundException;
import com.springau.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public void add(Employee employee) throws EmployeeNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//System.out.println(dataSource.getClass().ge);
		String query = "insert into employee (id, empname, email,dept) values (?,?,?,?)";
		String query1 = "use jdbc";
		Connection con = null;
		PreparedStatement ps = null;
		
			
			con = (Connection) dataSource.getConnection();
			System.out.println("hii");
			ps = (PreparedStatement) con.prepareStatement(query1);
			int out1=ps.executeUpdate();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getDept());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Employee saved with id="+employee.getId());
			}else 
				{
				System.out.println("enf");
				throw new EmployeeNotFoundException();
				}
				ps.close();
				con.close();
			
	}
	

	@Override
	public void update(Employee employee) throws EmployeeNotFoundException, SQLException {
		String query = "update employee set empname=?,dept=?,email=? where id=?";
		String query1 = "use jdbc";
		Connection con = null;
		PreparedStatement ps = null;
		
			con = (Connection) dataSource.getConnection();
			System.out.println("hii");
			ps = (PreparedStatement) con.prepareStatement(query1);
			int out1=ps.executeUpdate();
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.setInt(4, employee.getId());
			ps.setString(1, employee.getName());
			ps.setString(3, employee.getEmail());
			ps.setString(2, employee.getDept());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Employee updated with id="+employee.getId());
			}else throw new EmployeeNotFoundException();
		
				ps.close();
				con.close();
			
		
		
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException, SQLException {
		System.out.println(id);
		String query = "delete from Employee where id=?";
		String query1 = "use jdbc";
		Connection con = null;
		PreparedStatement ps = null;
		
			
			con = (Connection) dataSource.getConnection();
			System.out.println("hii");
			ps = (PreparedStatement) con.prepareStatement(query1);
			int out1=ps.executeUpdate();
			
			ps = (PreparedStatement) con.prepareStatement(query);
			ps.setInt(1, id);
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Employee deleted with id="+id);
			}else throw new EmployeeNotFoundException();
		
				ps.close();
				con.close();
			
		
		
		
		
	}

	@Override
	public List<Employee> getAll() throws SQLException {
		
		String query = "select * from employee";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Employee> empList = new ArrayList<Employee>();
		
		Connection con = null;
		PreparedStatement ps = null;
		
			String query1 = "use jdbc";
			con = (Connection) dataSource.getConnection();
			System.out.println("hii");
			ps = con.prepareStatement(query1);
			int out1=ps.executeUpdate();
		
		ps = (PreparedStatement) con.prepareStatement(query);
		 ResultSet rs = ps.executeQuery();
		 
           while (rs.next()) {

        	   Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("empname"));
				emp.setDept(rs.getString("dept"));
				emp.setEmail(rs.getString("email"));
				empList.add(emp);
           }
		
		return empList;
	}
	@Override
	public Employee getdet(int id) throws SQLException {
		
		String query = "select * from employee where id=?";
		
	
		String query1 = "use jdbc";
		Connection con = null;
		PreparedStatement ps = null;			
			con = (Connection) dataSource.getConnection();
			System.out.println("hii");
			ps = (PreparedStatement) con.prepareStatement(query1);
			int out1=ps.executeUpdate();
			System.out.println("out1"+out1);
			
			ps = (PreparedStatement) con.prepareStatement(query);
			 ResultSet rs = ps.executeQuery();
			 Employee emp = new Employee();
	            while (rs.next()) {

	            	
					emp.setId(rs.getInt("id"));
					emp.setName(rs.getString("empname"));
					emp.setDept(rs.getString("dept"));
					emp.setEmail(rs.getString("email"));
	            }
			
		
				ps.close();
				con.close();
			
		
		
				
		return emp;
	}
	

}
