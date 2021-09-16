import java.util.*;

class RPS {
    public static void main(String args[]) {
        int playAgain = 1;
        int win = 0;
        char choice;
        char playagain;
        char computer = 'R';

        System.out.println("Welcome to Rock Paper Scissors!\n");

        do {
            Random random = new Random();
            int upper = 3;
            int rand = random.nextInt(upper);

            switch (rand) {
                case 0:
                    computer = 'R';
                    break;
                case 1:
                    computer = 'P';
                    break;
                case 2:
                    computer = 'S';
                    break;
                }

                do {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("R, P, or S: ");
                    choice = scanner.next().charAt(0);
                } while (choice != 'R' && choice != 'P' && choice != 'S');

                if (choice == 'R' && computer == 'P') {
                    win = 0;
                } else if (choice == 'R' && computer == 'S') {
                    win = 1;
                } else if (choice == 'P' && computer == 'R') {
                    win = 1;
                } else if (choice == 'P' && computer == 'S') {
                    win = 0;
                } else if (choice == 'S' && computer == 'R') {
                    win = 0;
                } else if (choice == 'S' && computer == 'P') {
                    win = 1;
                }

                System.out.print("\nYou chose ");
                System.out.println(choice);
                System.out.print("The computer chose ");
                System.out.println(computer);

                if (choice == computer) {
                    System.out.println("Tie!\n");
                } else {
                    switch (win) {
                        case 1:
                            System.out.println("You Won!\n");
                            break;
                        case 0:
                            System.out.println("You lost!\n");
                            break;
                    }
                }

                do {
                    System.out.print("Would you like to play again? (Y/n): ");
                    Scanner scanner = new Scanner(System.in);
                    playagain = scanner.next().charAt(0);
                } while (playagain != 'Y' && playagain != 'n');

                switch (playagain) {
                    case 'Y':
                        playAgain = 1;
                        break;
                    case 'n':
                        playAgain = 0;
                        break;
                }

        } while (playAgain == 1);

        System.out.println("Come again later!");
    }
}
