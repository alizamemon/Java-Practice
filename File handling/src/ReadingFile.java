import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\aliza.memon\\JavaProjects\\example.txt";
    
        File textfile = new File(filePath);
    
        Scanner fileScanner = new Scanner(textfile);
        
        int value= fileScanner.nextInt();
        System.out.println("The value is: " + value); //after that it will print empty line because of nextInt() method, so we need to add one more nextLine() method to move the cursor to the next line
        fileScanner.nextLine(); // Move to the next line
        int count =2;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }
        
        fileScanner.close();

    }
}

