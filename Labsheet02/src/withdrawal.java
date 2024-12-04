import javax.swing.*;
import java.util.*;
public class withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int moneyWithDraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance :"+balance +"\nInput money to withDraw :"));
		
		if(moneyWithDraw > balance) {
			JOptionPane.showMessageDialog(null, 
					"Error : Cannot withdraw more than balace",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithDraw > 50000) {
			JOptionPane.showMessageDialog(null, 
					"Error : Cannot withdraw more than 50,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithDraw %100 != 0) {
			JOptionPane.showMessageDialog(null, 
					"Error : Cannot withdraw "+moneyWithDraw%100 +" baht." ,
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "You withdraw " + moneyWithDraw +" baht."+
		"\n1,000 = "+ (moneyWithDraw % 1000) + 
		"\n500 = "+((moneyWithDraw % 1000)/500) +
		"\n100 = "+((moneyWithDraw % 500)/100));
		}

	}

}
