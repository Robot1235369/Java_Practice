import java.util.*;
import java.io.*;

class write_file {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            file.createNewFile();

            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello World");
            writer.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
