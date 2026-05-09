// Class ka naam badal diya taake purani 'Person' class se conflict na ho
class Human {
    public String name;
    public int age;

    // Method to calculate retirement
    public int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method with String parameter
    public void speak(String text) {
        System.out.println(text);
    }

    // Method with int parameter
    public void jump(int height) {
        System.out.println("Jumping: " + height + " feet high!");
    }

    // Method with multiple parameters
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " meters towards " + direction);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

public class Basics {
    public static void main(String[] args) {
        // Ab 'Person' ki jagah 'Human' use hoga
        Human person1 = new Human();  
        person1.name = "Aliza";
        person1.age = 24; 
      
        System.out.println("Person 1 is " + person1.name + " and is " + person1.age + " years old.");

        int years = person1.calculateYearsToRetirement();
        System.out.println("Years left to retirement: " + years);

        int age = person1.getAge();
        System.out.println("Person 1 age is: " + age);

        person1.speak("Hello, I am " + person1.name);
        person1.jump(5);
        person1.move("north", 100.6);

        String greetings = "Good Afternoon!!";
        person1.speak(greetings);

        Human person2 = new Human();
        person2.name = "Sara";
        person2.age = 30;
       
        System.out.println("\nPerson 2 is " + person2.name + " and is " + person2.age + " years old.");
        person2.eat();
    }
}