class Employee{
  private final int id;
  private final String cnic;
  private String name;
  public static String companyName= "abc";
  public static int employeeCount=0;

  //Constructor
  public Employee(int id, String cnic, String name){
    this.id= id;
    this.cnic=cnic;
    this.name=name;
    employeeCount++;
  }

  public void displayInfo(){
    System.out.println("ID: " + id);
    System.out.println("Name " + name);
    System.out.println("CNIC: " + cnic);
    System.out.println("Company:" + companyName);
  }
}

public class Static_Final {
    public static void main(String[] args) {
    Employee E1= new Employee(11, "1234-09876-4", "Ali");
    Employee E2= new Employee(12, "6547-9876-0", "zee");
      
    E1.displayInfo();
    E2.displayInfo();

    //Testing 
 // cannot change this because of static   E1.id= 205; 
    Employee.companyName="xyz";
    System.out.println("updated company: " + E1.companyName);
    System.out.println("updated company: " + E2.companyName);
    
    }
}
