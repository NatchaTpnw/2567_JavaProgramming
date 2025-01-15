import java.util.*;
public class Lab603testProductInput {

	public static void main(String[] args) {
		LAB603Product product = new LAB603Product();
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Ener product name   :");
		String pdname = scan.nextLine();
		System.out.print("Enter product price :");
		double pdPrice = scan.nextDouble();
		System.out.print("Enter VAT Rate(%) :");
		double vat = scan.nextDouble();	
		
		product.setProductDetails(pdname, pdPrice, vat);
		product.displayProductDetails();
		

	}

}
