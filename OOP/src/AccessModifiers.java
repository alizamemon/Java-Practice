class Employee{
    public String name ="Aliza";
    protected String department= "Computer Engineering";
    private int salary=50000;

    public void showSalary(){
        System.out.println("Salary (private): " + salary);
    }
}
class Engineer extends Employee{
    public void displayDetails(){
        System.out.println("Name:  (public)" + name);
        System.out.println("Department (protected)" + department);
        //System.out.println("Salary: " + salary); // Error: salary has private access in Employee
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Employee Emp= new Employee();
        Engineer Eng= new Engineer();

        System.out.println(Emp.name);
        Emp.showSalary();
        Eng.displayDetails();

    //System.out.println(Emp.salary); //private 
    System.out.println(Emp.department); 


        
}
}