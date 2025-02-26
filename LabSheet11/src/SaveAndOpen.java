import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;
public class SaveAndOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert () throws IOException{
		Scanner input = new Scanner (System.in);
		
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt") );
		String answer;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept=input.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Do you want to input data ,again ? : ");
			answer = input.next();
			
		}while(answer.equalsIgnoreCase("y"));
	}
	public void searchData() throws IOException{
		try{
			Scanner readFile = new Scanner (new File("src//txtFile//employee.txt"));
			int i = 0 ;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
			name = readFile.next();
			dept = readFile.next();
			
			if(dept.equalsIgnoreCase(getDept())) {
				i++;
				System.out.println(i+")"+name);
				check = true;
				}
			}
			if(check) {
				super.header();
				System.out.println("Employee in dept "+ super.getDept()+"is "+i + "person(s).");
			}else {
				System.out.println("\nSorry ,no dept: "+super.getDept());
			}
			
		}
		catch(IOException e){
			System.out.println("\nSorry ,file not found...");
		}
	}
}
