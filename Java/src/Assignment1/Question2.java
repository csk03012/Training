package Assignment1;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer: ");

/*      int n = input.nextInt();
        String s = "";
        int x = n;

        s += (char) n%10;
        n = n/10;
        while (n > 0){
            s = (char) n%10 + " " + s;
            n = n/10;
        }
        System.out.println(s); */

        // it is better to input integer as string because
        // for given integer there will chances to go out of range.
        String s = input.nextLine();
        for(int i=0; i<s.length(); i++){
            char s1 = s.charAt(i);
            System.out.printf("%c ", s1);
        }
    }
}
