import java.util.Scanner;
public class Lab102 {
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Input te number of minute: ");
			int minute = input.nextInt();
			int years = minute / 525600;
			int days = minute % 525600 / 1440;
			System.out.println(minute+" minute is approximately "+years+" years and "+days+" days");
			input.close();			
	}

}
