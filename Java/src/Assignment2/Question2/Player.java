package Assignment2.Question2;
import java.util.Random;


public class Player {
    public int guess(){
        Random random = new Random();
        return random.nextInt(10);
    }

    public String toString(){
        return "guessed number = ";
    }
}
