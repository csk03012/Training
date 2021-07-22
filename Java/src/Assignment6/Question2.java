package Assignment6;
import java.util.Scanner;
import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String s = input.nextLine();

        s = s.toLowerCase();

        char[] charArray = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for(char c: charArray){
            if(c >= 'a' && c <= 'z')
                stack.add(c);
        }

        for(char c: charArray){
            if(c >= 'a' && c <= 'z'){
                if(stack.peek() == c)
                    stack.pop();
                else
                    break;
            }
        }

        if(stack.empty())
            System.out.println("Output: String is Palindrome");
        else
            System.out.println("Output: String is not Palindrome");

    }

}
