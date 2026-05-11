public class Encapsulation {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        p1.setName("Rose"); //method to change name of plant
        System.out.println(p1.getName()); //official methood to check plant name
        System.out.println(p1.getData());
        p1.setAge(-500); //using setter method to change age
      //  p1.name = "Rose"; encapsulation
    }
}
