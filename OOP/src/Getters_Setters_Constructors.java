class Animal{
    private String name;
    private int age;
    
    //Setter method
    // public void setName(String name){
    //     //name=newName;
    //     this.name= name; //this keyword is used to refer to the current object instance
    // }

    //Constructor
    public Animal(String name, int age){
        this.name= name;
        this.age=age;
    }

    //getter method
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return age;
    }
}    

    public class Getters_Setters_Constructors {
    public static void main(String[] args) {
        Animal Lion= new Animal("Simba", 3);
        //Lion.name = "Simba";
       // Lion.age = 5;

        // Lion.setName("Simba");
        // Lion.setAge(3);

        System.out.println(Lion.getName());
        System.out.println(Lion.getAge());
    }
}
