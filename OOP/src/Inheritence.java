public class Inheritence {
    public static void main(String[] args) {
       Machine m1 = new Machine();
       m1.start();
       m1.stop();
       
        Car c1= new Car();
        c1.start(); //method ovverriding
        c1.WipeWindShield();
        c1.stop();

      //System.out.println(c1);  //  class name+separator+hashcode Car@7344699f default toString() runned
        System.out.println(c1.model + c1.year);
        System.out.println(c1);  //  calls the overridden toString() method



    
    }
}
