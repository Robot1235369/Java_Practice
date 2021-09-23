import java.util.*;
import java.io.*;

class Quick_Guess_It {
    public static void main(String[] args) {
        String rules;
        int guess = 0;
        int guesses;
        int rand;
        String playagain;
        int score = 1000;
        int your_scores[] = {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};
        int your_score;
        int i = 0;
        int times = 0;
        int biggest = your_scores[0];

        try {
            File highscores = new File("Highscores.txt");
            highscores.createNewFile();
            Scanner reader = new Scanner(highscores);
            while (reader.hasNextLine()) {
                int data = reader.nextInt();
                score = data;
            }
        } catch (IOException e) {
            score = 5;
            your_score = 5;
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

        System.out.print("\n");

        do {
            times++;
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

            your_scores[i] = guesses;
            i++;

        } while (playagain.equals("yes") && times < 9);

        for (int j = 1; j < your_scores.length; j++) {
            if (biggest < your_scores[j]) {
                biggest = your_scores[j];
            }
        }
        if (biggest > score) {
            System.out.print("Your highscore was: ");
            System.out.println(biggest);
        } else if (biggest == score) {
            System.out.println("Congradulations you tied for first place!");
            System.out.print("You also got ");
            System.out.println(score);
        } else if (biggest < score) {
            score = biggest;
            System.out.println("Congradulations you broke the record!");
            System.out.print("The new highscore is ");
            System.out.println(score);
            try {
                FileWriter writer = new FileWriter("Highscores.txt");
                writer.write(score);
                writer.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }

    }
}
