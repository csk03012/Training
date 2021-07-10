package Assignment1;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int j=0; j<3; j++){
            System.out.println("Employee " + j);
            System.out.print("Enter the hours worked: ");
            double hours = input.nextInt();
            System.out.print("Enter the hourly rate: ");
            double rate = input.nextInt();

            double ans = 0;
            if (hours <= 40)
                ans += hours * rate;

            if (hours > 40) {
                ans += 40 * rate;
                ans += (hours - 40) * (rate / 2);
            }

            System.out.printf("Employee gross pay: %.2f%n", ans);
            System.out.println();
        }
    }
}
