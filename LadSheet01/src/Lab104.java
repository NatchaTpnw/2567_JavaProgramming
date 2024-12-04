import javax.swing.JOptionPane;
public class Lab104 {
	   public static void main(String[] args) {
		   final double TAXRAET = 0.15;
		   final double HOURLYWAGE = 7.5;
		    JOptionPane.showMessageDialog(null,"Welcome to the payroll application");

		    String name = JOptionPane.showInputDialog(null,"Enter employee name","input",JOptionPane.QUESTION_MESSAGE);
		    
		    String strWorkHour = JOptionPane.showInputDialog(null,"Enter total hours for this employee");
		    double workHour = Integer.parseInt(strWorkHour);

		    double grossEarning = workHour *HOURLYWAGE ;
		    double tax = grossEarning  * TAXRAET;
		    double netEarning = grossEarning-tax;

		    String message = "Employee name: "+name+"\nHour worked: "+workHour+"\nHourly wage: $ 7.5\nGross earning: $ "+grossEarning+"\nTax rate: 0.15\nTax: $ "+tax+"\nNet earning: $ "+netEarning;
		    JOptionPane.showMessageDialog(null, message);

		    }

}
