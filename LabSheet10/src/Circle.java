
public class Circle implements Geometric {
	protected double radius ;
	
	Circle (double radius){
		this.radius = radius;
		
	}
	
	
	
	@Override	
	public double getPerimeter() {
		return 2* Math.PI * this.radius;
		
	}
	
	@Override 
	public double getArea() {
		return Math.PI * Math.pow(radius, 2); 
		
	}
	public String ToString () {
		return "Circle[radius = "+this.radius+"]";
		
	}

}
