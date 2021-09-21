import java.io.*;
import java.util.*;

public class file {
    public static void main(String[] arg) {
        int scores[] = {0, 0, 0, 0, 0, 0, 0};
        int i = -1;
        String score = "";

        try {
            File highscores = new File("Highscores.txt");
            FileWriter writer = new FileWriter("Highscores.txt");
            // Scanner reader = new Scanner(highscores);
            // while (reader.hasNextLine()) {
            //     i++;
            //     int data = reader.nextInt();
            //     scores[i] = data;
            // }
        } catch (IOException e) {
            System.out.println(e);
        }

        for (int j = 0; j < scores.length; j++) {
            score += String.valueOf(scores[j]);
            writer.write(score);
        }

    }
}
