package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String s = input.nextLine();
        String[] t = s.split(" ");

        if (t.length == 0)
            System.out.printf("Output: %s%n", "");
        else if (t.length == 1)
            System.out.printf("Output: %s%n", t[0]);
        else if (t.length == 2)
            System.out.printf("Output: %s%n", t[t.length-1]+' '+t[0]);
        else {
            String t1 = String.join(" ", Arrays.copyOfRange(t, 1, t.length-1));

            StringBuilder  ans = new StringBuilder(t1);
            ans.reverse();

            String result = t[t.length-1] + ' '+ ans + ' ' + t[0];

            System.out.printf("Output: %s%n", result);
        }
    }


}
