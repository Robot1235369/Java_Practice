import java.util.*;
import java.io.*;

class Quick_Guess_It {
    public static void main(String[] args) {
        String rules;
        int guess = 0;
        int guesses;
        int rand;
        String playagain;
        int scores[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int your_scores[] = {0, 0, 0, 0, 0, 0, 0, 0};
        int i = -1;
        int j = 0;
        String score;

        scores[0] = 5;
        your_scores[0] = 5;

        try {
            File highscores = new File("Highscores.txt");
            highscores.createNewFile();
            FileWriter writer = new FileWriter("Highscores.txt");
            Scanner reader = new Scanner(highscores);
            while (reader.hasNextLine()) {
                i++;
                int data = reader.nextInt();
                scores[i] = data;
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("\n\n-----WELCOME TO GUESS IT!-----\n\n");

        do {
            System.out.println("Would you like to see the rules \"yes\" or \"no\"?");
            Scanner scan = new Scanner(System.in);
            rules = scan.next();
        } while (!rules.equals("yes") && !rules.equals("no"));

        if (rules.equals("yes")) {
            System.out.println("- The Computer will generate a random number 1 - 1000");
            System.out.println("- You have an unlimited number of guesses");
            System.out.println("- After each guess the computer will tell you if your guess");
            System.out.println("was too high or if your guess was too low");
            System.out.println("- Using this information you must find the random number in as");
            System.out.println("little guesses as possible");
            System.out.println("\npress enter to continue");

            Scanner scan = new Scanner(System.in);
            scan.nextLine();
        }

        do {
            do {
                Random Rand = new Random();
                rand = Rand.nextInt(1001);
            } while (rand == 0);

            guesses = 0;

            while (guess != rand) {
                System.out.print("Guess count: ");
                System.out.println(guesses);

                do {
                    System.out.print("Enter a number 1 - 1000: ");
                    Scanner scan = new Scanner(System.in);
                    guess = scan.nextInt();
                } while (guess < 1 || guess > 1000);

                if (guess > rand) {
                    System.out.println("\nToo High");
                } else if (guess < rand) {
                    System.out.println("\nToo Low");
                } else if (guess == rand) {
                    break;
                }

                guesses++;
            }

            System.out.print("Congradulations, You found the random number in ");
            System.out.print(guesses);
            System.out.println(" guesses!");

            do {
                System.out.println("Would you like to play again \"yes\" or \"no\"?");
                Scanner scan = new Scanner(System.in);
                playagain = scan.next();
            } while (!playagain.equals("yes") && !playagain.equals("no"));

            scores[i] = guesses;
            i++;

        } while (playagain.equals("yes"));

        System.out.print("Your highscore was: ");
        System.out.println();
    }
}