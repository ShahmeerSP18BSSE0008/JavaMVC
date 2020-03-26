package mvc;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		Controller controller = new Controller();
		controller.viewData("FirstName", "Waqas");
	}
}
