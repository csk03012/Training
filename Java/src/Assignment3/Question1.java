package Assignment3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input any string");
        System.out.print("Input: ");
        String s = input.nextLine();
        String ans= "";

        for(int i=0; i<s.length(); i++){
            ans = ans.concat(Integer.toHexString((int) s.charAt(i)));
        }

        System.out.print("Output: ");
        System.out.println(ans);
    }
}
