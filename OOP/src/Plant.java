public class Plant {
    public static final int ID = 7;
    private String name;
    private int age;
    
    
    public String getName(){   //Read-only
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getData(){ 
        String data = "some stuff" + calculateGrowth(); //abstraction
        return data;
    }

    public int calculateGrowth(){
        return 10;
    }

    public void grow(){
        System.out.println("The plant is growing.");
    }

    public void setAge(int age){
        if(age >=0){
            this.age= age;
        } else{
                System.out.println("Age cannot be negative.");
            }
        }
    }
