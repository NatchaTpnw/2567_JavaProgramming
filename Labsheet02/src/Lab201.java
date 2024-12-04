import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
	final int BUFFET = 299;
	int numberofCustomer =Integer.parseInt(JOptionPane.showInputDialog("How many coustumer per bill"));
	
	DecimalFormat frm = new DecimalFormat("#,###.00");
	
	double totalPrice = numberofCustomer * BUFFET ;
	
	int isMember = JOptionPane.showConfirmDialog(null,"Total price is " +totalPrice + "baht." + "\nDo you have a member card?" );
	
	if(isMember == JOptionPane.YES_OPTION) { // if(isMember == 0)
		double priceAfterDiscount = totalPrice - (totalPrice * 10 /100);
		JOptionPane.showMessageDialog(null, "Amout to be paid is " +frm.format(priceAfterDiscount) +" baht.");
	}
	else if (isMember == JOptionPane.NO_OPTION) {// if(isMember == 1)
		JOptionPane.showMessageDialog(null, "Amout to be paid is " +frm.format(totalPrice) +" baht.");
	}
	
	while(isMember == JOptionPane.CANCEL_OPTION) {
		 isMember = JOptionPane.showConfirmDialog(null,"Total price is " +frm.format(totalPrice)+ "baht." + "\nDo you have a member card?" );
			
			if(isMember == JOptionPane.YES_OPTION) { // if(isMember == 0)
				double priceAfterDiscount = totalPrice - (totalPrice * 10 /100);
				JOptionPane.showMessageDialog(null, "Amout to be paid is " +frm.format(priceAfterDiscount) +" baht.");
			}
			else if (isMember == JOptionPane.NO_OPTION) {// if(isMember == 1)
				JOptionPane.showMessageDialog(null, "Amout to be paid is " +totalPrice +" baht.");
			}
	}
	//System.out.printf("Total Price is %,.2f baht.", totalPrice  );
	

	}

}
