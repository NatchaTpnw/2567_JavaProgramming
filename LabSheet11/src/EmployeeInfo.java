import java.io.IOException;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner (System.in);
		
		String choose ;
		
		System.out.print("Insert of Search Data? : ");
		choose = input.next().toLowerCase();
		
		while (!choose.equals("insert")&& !choose.equals("search")) {
			System.out.print("Insert of Search Data ,again? : ");
			choose = input.next().toLowerCase();
		}
		SaveAndOpen objFile = new SaveAndOpen();
		if(choose.equals("insert")) {
			objFile.insert();
		}
	}
	

}
