import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 double totalPrice = 0.0;
		Product[] products = new Product[4];
		
		//input
		 for (int i = 0; i < products.length; i++) {
	            products[i] = new Product();
	            System.out.print("Input product Id    : ");
	            products[i].setId(scan.nextLine());
	            System.out.print("Input product Unit  : ");
	            products[i].setUnit(scan.nextInt());
	            System.out.print("Input product Price : ");
	            products[i].setPrice(scan.nextDouble());
	            System.out.println();
	            scan.nextLine();
	     }
		 System.out.println("----------------------------------------------------------------------------------");
		 for (Product prod:products) {
	            System.out.println("Product ID : " + prod.getId() + ", Total price = " + String.format("%,.2f", prod.calculate()) + " baht.");
	            totalPrice += prod.calculate();
	        }
	        System.out.println("----------------------------------------");
	        System.out.println("Total price of all products = " + String.format("%,.2f", totalPrice));
	    }

	}

}
