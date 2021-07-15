package Assignment1;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer greater than zero: ");
        int n = input.nextInt();
        while(n <= 0){
            System.out.println("Error: Integer should be greater than zero");
            System.out.print("Enter the Integer greater than zero: ");
            n = input.nextInt();
        }
        /*if(n==1)
            System.out.println('*');
        else{
            StringClass s1 = "*".repeat(n);
            StringClass s2 = "*" + " ".repeat(n-2) + "*";

            System.out.println(s1);
            for(int i=0; i<n-2; i++){
                System.out.println(s2);
            }
            System.out.println(s1);*/

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");}
            System.out.println();
            }
        }
    }

