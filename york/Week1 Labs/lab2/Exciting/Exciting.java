/**
 * Write a description of class Exciting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exciting
{
    //Put your declarations for a) beneath here 
     double z ;
     
     int count = 0;
     double cost = 3.45;
     char choice = 'X';
     boolean goodChoice = true;
     short lowest = 5;
    //Put your declarations and initialisations to b) beneath here 

    double temperature = 25;
    int bonusBall = 2;
    long populationOfChina = 123448272;
    boolean isFinished = false;
    double interplanetaryDistances = 271264;
    char alevel  = 'A';
    
   public void doit()
   {
     double x = 3.0;
     double y = 4.0;
     z = 2.0 * y + x/4.0 - (x + y ) ;
   }    
   
   public void displayDetails() 
   {
	   System.out.print("z= ");
	   System.out.println (z);
	   
	   //display the details for the variables you declared in a)
	   
	   
	   //display the details for the variables you declared in b)

   }
     public void showVariables() {
      System.out.println("Room Temperature: " + temperature + "°C");
      System.out.println("Jackpot Bonus Ball Number: " + bonusBall);
      System.out.println("Population of China: " + populationOfChina);
      System.out.println("Is the game finished? " + (isFinished ? "Yes" : "No"));
      System.out.println("Interplanetary Distance: " + interplanetaryDistances + " km");
      System.out.println("A-Level Grade: " + alevel);

     }
	  
}