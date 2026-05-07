import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a command");
        String text = input.nextLine();

        switch(text){
            case "start":
                System.out.println("machine started");
            break;

            case "stop":
                System.out.println("machine stopped");
            break;
            
            default:
                System.out.println("command not recognized");
            }

    }
}
