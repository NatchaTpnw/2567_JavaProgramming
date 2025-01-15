import javax.swing.JOptionPane;

public class lab506 {
	public static void main(String[] args) {
        String[] greetings = { "-Good Morning", "-Good Afternoon", "-Good Evening", "-Good Night" };
        String message = "";
        for (String seeing : greetings) {
            message += seeing + "\n";
        }

        JOptionPane.showMessageDialog(null, "The greeting words in English\n"+message);
    }
}
