package Assignment3;
import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to print all Ludic number less then or equal to input number (only natural numbers).");
        System.out.print("Input : n = ");
        int n = input.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=1; i<=n; i++)
            arr.add(i);
        int j=1;

        System.out.print("Output : 1");
        while(j<arr.size()){
            System.out.printf(", %d", arr.get(j));

            int number = arr.get(j);
            // k increment by number-1 because deletion of element shift next element to left by 1.
            for(int k=j+number; k<arr.size(); k+=(number-1))
                arr.remove(k);
            j+=1;
        }
        System.out.println();


    }
}
