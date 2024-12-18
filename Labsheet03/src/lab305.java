import java.util.Scanner;
public class lab305 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	        
	        String sentence;
	        
	        while (true)
	        {
	            System.out.print("Input some sentence : ");
	            sentence = scanner.nextLine();
	            
	            if (sentence.endsWith(".")) {
	                break; 
	            } 
	            else 
	            {
	                System.out.println("The sentence must end with full stop point : ");
	            }
	        }
	        //ลบ.
	        sentence = sentence.substring(0, sentence.length() - 1);
	        
	        int start = 0;
	        //วน
	        for (int i = 0; i < sentence.length(); i++) 
	        {
	        	//เช็คช่องว่าง
	            if (sentence.charAt(i) == ' ') 
	            {
	                System.out.println(sentence.substring(start, i));
	                start = i + 1; 
	            }
	        }
	        
	        System.out.println(sentence.substring(start));
	        
	        scanner.close();
	    }
}
