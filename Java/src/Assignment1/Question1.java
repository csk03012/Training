package Assignment1;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int x = input.nextInt();

        System.out.print("Enter second integer: ");
        int y = input.nextInt();

        if (x==y)
            System.out.println("These numbers are equal");
        else
            System.out.printf("%d is larger", x>y ? x : y);
    }
}
