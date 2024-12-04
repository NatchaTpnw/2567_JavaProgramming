 import javax.swing.*;
 

public class Lab203 {

	public static void main(String[] args) {
		String strWeight ;
		String strHeight ;
		
		strWeight = JOptionPane.showInputDialog("Input Weight:");
		int weight =Integer.parseInt(strWeight);
		
		strHeight = JOptionPane.showInputDialog("Input Weight:");
		int height =Integer.parseInt(strHeight);
		double heightInMeters = height /100;
		//double bmi = weight / (heightInMeters * heightInMeters);
		*/*if(bmi < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = "+bmi+
					"\nYou're Underweight",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi >= 18.5 || bmi <= 24.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+bmi+
					"\nYou're Normal-weight",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi >= 25.0 || bmi <= 29.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+bmi+
					"\nYou're Overweight",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi > 30) {
			JOptionPane.showMessageDialog(null, "BMI = "+bmi+
					"\nYou're Obsity",
					"BMI",JOptionPane.WARNING_MESSAGE);*/
		}

	}

}
