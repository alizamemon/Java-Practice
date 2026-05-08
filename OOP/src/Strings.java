class Frog{
    private int age;
    private String color;

    public Frog(int age, String color){
        this.age=age;
        this.color=color;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb. append(age).append(": ").append(color);
        return sb.toString();
    }
}

public class Strings {
    public static void main(String[] args) {
     
        //Strings are immutable in Java, which means once a string is created, it cannot be changed. Any operation that seems to modify a string actually creates a new string.
        //Method:1
        String msg = " ";
        //creating a new string not changing the existing string
        msg+= "Hello";
        msg+= " ";
        msg+= "I am a Computer Engineer";
        System.out.println(msg);

        //Method:2
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("I am a Computer Engineer");

        System.out.println(sb.toString());
   
       //Method:3
        StringBuilder a = new StringBuilder();
        a.append("Hello")
        .append(" ")
        .append("I am a Computer Engineer");

        System.out.println(a.toString());
    
        //Formatting Strings
        System.out.println(String.format("My name is %s and I am %d years old", "Alice", 30));
        
        for(int i=0; i<20; i++){
            System.out.println(String.format("%-3d: some text here", i));
        }

        Frog f1 = new Frog(2, "green");
        Frog f2 = new Frog(3, "brown");
        System.out.println(f1);
        System.out.println(f2);
    }
}
 