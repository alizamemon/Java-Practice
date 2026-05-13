import java.util.ArrayList;
import java.util.HashMap;

class Box<T>{
    private T item;
    
    public void add(T item){
        this.item= item;
    }

    public T get(){
        return item;
    }
}

public class Generics {
    public static void main(String[] args) {
        //old style without generics
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        String fruit = (String) list.get(1); // Need to cast to String
        System.out.println(fruit);
   
        //with generics
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("dog");
        animalList.add("frog");
        animalList.add("cat");
        String animal = animalList.get(1); // No cast needed
        System.out.println(animal);

        //There can be more than one type argument
        HashMap<Integer, String> map= new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        String value = map.get(1); // No cast needed
        System.out.println(value);

        Box<String> stringBox = new Box<>();
        stringBox.add("Laptop");
        Box<Integer> intBox = new Box<>();
        intBox.add(123);
        //stringBox.add(123); // Compile-time error: incompatible types

        String boxedString = stringBox.get();
        Integer boxedInteger = intBox.get();

        System.out.println(boxedString);
        System.out.println(boxedInteger);

    }
}
