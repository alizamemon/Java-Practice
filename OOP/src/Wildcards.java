import java.util.*;

class Machines {
    public void start() {
        System.out.println("Machine started");
    }
}

class Robot extends Machines {
    @Override
    public void start() {
        System.out.println("Robot started");
    }
}

public class Wildcards {
    // 1- Unbound: evrey type of list 
    public static void printList(List<?> list) {
        for (Object obj : list) {           //object class
            System.out.println("Item: " + obj);
        }
    }

    // 2- Upper Bounded: hand;e the list tof machines and robots
    public static void StartMachine(List<? extends Machines> list) {
        for (Machines m : list) {
            m.start();
        }
    }

    // 3- Lower Bounded: add robot to the list of machines and robots
    public static void addRobot(List<? super Robot> list) {
        list.add(new Robot());
        System.out.println("Robot added to the list");
    }

    public static void main(String[] args) {
        List<Machines> machineList = new ArrayList<>();
        List<Robot> robotList = new ArrayList<>();

        // Unbound practice
        printList(Arrays.asList("Utopia", 2026, 3.14));

        // Upper bound practice
        machineList.add(new Machines());
        robotList.add(new Robot());
        StartMachine(machineList); // OK
        StartMachine(robotList);   // OK! Robot extends Machines

        // Lower bound practice
        addRobot(machineList); // OK! Machines is super of Robot
        addRobot(robotList);   // OK! Robot is super (equal) to itself
    }
}