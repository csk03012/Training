package Assignment1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // checking if string s contains integers or not.
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m;

        System.out.print("Enter the 5-digit integer: ");
        String s = input.nextLine();
        m = p.matcher(s);


        while(s.length() != 5 || !(m.matches())){
            System.out.println("Error: Given number is not 5-digit number");
            System.out.print("Enter integer of 5-digit: ");
            s = input.nextLine();
            m = p.matcher(s);
        }

        if(s.charAt(0)==s.charAt(4) && s.charAt(1)==s.charAt(3))
            System.out.printf("Result: Integer %s is Palindrome", s);
        else
            System.out.printf("Result: Integer %s is not Palindrome", s);

    }
}
