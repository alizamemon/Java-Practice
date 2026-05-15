import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        
        File file = new File("example.txt");

        try {
            Scanner scanner = new Scanner(file);
            
            // Math error risk (ArithmeticException)
            int result = 100 / 0; 
            
            System.out.println("Result: " + result);
            scanner.close();

        } catch (FileNotFoundException e) {        
            System.out.println("Error: File not found.");
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by 0.");
            
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
