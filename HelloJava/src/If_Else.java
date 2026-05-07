public class If_Else {
    public static void main(String[] args) {

        if(4==5){
            System.out.println("Yes!!");
        }
        else{
            System.out.println("No!");
        }
        
        int myNum = 13;
        
        if(myNum < 10){
            System.out.println("Yes its True");
        }
        else if(myNum > 20){
            System.out.println("No its False");
        }
        else{
            System.out.println(myNum + " is Somewhere in between");
        }

        int loop = 0;

        while(true){
            System.out.println("looping: " + loop);

            if(loop == 10){
                break;
            }

            loop++;
            System.out.println("Running while loop");
        }
    }
}
