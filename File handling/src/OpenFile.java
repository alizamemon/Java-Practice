import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException; // Close ke liye zaroori hai

public class OpenFile {
    public static void main(String[] args) {
        openFile();
    }

    public static void openFile() {
        File file = new File("example.txt");
        
        try (FileReader fr = new FileReader(file)) {
            System.out.println("File opened successfully.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: 'example.txt' not found.");
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file.");
        }
    }
}