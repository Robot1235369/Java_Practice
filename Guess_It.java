import java.util.*;

class Guess_It {
    public static void main(String[] args) {
        String rules;
        int guess = 0;
        String difficulty = "0";
        int diff = 6;
        int rand;
        String playagain;

        System.out.println("\n\n-----WELCOME TO GUESS IT!-----\n\n");
        System.out.println("You can exit the game at anytime using ctrl+c\n");

        do {
            System.out.println("Would you like to see the rules \"yes\" or \"no\"?");
            Scanner scan = new Scanner(System.in);
            rules = scan.next();
        } while (!rules.equals("yes") && !rules.equals("no"));

        if (rules.equals("yes")) {
            System.out.println("- The Computer will generate a random number 1 - 100");
            System.out.print("- You have ");
            System.out.print(diff);
            System.out.println(" chances to guess the number or you lose");
            System.out.println("(you can change your number of guesses by changing the difficulty)");
            System.out.println("- After each guess the computer will tell you if your guess");
            System.out.println("was too high or if your guess was too low");
            System.out.println("- Using this information you must find the random number");
            System.out.println("\npress enter to continue or type \"diff\" if you want to change the difficulty");
            try {
                Scanner scan = new Scanner(System.in);
                difficulty = scan.nextLine();
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
            do {
                Random Rand = new Random();
                rand = Rand.nextInt(101);
            } while (rand == 0);

            for (int i = diff; i > 0; i--) {
                if (i == diff) {
                    System.out.print("\nYou have a total of ");
                    System.out.print(diff);
                    System.out.println(" guesses");
                } else {
                    System.out.print("You have ");
                    System.out.print(i);
                    if (i == 1) {
                        System.out.println(" guess left");
                    } else {
                        System.out.println(" guesses left");
                    }
                }

                do {
                    System.out.print("Enter a number 1 - 100: ");
                    Scanner scan = new Scanner(System.in);
                    guess = scan.nextInt();
                } while (guess < 1 || guess > 100);
            
                if (guess > rand) {
                    System.out.println("\nToo High");
                } else if (guess < rand) {
                    System.out.println("\nToo Low");
                } else if (guess == rand) {
                    break;
                }
            }

            if (guess == rand) {
                System.out.println("Congradulations, You Won!");
            } else {
                System.out.println("Oh No, Your guesses ran out");
                System.out.print("The random number was ");
                System.out.println(rand);
            }
        
            do {
                System.out.println("Would you like to play again \"yes\" or \"no\"?");
                Scanner scan = new Scanner(System.in);
                playagain = scan.next();
            } while (!playagain.equals("yes") && !playagain.equals("no"));

        } while (playagain.equals("yes"));
    }
}
