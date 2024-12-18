import java.util.*;

public class Lab201 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number :");
		int preNumber = input.nextInt();
		while(true) {
			System.out.print("Input number :");
			int afterNumber = input.nextInt();
			if (afterNumber < preNumber) {
				System.out.println("BYE BYE");
				break;
			}
			preNumber = afterNumber;
			
		}
		input.close();
		
		

	}

}