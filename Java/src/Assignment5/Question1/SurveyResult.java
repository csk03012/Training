package Assignment5.Question1;
import java.io.FileInputStream;
import java.util.Formatter;
import java.util.Scanner;

public class SurveyResult {
    public static void main(String[] args) {
        try{
            String file = "/home/csk/Training/Java/src/Assignment5/Question1/numbers.txt";
            FileInputStream inputFile = new FileInputStream(file);
            Scanner input = new Scanner(inputFile);

            int[] arr = new int[10];
            while(input.hasNext()) {
                int num = input.nextInt();
                arr[num] += 1;
            }
            inputFile.close();

            String outputFile = "/home/csk/Training/Java/src/Assignment5/Question1/output.txt";
            Formatter output = new Formatter(outputFile);

            output.format("%6s%10s%n", "Number", "Frequency");
            for(int i=0; i<=9; i++)
                output.format("%-6d%-10d%n", i, arr[i]);

            output.close();
            System.out.println("Success");
        }
        catch (Exception error){
            System.out.println("Error " + error.getMessage());
        }

    }

}
