package Assignment3;

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        for(int i=3; i<=19; i+=4){
            String s = "";
            s = "- ".repeat(i/2) + "-";
            s = " ".repeat((19-i)/2) + s + " ".repeat((19-i)/2);
            arr.add(s);
        }
        for(int i=3; i>=0; i--)
            arr.add(arr.get(i));
        System.out.println("Pattern: ");
        for(String s: arr)
            System.out.println(s);
    }


}
