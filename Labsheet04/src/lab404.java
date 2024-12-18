import java.util.*;
public class lab404 {
	public static void main(String[] args) {
	 
	 inputStudent();
	 
	}
	public static void inputStudent() {
		 Scanner input = new Scanner(System.in);
		 String studentID,subjectCode;
		 boolean isStudentIDValid , isSubjectCodeValid;
		
		 while(true) {
			 System.out.print("Enter subject ID (10 digits)  : ");
			 studentID = input.nextLine();
			 
			 System.out.print("Enter sunject code (7 digits) : ");
			 subjectCode = input.nextLine();
			 
			 isStudentIDValid = isLength(studentID,10);
			 isSubjectCodeValid = isLength(subjectCode,7);
			 
			 if(isStudentIDValid && isSubjectCodeValid) {
				 boolean isITStudent = isITSudent(studentID);
				 boolean isITSubject = isITSubject(subjectCode);
				 
				 displayData(isITStudent,isITSubject);
				 break;
			 }
			 else {
				 System.out.println("Invalid input! Student ID must be 10 digits and Subject Code must be 7 digits");
			 }
		 }

	}
	public static boolean isLength(String input , int len) {
		
		
	return input.length() == len;
	}
	public static boolean isITSudent(String studentID)
	{
		
		return studentID.substring(0, 2).equals("21") && studentID.substring(3, 6).equals("311");
		}
	public static boolean isITSubject(String subjectID){
		
		return subjectID.substring(0, 2).equals("21") && subjectID.charAt(4) == '1';
		
	}
	public static void displayData (boolean isITStudent , boolean isITSubject) {
		if(isITStudent) {
			System.out.print("1st year student in IT and");
		}
		else {
			System.out.print("is not 1st year student in IT \n");
		}
		if(isITSubject) {
		System.out.println("Enroll in courses for Year 1 ");
		}
		else {
		System.out.println("Not enroll in courses for Year 1");
		}
	}
	
	
}
