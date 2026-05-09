public class Basics {
    public static void main(String[] args) {
        Person person1 = new Person();  //person1 is object
        person1.name = "Aliza";
        person1.age = 24; //age is public variable, we can access it directly
      
        System.out.println("Person 1 is " + person1.name + " and is " + person1.age + " years old.");
       // person1.speak();
        int years= person1.calculateYearsToRetirement();
        System.out.println("Years left to retirement: " + years);

        int age = person1.getAge();
        System.out.println("Person 1 age is: " + age);

        person1.speak("Hello, I am " + person1.name);
        
        person1.jump(5);

        person1.move("north", 100.6);

        String greetings= "Good Afternoon!!";
        person1.speak(greetings);



        Person person2 = new Person();
        person2.name = "Sara";
        person2.age= 30;
       
        System.out.println("\nPerson 2 is " + person2.name + " and is " + person2.age + " years old.");
        person2.eat();

    }
}
