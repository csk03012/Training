package Assignment1;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int positives=0;
        int negatives=0;
        int zeros=0;

        for(int i=0; i<5; i++){
            int n;
            System.out.print("Enter the integer: ");
            n = input.nextInt();
            if(n==0)
                zeros += 1;
            else
                if(n>0)
                    positives += 1;
                else
                    negatives += 1;
        }
        System.out.printf("Zeros: %d%nPositives: %d%nNegatives: %d%n", zeros, positives, negatives);

    }
}
