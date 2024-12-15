import java.util.*;
public class lab207 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 final double TAX20K = 0.1;
		 final double TAX40K = 0.2;
		 final double TAX60K = 0.3;
		 
		 int taxableIncome;
		 double taxPayable;
		 System.out.print("Enter the taxable income: $");
	      taxableIncome = input.nextInt();
		
		 if (taxableIncome <= 20000) { 
		 taxPayable = 0.0;
		 } else if (taxableIncome <= 40000) { 
		 taxPayable = TAX20K * (taxableIncome-20000);
		 } else if (taxableIncome <= 60000) { 
		 taxPayable = (TAX40K * (taxableIncome-40000)+(TAX20K*20000));
		 } else {
			 taxPayable = (TAX60K * (taxableIncome-60000)+(TAX20K*20000)+((TAX40K*20000)));
		 }

	}
}