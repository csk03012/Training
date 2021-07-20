package Assignment5.Question1;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Survey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String regex = "[0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m;

        try{
            String file = "/home/csk/Training/Java/src/Assignment5/Question1/numbers.txt";
            Formatter output = new Formatter(file);

            while(true){
                System.out.print("Enter the Integer between [0-9] or press [q] to end the response: ");
                String num = input.nextLine();
                m = p.matcher(num);

                if (num.equals("q")){
                    output.close();
                    break;
                }
                else if(!m.matches())
                    System.out.println("Error: above response not accepted: Only [0-9] integer allowed");
                else
                    output.format("%d%n", Integer.parseInt(num));
            }

            System.out.println("All responses received.");
        }
        catch (Exception error){
            System.out.println("Error: "+ error.getMessage());
        }


    }
}
