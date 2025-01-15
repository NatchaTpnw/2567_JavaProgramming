
public class LAB603Product {
	private String pdname;
	private double pdprice;
	private double pdvatRate;
	
	//met
	public void setProductDetails (String name ,double price , double vatRate) {
		pdname = name;
		pdprice = price ;
		pdvatRate = vatRate;
		
	}//met1
	
	public double calculateTotalPrice () {
		return  (pdprice *(pdvatRate/100))+ pdprice;
		
		}//met2
	public void displayProductDetails () {
		System.out.println("\nProduct Details:");
		System.out.println("Product Name: "+pdname);
		System.out.println("Price (Before VAT): "+pdprice);
		System.out.println("Price (After  VAT): "+calculateTotalPrice());



	}
	
}
