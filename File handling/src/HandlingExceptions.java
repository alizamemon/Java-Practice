import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class HandlingExceptions {
 public static void main(String[] args) {
    File f1= new File("test.txt");

    try{
    FileReader fr = new FileReader(f1);
    System.out.println("File successfully opened");
    } catch (FileNotFoundException e){
        e.printStackTrace();
        System.out.println("File not found: " + e.getMessage());
    }
    System.out.println("Finished handling exceptions");
 }   
}
