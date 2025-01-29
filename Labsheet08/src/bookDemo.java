import java.util.*;
public class bookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Input author name : ");
		String authorName = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String authorEmail=scan.nextLine();
		author author1 = new author (authorName , authorEmail);
		System.out.println(author1);
		System.out.print("\nInput book title");
		String bookTitle=scan.nextLine();
		System.out.print("Input book page : ");
		int bookPage = scan.nextInt();
		book book1 = new book (bookTitle,author1,bookPage);
		System.out.println(book1);
	}

}
