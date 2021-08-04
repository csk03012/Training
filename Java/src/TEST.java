import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TEST {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3);
        for (Integer value : arr)
            System.out.println(value);

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(23); arr1.add(24); arr1.add(34);
        for (Integer integer : arr1)
            System.out.println(integer);

        int[] arr2 = {1,2,3,4};
        for (int j : arr2)
            System.out.println(j);

        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
//        links.addLast("red");
//        links.add("pink");
//        links.add(3, "green");
//        links.addFirst("cyan");
        colors = links.toArray(new String[0]);
        System.out.println("colors: ");
        for (String color : colors)
            System.out.println(color);

        StringBuffer s = new StringBuffer("Hello");
        s.insert(2, "kuch");
        System.out.println(s);


        String s1 = "x";
        String s2 = "x";
        System.out.println("s1 == s2 is:"+s1==s2);
        String s3 = new String("x");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        String s4 = "Sachin";
        System.out.println(s4.hashCode());
        s4 = s4.concat("Hello");
        System.out.println(s4.hashCode());

        StringBuffer s5 = new StringBuffer("Chandu");
        System.out.println(Arrays.toString(s4.split("")));

        InputStream file = new FileInputStream("/home/csk/Downloads/hello.txt");
        int i = 0;
        while((i = file.read()) != -1)
            System.out.print((char) i);

        file.close();
        }


    }

