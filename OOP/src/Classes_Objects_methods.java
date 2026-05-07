class Person{
    String name;
    int age;

    //methods
    void eat(){
        System.out.println(name + " is eating");
    }

    void speak(){
        System.out.println(name + " is speaking");
    }
}

public class Classes_Objects_methods {
    public static void main(String[] args) {
        Person person1 = new Person();  //person1 is object
        person1.name = "Aliza";
        person1.age = 24;
      
        System.out.println("Person 1 is " + person1.name + " and is " + person1.age + " years old.");
        person1.speak();
 
        Person person2 = new Person();
        person2.name = "Sara";
        person2.age= 30;
       
        System.out.println("Person 2 is " + person2.name + " and is " + person2.age + " years old.");
        person2.eat();
    }
}
