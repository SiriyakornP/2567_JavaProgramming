
public class TestEmployee {

	public static void main(String[] args) {
		//create two employees objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//set details
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//display details
		System.out.println("Empolyee 1 Details");
		emp1.displayEmployeeDetails();
		System.out.println("\nEmpolyee 2 Details");
		emp2.displayEmployeeDetails();

	}

}
