import java.util.Scanner;

/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
    {
       kgWeight= weightIn;
    }
    
    public void setPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("���Health Profile��");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.println("Abusing Body = " + checkAbuser());
	 //  System.out.println(kgWeight +" " + cmHeight);
	   System.out.println("Body Mass Index table = " + getBMI());
	   
	}

	public void promptSettings()
   {
  
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter weight");
      setWeight(sc.nextDouble());
    
       System.out.println("Enter height");
      setHeight(sc.nextDouble());

      
	   System.out.println("Enter weeklyAlcholUnits");
      weeklyAlcholUnits = sc.nextInt();

	  System.out.println("Enter Pulse");
      setPulse(sc.nextInt());

        
   }

   public double  getBMI(){

	return (kgWeight/(cmHeight * cmHeight))*10000;

	
	
   }



   

	
	
}
