
public class Employee {

	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	//set emp details
		
	public void setEmpolyeeDetails (String empName , int hours , double rate){
		
		name = empName;
		hourWorked = hours;
		hourlyRate = rate;		
	}
	//กำหนดเงินเดือน
	public double calculateSalary() {
	
		double salary = hourlyRate * hourWorked;
		
		if (hourWorked < 40 ){
			double bonus = salary * 0.10 ;
			salary += bonus;
			
		}
	return salary;
	
	}
	
	public void displayempolyeeDetails () {
		System.out.println("Name : "+ name);
		System.out.println("Hours Worked : " + hourWorked);
		System.out.println("Hourly rate : "+hourlyRate);
		System.out.println("Total Salary : " + calculateSalary());
		
	}
	
	
	
	
	
	
	
	
	
	
}
