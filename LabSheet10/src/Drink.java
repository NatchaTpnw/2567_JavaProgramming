public class Drink {
	
	private int type ;
	private char size;
	
	public Drink (int type , char size) {
		this.type = type;
		this.size=size;

		
	}
	public Drink() {
		
		
	}
	public String getTypeName() {
		if (type == 1) {
			return "Hot";
		}
		else if(type == 2)
		{
			return "Cold";
		}
		else {
		return "" ;
		}
		
	}
	public int getTypePrice () {
		if (type == 1) {
			return 10;
		}
		else if (type == 2 ) {
			return 20;
		}
		else {
		return 0;
		}
	}
	public String getSizeName () {
		if (size == 'S')
		{
			return "Small";
		}
		else if (size == 'M' ) {
			return "Medium";
		}
		else if (size == 'L') {
			return "Large";
		}
		else
		{

		return "";
		
		}	
	
	public int getSizePrice () {
		return 0;
	}
	public int getTotalprice () {
		return 0;
	}
	
	
	

}
