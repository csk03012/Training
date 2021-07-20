package Assignment5.Question2;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String regex = "[2-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m;


        // pattern given
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ABC");
        arr.add("DEF");
        arr.add("GHI");
        arr.add("JKL");
        arr.add("MNO");
        arr.add("PRS");
        arr.add("TUV");
        arr.add("WXY");


        while (true) {
            System.out.print("Enter 4-digit number [Do not use 0 or 1]: ");
            String num = input.nextLine();
            m = p.matcher(num);

            int num1 = Character.getNumericValue(num.charAt(0));
            int num2 = Character.getNumericValue(num.charAt(1));
            int num3 = Character.getNumericValue(num.charAt(2));
            int num4 = Character.getNumericValue(num.charAt(3));

            try {
                if (m.matches() && num.length() == 4) {
                    String[] c1 = arr.get(num1 - 2).split("");
                    String[] c2 = arr.get(num2 - 2).split("");
                    String[] c3 = arr.get(num3 - 2).split("");
                    String[] c4 = arr.get(num4 - 2).split("");

                    String file = "/home/csk/Training/Java/src/Assignment5/Question2/Question2.txt";
                    PrintStream output = new PrintStream(file);
                    output.println("Word combination of number: " + num);

                    for (String a : c1) {
                        for (String b : c2) {
                            for (String c : c3) {
                                for (String d : c4) {
                                    output.println(a+b+c+d);
                                }
                            }
                        }
                    }
                    System.out.println("Success");
                    break;
                }
                else {
                    System.out.println("Input 4-digit number using integer [2 to 9]");
                    System.out.println("Try one more time.");
                    System.out.println("---------------------------------------------");
                }
            }
            catch (Exception error) {
                System.out.println(error.getMessage());
            }

        }
    }
}
