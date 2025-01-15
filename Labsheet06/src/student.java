
public class student {
	private String name;
	private double [] scores;
	
	//met 4 std dt
	
	public void setSudentDetail (String stdName, double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}	
		//met calculate avar sc
		
	public double calculateAverageScores () {
			
			double total  = 0;
			for (int i = 0 ; i < scores.length ; i++)
			{
				total += scores[i];
			}
			
			return total/scores.length;		
	} 
	
	public String getGrade() {
		double average = calculateAverageScores();
		
		if (average >= 90)
		{
			return "A";

		}
		else if (average >=80)
		{
			return "B";
		}
		else if (average >=70)
		{
			return "C";
		}
		else if (average >=60)
		{
			return "D";
		}
		else {
			return "F";
		}
		
		
	}
	
	public void  displayStudentDetail() {
		 System.out.println("Name :"+name);
		 System.out.println("Scores :"+scores);
		/*
		 for (int i =0 ; i <scores.length;i++)
		  {
			  System.out.println("scores[i]"+calculateAverageScores());
			  System.out.println("Grade : "+getGrade());
		  }*/
		 for (double score : scores)
		 {
			 
		 }

		
	}
	
	
		

}
