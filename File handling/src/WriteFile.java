import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        File file = new File("output.txt");

        try (FileWriter writer = new FileWriter(file)) {
            
            // 3. File mein likhne ka tareeqa
            writer.write("Hello Aliza!\n");
            writer.write("Writing to a file is easy in Java.\n");
            writer.write("I am learning File I/O today.");
            
            System.out.println("File written successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
