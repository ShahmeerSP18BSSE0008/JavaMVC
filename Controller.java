package mvc;

import java.sql.SQLException;

public class Controller {
	private Model model;
	private View view;
	
	public Controller() {
		this.model = new Model();
		this.view = new View();
	}
	
	public void InsertData(String employeeId, String firstName, String lastName, String gender, String hiredDate, int salary) throws SQLException {
		model.InsertData(employeeId, firstName, lastName, gender, hiredDate, salary);
	}
	
	public void UpdateDate(String EmpOId, String empNId, String newFirstName, String newLastName, String newGender, String newHiredDate, int newSalary) throws SQLException {
		model.UpdateData(EmpOId, empNId, newFirstName, newLastName, newGender, newHiredDate, newSalary);
	}
	
	public void deleteData(String employeeId) throws SQLException {
		model.DeleteData(employeeId);
	}
	
	public void viewData(String column, String employeeId) throws SQLException {
		view.viewData(model.selectData(column, employeeId), column);
	}
	
	public void viewAllData() throws SQLException {
		view.AllData(model.selectAllData());
	}
	
	
	

}
