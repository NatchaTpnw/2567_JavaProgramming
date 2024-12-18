import java.util.*;
public class Lab304 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = input.nextLine();
		
		//ตรวจสอบว่ามีช่องว่างไหม
		if (!fullName.contains(" ")) 
		{
            System.out.println("Incorrect Name");
        } else // แยก
        {
            String firstName = fullName.substring(0, fullName.indexOf(" "));
            String lastName = fullName.substring(fullName.indexOf(" ") + 1);
            //แสดงผล
            System.out.println("ชื่อ: " + firstName.toUpperCase());
            System.out.println("นามสกุล: " + lastName.toLowerCase());
        }

		input.close();

	}
}
