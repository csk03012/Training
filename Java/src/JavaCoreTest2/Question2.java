package JavaCoreTest2;

import java.util.Scanner;
import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        for(int i=0; i<t; i++){
            String s = input.nextLine();
            int ans = 0;
            Stack<Character> s1 = new Stack<>();

            for(int j=0; j<s.length()-1; j++)
                s1.add(s.charAt(j));

            for(int j=s.length()-1; j>0; j++){
                if(s1.peek() == s.charAt(j)){
                    s1.pop();
                    ans += 1;
                }
                else{
                    System.out.println(ans);
                    break;
                }
            }
        }
    }
}
