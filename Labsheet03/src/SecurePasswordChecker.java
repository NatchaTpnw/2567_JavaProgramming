import java.util.*;
public class SecurePasswordChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		while(true)
		{
			System.out.println("Enter your password (type 'exit' to quit)");
			String password = input.nextLine();
			
			if(password.equalsIgnoreCase("exit"))
			{
				System.out.println("Promgram terminate");
				break;
			}
			String errors = "";
			if(password.length()<8)
			{
				errors +="Password must be atleat 8 chracter long.\n";
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase =false;
			boolean hasDigit = false;
			for(int i = 0; i< password.length(); i++)
			{
				char ch = password.charAt(i);
				
				if(ch >= 'A' && ch <= 'Z')
				{
					hasUpperCase = true;
				}
				else if (ch >= 'a' && ch <= 'z')
				{
					hasLowerCase =true;
				}
				else if (ch > '0' && ch < '9')
				{
					hasDigit = true;
				}
			}
			if(!hasUpperCase)
			{
				errors += "-Password must contain atlease one upperCase letter (A-Z). \n";
			}
			if(!hasLowerCase)
			{
				errors += "-Password must contain atlease one lowerCase letter (a-z). \n";
			}
			if(!hasDigit)
			{
				errors += "-Password must contain atlease one digit letter (0-9). \n";
			}
			
			if(errors.isEmpty())
			{
				System.out.print("Yor password is secure");
				
			}
			else 
			{
				System.out.println("Password validation errors.");
				System.out.println(errors);
			}						
		}//endwhile
		
		
				input.close();
	}
}
