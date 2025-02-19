import java.util.Scanner;
public class Lab306 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("message: ");
        String message = scanner.nextLine().toLowerCase();
        
        
        int index ;
        if (message.indexOf("nichi")>= 0) {
            
            int count = 0;
            while (index >= 0) {
                count++;
                
                message = message.substring(index + 1);
                index = message.indexOf("nichi");
            }
            
           
            System.out.println("Nichi is in a sentence");
        } else {
            
            System.out.println( message);
        }
        
        scanner.close();
    }
}
