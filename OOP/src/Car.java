public class Car extends Machine{
    String model= "Civic";
    int year = 2026;
    
    @Override
    public void start(){
        super.start(); //call parent
        System.out.println("Car is starting...");
    }

    public void WipeWindShield(){
        System.out.println("Wiping the windshield...");
    }

    @Override
    public String toString() {
       return "This is a " + model + " model of year " + year;
    }
}

