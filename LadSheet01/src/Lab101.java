import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Input Product Name   : ");
		String productname = input.nextLine();
		
		System.out.print("Input Product Unit   : ");
		int productunit = input.nextInt();
		
		System.out.print("Input Price Per Unit : ");
		float productprice = input.nextFloat();
		
		System.out.println("---------------------------------------------");

		float totalPriceOfProduct = productunit * productprice;
		System.out.printf("Total Price is "+frm.format(totalPriceOfProduct)+" baht.");
		
		System.out.println("\n---------------------------------------------");
		
		System.out.print("How many discount (%) : ");
		int productdiscount = input.nextInt();
		
		System.out.println("---------------------------------------------");
		
		
		float amount = totalPriceOfProduct - (totalPriceOfProduct * productdiscount/100);
		float totalWithDiscount = totalPriceOfProduct - amount;
		String  frmtotalWithDiscount =String.format("%,.2f",totalWithDiscount);
		String  frmamount= String.format("%,.2f",amount);
		System.out.println("Discount from "+productdiscount +"%    " +frmtotalWithDiscount+" baht.");
		System.out.println("Discount from "+productdiscount +"%    " +frmamount+" baht.");
		
		
	

		
	}

}
