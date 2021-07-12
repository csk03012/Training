package Assignment2.Question2;
import java.util.Random;

public class GuessGame {
    public void startGame(){
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Random random = new Random();
        int target = random.nextInt(10);
        System.out.printf("Target number: %s%n%n", target);

        int guess1;
        int guess2;
        int guess3;

        int chance = 1;
        do {
            System.out.printf("Chance: %d%n", chance);
            guess1 = player1.guess();
            System.out.printf("Player1: %s%d%n", player1, guess1);

            guess2 = player2.guess();
            System.out.printf("Player2: %s%d%n", player2, guess2);

            guess3 = player3.guess();
            System.out.printf("Player3: %s%d%n", player3, guess3);

            chance ++;
            System.out.println();

        } while (target != guess1 && target != guess2 && target != guess3);

        if (guess1 == target)
            System.out.println("Player1 won.");
        if (guess2 == target)
            System.out.println("Player2 won.");
        if (guess3 == target)
            System.out.println("Player3 won.");

    }

}
