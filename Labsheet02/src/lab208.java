import java.util.*;
import java.text.*;
 
public class lab208 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("####.00");
	      //Declare constants
		  final int SALARY_CEILING = 6000;
	      final double EMPLOYEE55BELOW = 0.2;
	      final double EMPLOYER55BELOW = 0.17;
	      final double EMPLOYEEBETWEEN55TO60 = 0.13;
	      final double EMPLOYERBETWEEN55TO60 = 0.13;
	      final double EMPLOYEEBETWEEN60TO65 = 0.075;
	      final double EMPLOYERBETWEEN60TO65 = 0.09;
	      final double EMPLOYEE65UP = 0.05;
	      final double EMPLOYER65UP = 0.075;
		
	      int salary, age;
	      int contributableSalary;
	      double employeeContribution, employerContribution, totalContribution;
	      employeeContribution = 0;
	      employerContribution = 0;
	      
	      System.out.print("Enter the monthly salary: $");
	      salary = input.nextInt();
	      System.out.print("Enter the age: ");
	      age = input.nextInt();
	      if (salary > SALARY_CEILING) {
	    	    contributableSalary = SALARY_CEILING;
	    	} else {
	    	    contributableSalary = salary;
	    	}
 
	      if(age <= 55) {
	    		  employeeContribution = contributableSalary * EMPLOYEE55BELOW;
		    	  employerContribution = contributableSalary * EMPLOYER55BELOW;
		    	  totalContribution = employeeContribution + employerContribution;
		    	  
	    		  System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
    			  + "\nThe employer's contribution is: $" + frm.format(employerContribution)+
    			  "\nThe total contribution is: $"+frm.format(totalContribution));
	      }else if(age > 55 && age <= 60) {
 
	    	  employeeContribution = contributableSalary * EMPLOYEEBETWEEN55TO60 ;
	    	  employerContribution = contributableSalary * EMPLOYERBETWEEN55TO60;
	    	  totalContribution = employeeContribution + employerContribution;
	    	  
	    	  System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
			  + "\nThe employer's contribution is: $" + frm.format(employerContribution)+
			  "\nThe total contribution is: $"+frm.format(totalContribution));
	      }else if(age > 60 && age <= 65) {
	    	  
	    	  employeeContribution = contributableSalary * EMPLOYEEBETWEEN60TO65;
	    	  employerContribution = contributableSalary * EMPLOYERBETWEEN60TO65;
	    	  totalContribution = employeeContribution + employerContribution;
	    	  
	    	  System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
	    			  + "\nThe employer's contribution is: $" + frm.format(employerContribution)+
	    			  "\nThe total contribution is: $"+frm.format(totalContribution));
	      }else {
	    	  
	    		  employeeContribution = contributableSalary * EMPLOYEE65UP;
		    	  employerContribution = contributableSalary * EMPLOYER65UP;
		    	  totalContribution = employeeContribution + employerContribution;
	    		  System.out.print("The employee's contribution is: $" + frm.format(employeeContribution)
    			  + "\nThe employer's contribution is: $" + frm.format(employerContribution)+
    			  "\nThe total contribution is: $"+frm.format(totalContribution));
	    	  }
	      input.close();
		}     
}