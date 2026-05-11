public class Casting {
    public static void main(String[] args) {
       byte byteValue= 100;
       short shortValue= 24;
       int intValue= 5000;  //small value capacity for int: -2 Billion se +2 Billion
       long longValue= 3000000000L; //big value
       double doubleValue= 32.14;  
       float floatValue= 8834.8f;
       double pi = 3.99; 
       long huge = 3000000000L;
       
       
       System.out.println(Byte.MAX_VALUE);
       
         //casting
         intValue= (int) longValue; //explicit casting bigvalue to small value
         System.out.println(intValue);

         doubleValue= intValue; //implicit casting
         System.out.println(doubleValue);
         
         int roundedPi = (int) pi; 
         System.out.println(roundedPi); 
         
         int small = (int) huge;
         System.out.println(small); 

         intValue= (int) floatValue;
         System.out.println(intValue);

         byteValue= (byte) 128; //128 is out of byte range, so it will wrap around to -128
         System.out.println(byteValue);
    }
}
