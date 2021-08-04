package JavaCoreTest1;

import java.io.FileInputStream;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        try{
            String file = "/home/csk/input.txt";
            FileInputStream inputFile = new FileInputStream(file);
            Scanner input = new Scanner(inputFile);

            Set<Character> arr = new HashSet<>();
            while(input.hasNext()) {
                String s = (String) input.nextLine();
                char[] c = s.toCharArray();
                for (int i=0; i<s.length(); i++){
                    arr.add(c[i]);
                }

            }
            inputFile.close();

            String outputFile = "/home/csk/output.txt";
            Formatter output = new Formatter(outputFile);


            output.format("%s%n", arr);

            output.close();
            System.out.println("Success");
        }
        catch (Exception error){
            System.out.println("Error " + error.getMessage());
        }
    }
}
