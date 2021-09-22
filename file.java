import java.io.*;
import java.util.*;

public class file {
    public static void main(String[] arg) {
        try {
            int scores[] = {0, 0, 0, 0, 0, 0, 0};
            int i = -1;
            String score = "";

            File highscores = new File("Highscores.txt");
            highscores.createNewFile();

            // Scanner reader = new Scanner(highscores);
                // while (reader.hasNextLine()) {
                //     i++;
                //     int data = reader.nextInt();
                //     scores[i] = data;
                // }

            for (int j = 0; j < scores.length; j++) {
                File highscores = new File("Highscores.txt");
                FileWriter writer = new FileWriter("Highscores.txt");
                score += String.valueOf(scores[j]); 
                writer.write(score);
                score = "";
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
