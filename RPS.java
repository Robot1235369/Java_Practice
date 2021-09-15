import java.util.*;

class Main {
   public static void main(String args[]) {
      Bool playAgain = true;
      System.out.println("Welcome to Rock Paper Scissors!\n");

      do {
         Random random = new Random();
         int upper = 3;
         int rand = random.nextInt(upper);

         Switch (rand) {
            case 0:
               char computer = "R"
               default;
            case 1:
               char computer = "P"
               default;
            case 2:
               default;
         }

         Scanner Choice = new Scanner(System.in);
         System.out.print("R, P, or S: ");
         char choice = Choice.next().charAt(0);

         
      } while (playAgain == true);

   }
}