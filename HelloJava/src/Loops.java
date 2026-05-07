import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
         int value = 5;

        //  While loop
         while(value < 10){
            System.out.println("Hi" +  " " + value);
            value +=1;
         }

        // For loops
        for(int i=0; i <= 10; i++){
            System.out.println("The value of i is: " + i);
           // System.out.printf("The value of i is: %d" , i);
            //System.out.printf("The value of i is: %d\n" , i);
        }

        //Do while loop

        /*  Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
         int val = input.nextInt();

         while(val!=5){
            System.out.println("Enter a number: ");
              val = input.nextInt();
         }
        System.out.println("Got 5!!"); 

        that was not an ideal method because we were repeating the same thing */

        Scanner input = new Scanner(System.in);
        int val=0;
        do{
            System.out.println("Enter a number: ");
            val = input.nextInt();
        }
        while(val!=5);{
            System.out.println("Got 5!!"); 
        }

    }
}
