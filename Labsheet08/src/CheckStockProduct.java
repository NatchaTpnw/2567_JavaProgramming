import java.util.Scanner;
public class CheckStockProduct {
	Scanner scn = new Scanner(System.in);
    
    System.out.print("How many product list in stock : ");
    Product[] products = new Product[scn.nextInt()];
    
    
    for (int i = 0; i < products.length; i++) {
        products[i] = new Product();
        
        scn.nextLine();
        System.out.print("Input product Id    : ");
        products[i].setId(scn.nextLine());
        
        System.out.print("Input product Unit  : ");
        products[i].setUnit(scn.nextInt());
        
        System.out.println();
    }
}
