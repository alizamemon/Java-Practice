import java.util.ArrayList;

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

        gadget.start();
        camera.start();
        camera.snap();

        //upcasting
        Gadget gadget2 = new Camera();
        gadget2.start(); // Calls the overridden method in Camera
       
        // Downcasting
        Camera camera2 = (Camera) gadget2; 
        camera2.snap(); // Now we can call the snap method, which is specific to Camera
    
    
    
        ArrayList<String> list= new ArrayList<String>();
        showList(list);
    }
    public static void showList(ArrayList<String> list){
        System.out.println("Showing list: " + list);

    
    }
}
