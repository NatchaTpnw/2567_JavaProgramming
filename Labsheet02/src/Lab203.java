import javax.swing.JOptionPane;

public class Lab203 {
    public static void main(String[] args) {
                String strWeight ;
                String strHeight ;
                
                //รับinput
                strWeight = JOptionPane.showInputDialog(null,"Input Weight:");
                double weight =Double.parseDouble(strWeight);
                
                strHeight = JOptionPane.showInputDialog(null,"Input height:");
                int height =Integer.parseInt(strHeight);
                //แปลงให้เป็นdecimalNumber
                double heightInMeters = (double)height /100;
                
                //คำนวน
                double bmi =  weight/(heightInMeters * heightInMeters);
                //จัดformat
                
                String formatbmi = String.format("%,2.1f", bmi);
                //เขียนเงื่อนไข
                if(bmi < 18.5) {
                    JOptionPane.showMessageDialog(null, "BMI = "+formatbmi+
                            "\nYou're Underweight",
                            "BMI",JOptionPane.WARNING_MESSAGE);
                }
                else if (bmi >= 18.5 || bmi <= 24.9) {
                    JOptionPane.showMessageDialog(null, "BMI = "+formatbmi+
                            "\nYou're Normal-weight",
                            "BMI",JOptionPane.WARNING_MESSAGE);
                }
                else if (bmi >= 25.0 || bmi <= 29.9) {
                    JOptionPane.showMessageDialog(null, "BMI = "+formatbmi+
                            "\nYou're Overweight",
                            "BMI",JOptionPane.WARNING_MESSAGE);
                }
                else if (bmi > 30) {
                    JOptionPane.showMessageDialog(null, "BMI = "+formatbmi+
                            "\nYou're Obsity",
                            "BMI",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

