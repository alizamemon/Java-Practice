public class Machine implements Info{
    private int id=3;

    void start(){
        System.out.println("Machine is starting...");
    }
    void stop(){
        System.out.println("Machine is stopping...");
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Machine ID: " + id);
    }
}
