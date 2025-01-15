
public class testStudent {

	public static void main(String[] args) {
		student student1 = new student ();
		student student2 = new student ();

		student1.setSudentDetail("Natcha", new double [] {85.0,78.0,92});
		student2.setSudentDetail("Samsoo", new double [] {68.0,66.5});
		
		System.out.println("Student 1 details");
		student1.displayStudentDetail();
		
		System.out.println("Student 2 details");
		student2.displayStudentDetail();
		

	}

}
