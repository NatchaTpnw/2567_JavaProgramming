import java.util.*;
public class TestEmployeeinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Employee emp1 = new Employee () ;
		Employee emp2 = new Employee () ;
		
		
		System.out.println("Enter detail for Employee 1");
		System.out.print("Name :");
		String empName1 = scan.nextLine();
		System.out.print("Hours workd  :");
		int empHourWorked1 = scan.nextInt();
		System.out.print("Hourly Rate:");
		double empHourlyRate1 = scan.nextDouble();
		System.out.println();		
		
		emp1.setEmpolyeeDetails(empName1, empHourWorked1, empHourlyRate1);		
		Line('*');		
		System.out.println();
		emp1.displayempolyeeDetails();
		
		scan.nextLine();
		
		System.out.println();
		Line('*');		
		System.out.println();
		
		System.out.println("Enter detail for Employee 2");
		System.out.print("Name :");
		String empName2 = scan.nextLine();
		System.out.print("Hours workd  :");
		int empHourWorked2 = scan.nextInt();
		System.out.print("Hourly Rate:");
		double empHourlyRate2 = scan.nextDouble();
		
		
		emp2.setEmpolyeeDetails(empName2, empHourWorked2, empHourlyRate2);		
		
		Line('*');			
		System.out.println();

		emp2.displayempolyeeDetails();
		scan.close();
	}//end main
	
	//line method
	public static void Line (char symbol) {
		
		//System.out.print("---------------------------------------------------------");
		for (int i = 1 ; i < 50 ;i++) {
			System.out.print(symbol);
			
		}//end for loop

	}//end line met

}
