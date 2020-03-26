package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
	private Connection connection;
	private String employeeID;
	private String firstName;
	private String lastName;
	private String gender;
	private String hiredDate;
	private int salary;
	
	{
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	String conUrl = "jdbc:sqlserver://SHAHMEER\\SQLEXPRESS;database=Employees;integratedSecurity=true;";
	connection = DriverManager.getConnection(conUrl);
	}
	catch (Exception e){
		System.out.println(e.getMessage());
	}
	}

	public void InsertData(String employeeID, String firstName, String lastName, String gender, String hiredDate, int salary) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate("INSERT INTO Employee VALUES('" + employeeID +"','" + firstName + "','" + lastName + "','" + gender + "','" + hiredDate + "','" + salary+ "')");
		connection.close();
	}

	
	public void DeleteData(String employeeID) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from Employee where EmployeeID=" + "'employeeID'");
		connection.close();
	}
	
	public void UpdateData(String empOId, String empNId, String neweFirstName, String newLastName, String newGender, String newHiredDate,int newSalary) throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate("update Employee set employeeID= empNId"
																		+ "firstName = newFirstName"
																		+ "lastName = newLastName"
																		+ "gender = newGender"
																		+ "hiredDate = newHiredDate"
																		+ "salary = newSalary"
																		+ "where employeeID = EmpOId" );
		connection.close();
	}
	
	public ResultSet selectData(String column, String employeeID) throws SQLException {
		ResultSet resultSet = null;
		Statement st = connection.createStatement();
		ResultSet resultSet1 = st.executeQuery("select" + "column" + "from Employee where employeeID= " + "employeeID");
		connection.close();
		resultSet=resultSet1;
		return resultSet;
	}
	
	public ResultSet selectAllData() throws SQLException {
		ResultSet resultSet = null;
		Statement st = connection.createStatement();
		ResultSet resultSet1 = st.executeQuery("select * from Employee");
		connection.close();
		resultSet=resultSet1;
		return resultSet;
		
	}
	
	
	
	
	

}
