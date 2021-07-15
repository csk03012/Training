import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringClass {
    public static void main(String[] args) {
        /*String s = "Hello ";
        s.concat("Sachin");//this line ignored as string is immutable.
        s = s.concat("Sachin ");
        System.out.println(s);
        s = s.concat("Tendulkar");
        System.out.println(s);*/

        // Array List
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("Hello");
        Collections.sort(arr);
        System.out.println(arr);



    }
}
