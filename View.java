package mvc;

import java.sql.ResultSet;

public class View {
	public void viewData(ResultSet resultSet, String column) {
		try {
			while(resultSet.next()) {
				String data = resultSet.getString(column);
				System.out.println(column + "=" + data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void AllData(ResultSet resultSet) {
		try {
			while(resultSet.next()) {
				String employeeId = resultSet.getString("EmployeeID");
				String firstName = resultSet.getString("FirstName");
				String lastName = resultSet.getString("LastName");
				String Gender = resultSet.getString("Gender");
				String HiredDate = resultSet.getString("HiredDate");
				int Salary = resultSet.getInt("Salary");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
