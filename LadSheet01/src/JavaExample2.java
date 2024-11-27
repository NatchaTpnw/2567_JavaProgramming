import javax.swing.*;

public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name    :");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit :");
		int productUnit =Integer.parseInt(strProductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per  Unit :"));
		double totalPriceOfProduct = productUnit * productPrice;
		String frmTotalPrice =String.format("%,.2f",totalPriceOfProduct);
		double totalWithVat = totalPriceOfProduct + (totalPriceOfProduct * 7/100);
		String frmTotalWithVat =String.format("%,.2f",totalWithVat);
		JOptionPane.showConfirmDialog(null,"Total Price is "+frmTotalPrice + " baht."+"\nAdd VAT 7% is "+ frmTotalWithVat + " baht.");
		
		

	}

}
