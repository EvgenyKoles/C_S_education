
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	double cmHeight = 140 ;
	double kgWeight = 119;
	boolean smoker = true;
	int weeklyAlcholUnits = 50;
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 260;

	
	public void checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   System.out.print("Healthy pulse = ");
	   System.out.println(healthyPulse);
	}
	
	public void checkForAbuse()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      System.out.print("Checking for abuse -- ");
	      System.out.println(abuser);
	
	}

	public void checkDesirability(){
		boolean desirable = ((cmHeight < 150) && (kgWeight > 100));
		System.out.println(desirable);
	}
	
	public void displayDetails()
	{
	   
	}
	
}
