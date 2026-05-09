public class Polymorphism {
    public static void main(String[] args) {
        Plant p1= new Plant();
        Tree t1 = new Tree();

        Plant p2= t1; //polymorphism
        p2.grow();

    }
}
