import java.io.*;
import java.util.*;

public class file {
    public static void main(String[] arg) {
        try {
            int score;
            int your_score;

            File highscores = new File("Highscores.txt");
            highscores.createNewFile();

            score = 5;

            FileWriter writer = new FileWriter("Highscores.txt");
            writer.write(score);
            score = 0;
            Scanner reader = new Scanner(highscores);

            while (reader.hasNextLine()) {
                int data = reader.nextInt();
                score = data;
            }

            System.out.print("score: ");
            System.out.println(score);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
