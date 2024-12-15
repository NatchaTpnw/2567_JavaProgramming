import java.util.Scanner;

public class lab204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of X : ");
        int xValue = input.nextInt();
        System.out.print("Input value of Y : ");
        int yValue =input.nextInt();
        while (yValue <= xValue) {
            System.out.print("Input value of Y ,again : ");
         yValue =input.nextInt();
        }
        int sum = xValue;
        for(int i = xValue+1;i<=yValue;i++) {
            System.out.print(sum + " + "  + i + " = " + (sum+i));
            System.out.println();
            sum+=i;
        }
       input.close();

    }
}
