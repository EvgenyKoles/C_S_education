import java.util.Scanner;

class Car
{
    String registration;
    String make;
    double price;
    
    //Methods to set car details below here
    
    //displayCarDetails()
    
    	 public void promptSettings()
   {
    /* Purpose: Demonstrate input techniques using Scanner
    */ 
      //Create a new scanner object to receive input from the keyboard
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter registration");
      registration = sc.nextLine();
    
      System.out.println("Enter make");
      make = sc.nextLine();
      
	   System.out.println("Enter price");
      price = sc.nextDouble();
        
   }
    
   public void displayCarDetails(){
    System.out.println(getRegistration());
    System.out.println(getMake());
    System.out.println(getPrice());


   }
    
    //Try out these 'getter' methods after you have set info.
    public String getRegistration()
    {
       return registration;
    }
    
    public String getMake()
    {
        return make;
    }

    public double getPrice()
    {
        return price;
    }
}


