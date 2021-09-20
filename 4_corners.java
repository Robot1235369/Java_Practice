import java.util.*;

public class MyClass {
    public static void main(String args[]) {

        System.out.println("Welcome to 4 Corners")
        Boolean running = true;

        while (running) {
            Boolean alive = true;

            while (alive) {
                List<String> walls = new ArrayList<String>(4);
                walls.add("1");
                walls.add("2");
                walls.add("3");
                walls.add("4");

                Random wall = new Random();
                String wall = wall.nextInt(5);

                String guess;

                do {
                    System.out.println("Choose a wall")
                    Scanner sc = new Scanner(System.in);
                    guess = sc.nextLine();
                } while (walls.contains(guess));

                String wall = String.valueOf(wall);

                if (guess.equals(wall)) {
                    System.out.println("Oh No! the computer picked your corner");
                    alive = false;
                } else {
                    System.out.println("You are safe. the computer picked corner " + wall);
                    
                }

            }

        }

    }

}
