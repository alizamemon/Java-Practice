import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        //Scanner object for string
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter a msg: ");
        String msg = input.nextLine();   
        System.out.println("You entered: " + msg);
    
         //Scanner object for integer
        Scanner num = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int value= input.nextInt();
        System.out.println("you entered: " + value);

    
    }
}
