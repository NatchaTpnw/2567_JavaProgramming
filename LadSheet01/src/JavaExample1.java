import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
//จัด format ด้สย decimal format
	DecimalFormat frm = new DecimalFormat("#,###.00");
	System.out.print("Input product name   : ");
	String productname = input.nextLine();
	
	System.out.print("Input product unit   : ");
	int productunit = input.nextInt();
	
	System.out.print("Input price per unit : ");
	float productprice = input.nextFloat();
	
	System.out.println();
	
	float totalPriceOfProduct = productunit * productprice;
	System.out.println ("Total Price is "+frm.format(totalPriceOfProduct)+" baht.");
	float totalWithVat = totalPriceOfProduct + (totalPriceOfProduct * 7/100);
	System.out.println("Add VAT 7% is "+frm.format(totalWithVat) +" baht.");
	
	System.out.println();
	//จัดformat ด้วย string format
	String frmTotalWithVat =String.format("%,.2f",totalWithVat);
	System.out.println("Add VAT 7% is "+ frmTotalWithVat +" baht.");
	//ใช้printf
	System.out.printf("ADD VAT 7%% is %,f",totalWithVat);
	
	
	input.close();
	
	
	}

}
