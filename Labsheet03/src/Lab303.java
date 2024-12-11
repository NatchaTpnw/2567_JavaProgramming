import java.util.*;
public class Lab303 {
	public static void main (String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();
		
		int countSpace=0;
		while(!sentence.endsWith(".")){
			System.out.print("Input a sentence, again: ");
			sentence = input.nextLine();
		}
		for (int i = 0 ; i < sentence.length();i++)
		{
			if (sentence.charAt(i) == ' ');
			{
				countSpace ++ ;
			
			}
			
		}
		System.out.println("This sentence has " + countSpace +"Spacebar");
		System.out.println("This sentence has " + (countSpace+1) +"word");
	}
}
