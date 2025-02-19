
public class TestResizeableCircle {

	public static void main(String[] args) {
		ResizeableCircle  rc = new ResizeableCircle(10.0);
		System.out.println(rc);
		String frmResult =String.format("%.2f", rc.getPerimeter());
		System.out.println("Perimeter: "+frmResult);
		System.out.printf("Area: %.2f",rc.getArea());
		Line();
		rc.resize(50);
		System.out.println("Perimeter(50%): "+ rc);
		System.out.println("Parimeter: "+ frmResult);
		System.out.printf("Area: %.2f",rc.getArea());


	}
	public static void Line() {
		for (int i = 1 ; i <50 ; i++)
			System.out.print("*");
		System.out.println();
	}

}
