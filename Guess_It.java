import java.util.*;

class Guess_It {
    public static void main(String[] args) {
        String rules;
        int guess;
        String difficulty;
        int diff = 10;
        int rand;

        System.out.println("\n\n-----WELCOME TO GUESS IT!-----\n\n");
        System.out.println("You can exit the game at anytime using ctrl+c\n");

        do {
            System.out.println("Would you like to see the rules \"yes\" or \"no\"?");
            Scanner scan = new Scanner(System.in);
            rules = scan.next();
        } while (!rules.equals("yes") && !rules.equals("no"));

        if (rules.equals("yes")) {
            System.out.println("- The Computer will generate a random number 1 - 100");
            System.out.println("- You have 10 chances to guess the number or you lose");
            System.out.println("(you can change your number of guesses by changing the difficulty)");
            System.out.println("- After each guess the computer will tell you if your guess");
            System.out.println("was too high or if your guess was too low");
            System.out.println("- Using this information you must find the random number");
            System.out.println("\npress enter to continue or type \"diff\" if you want to change the difficulty");
            try {
                Scanner scan = new Scanner(System.in);
                difficulty = scan.nextLine().charAt(0);
            } catch (Exception e) {
            } finally {
                if (difficulty.equals("diff")) {
                    System.out.print("New difficulty: ");
                    Scanner scan = new Scanner(System.in);
                    diff = scan.nextInt();
                }
            }
        }

        do {
            Random Rand = new Random();
            rand = Rand.nextInt(101);
        } while (rand == 0);

        do {
            System.out.print("Enter a number 1 - 100: ");
            Scanner scan = new Scanner(System.in);
            guess = scan.nextInt();
        } while (guess < 1 || guess > 100);

        // System.out.println("Would you like to play again \"yes\" or \"no\"?");
        // Scanner scan = new Scanner(System.in);
        // String playagain = scan.next();
        // // if (playagain.equals("yes")) {
        //
        // // }
    }
}
