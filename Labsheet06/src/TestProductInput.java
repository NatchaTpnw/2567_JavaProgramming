
public class TestProductInput {
	public static void main (String[] args) {
		
		Employee emp1 = new Employee () ;
		Employee emp2 = new Employee () ;
		
		//set emp details
		emp1.setEmpolyeeDetails("Natcha",45, 20.0);
		emp2.setEmpolyeeDetails("Attakorn", 38, 25.0);
		
		//dp emp dt
		System.out.println("Employee 1 Details");
		emp1.displayempolyeeDetails();
		
		System.out.println("\nEmployee 2 Details");
		emp2.displayempolyeeDetails();
		
		
	}
}
