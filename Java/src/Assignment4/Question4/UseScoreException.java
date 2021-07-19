package Assignment4.Question4;
import java.util.Scanner;

public class UseScoreException {


// -----------------------------------------------------------------------
    public static void validate(int a) throws ScoreException {
        if(a < 0 || a > 100)
            throw new ScoreException("Not valid score");
        else{
            System.out.println("That is valid score");
            System.out.println("------------------------");
        }
    }

// ------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter the Test Score: ");

            try{
                String testScore = input.nextLine();
                int number = Integer.parseInt(testScore);
                validate(number);
            }
            catch (ScoreException error){
                System.out.printf("Error: %s%n", error.getMessage());
                System.out.println("The score must be >= 0 and <= 100!");
                System.out.println("-----------------------------------------");
            }
            catch (NumberFormatException error){
                System.out.printf("Error: %s%n", error.getMessage());
                System.out.println("You must enter a number for the score!");
                System.out.println("-----------------------------------------");
            }

            System.out.println("Do you want to enter another score?");
            System.out.print("Enter your message (Press any Key for YES, [No] for NO): ");
            String ans = input.nextLine();

            if (ans.equals("No"))
                break;
        }
    }
// ------------------------------------------------------------------------------------

}
