public class Interface {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.start();

        Person p1 = new Person("Alice");
        p1.greet();

        //method1
        Info info1= new Machine(); //polymorphism
        info1.displayInfo();

        Info info2= p1;
        info2.displayInfo();

        System.out.println();
        //method2 - Decoupling
        outputInfo(m1);
        outputInfo(p1);
   
    }

    private static void outputInfo(Info info) {
        info.displayInfo();
    }
}
