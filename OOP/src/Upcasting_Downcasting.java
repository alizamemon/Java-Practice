class Gadget{ 
    public void start(){
        System.out.println("Gadget is starting...");
    }
}

class Camera extends Gadget{
    @Override
    public void start(){
        System.out.println("Gadget is starting...");
    }

    public void snap(){
        System.out.println("Camera is snapping a photo...");
    }
}
public class Upcasting_Downcasting {
    public static void main(String[] args) {
        // Upcasting
        Gadget gadget = new Gadget(); // Upcasting: Camera is treated as a Gadget
        Camera camera= new Camera();
    }
}
