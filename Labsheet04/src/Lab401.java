import javax.swing.*;
public class Lab401 {

	//main method
	public static void main(String[] args) {
		inputEmail();

	}//end of main method
	public static void inputEmail() {
		String ans;
		String varEemail;
		
		do {
			varEemail = JOptionPane.showInputDialog("Input your e-mail :");
			if(varEemail!=null && !varEemail.isEmpty()) {
				checkEmailError(varEemail);
			}
			else {
				JOptionPane.showMessageDialog(null, "Email can not be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input e-mail address[Y/y] :");
		}while(ans != null&& ans.equalsIgnoreCase("y"));
	}//end of input email method
	public static void checkEmailError(String email)	{
		while(email.startsWith("@")|| email.contains(" ") ){
			email =JOptionPane.showInputDialog("Invalid e-mail , Input your e-mail :");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(email)?"Your e-mail is "+email : "Your e-mail is not a gmial or hotmail address.");
	}//end
	public static boolean checkEmail (String email) {
		/*if (email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;
		}
		else
		{
			return false;
		}*/
		return email.endsWith("@gmail.com")||email.endsWith("@hotmail.com");
		
	}

}
