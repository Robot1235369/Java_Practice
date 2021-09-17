import java.util.*;

public class Guess_a_number {
    public static void main(String args[]) {
        int difficulty = 0;
        int guess;
        int win = 0;
        char playagain = 'y';

        System.out.println("Welcome to guess a number\n");

        do {
            System.out.print("Enter a difficulty: ");
            Scanner scan = new Scanner(System.in);
            difficulty = scan.nextInt();
        } while (difficulty == 0);

        do {
            Random random = new Random();
            int rand = random.nextInt(difficulty++);

            if (rand == 0) {
                continue;
            }
            System.out.println(rand);

            System.out.println("\nyou have 5 guesses");
            for (int guesses = 4; guesses != -1; guesses--) {
                System.out.print("guess a number 1 - your chosen diffuculty: ");
                Scanner scan = new Scanner(System.in);
                guess = scan.nextInt();
                if (guess == rand) {
                    win = 1;
                    break;
                }
                if (guesses != 0) {
                    System.out.print("You have ");
                    System.out.print(guesses);
                    if (guesses == 1) {
                        System.out.println(" guess left");
                    } else {
                        System.out.println(" guesses left");
                    }
                }
            }

            if (win == 1) {
                System.out.println("You got it!");
            } else {
                System.out.println("Your guesses ran out!");
            }

            do {
                Scanner scan = new Scanner(System.in);
                System.out.print("Do you want to play again? (y/n): ");
                playagain = scan.next().charAt(0);
            } while (playagain != 'y' && playagain != 'n');

        } while (playagain == 'y');
    }
}
