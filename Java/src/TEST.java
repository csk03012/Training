import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class TEST {
    public static void main(String[] args) throws IOException {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1); arr.add(2); arr.add(3);
//        for (Integer value : arr)
//            System.out.println(value);
//
//        List<Integer> arr1 = new ArrayList<>();
//        arr1.add(23); arr1.add(24); arr1.add(34);
//        for (Integer integer : arr1)
//            System.out.println(integer);
//
//        int[] arr2 = {1,2,3,4};
//        for (int j : arr2)
//            System.out.println(j);

//        String[] colors = {"black", "blue", "yellow"};
//        List<String> links = new ArrayList<>(Arrays.asList(colors));
//        for (String link : links) {
//            System.out.println(link);
//        }
//        links.addLast("red");
//        links.add("pink");
//        links.add(3, "green");
//        links.addFirst("cyan");
//        colors = links.toArray(new String[0]);
//        System.out.println("colors: ");
//        for (String color : colors)
//            System.out.println(color);
//
//        StringBuffer s = new StringBuffer("Hello");
//        s.insert(2, "kuch");
//        System.out.println(s);
//
//
//        String s1 = "x";
//        String s2 = "x";
//        System.out.println("s1 == s2 is:"+s1==s2);
//        String s3 = new String("x");
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
//
//        String s4 = "Sachin";
//        System.out.println(s4.hashCode());
//        s4 = s4.concat("Hello");
//        System.out.println(s4.hashCode());
//
//        StringBuffer s5 = new StringBuffer("Chandu");
//        System.out.println(Arrays.toString(s4.split("")));
//
//        InputStream file = new FileInputStream("/home/csk/Downloads/hello.txt");
//        int i = 0;
//        while((i = file.read()) != -1)
//            System.out.print((char) i);
//
//        file.close();

        List<Integer> arr = new ArrayList<>();
        arr.add(208);
        arr.add(306);
        arr.add(455);
        arr.add(924);
        arr.add(393);

        Comparator<Integer> com =  (o1, o2) -> {
            return (o1%10 > 02%10) ? 1: 0;
            };

        Collections.sort(arr, com);
        Collections.reverse(arr);

        arr.forEach(System.out::println);
//
//        System.out.println(arr);
//
//        Map<Integer, String> arr2 =  new HashMap<>();
//        arr2.put(1, "Hello");
//        arr2.put(2, "Helloo");
//
//        System.out.println(arr2);

//        List arr = new ArrayList();
//        arr.add(1);
//        arr.add("Hell0");
//        System.out.println(arr);

        Container<Double> x = new Container<>();
        x.values = 0.0;
        x.show();
        }



    }

class Container<T extends Number>{
    T values;
    public void show(){
        System.out.println(values.getClass());
    }
}