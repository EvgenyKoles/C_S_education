
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
	int weeklyAlcoholUnits = 50; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;

	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcoholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("���Health Profile��");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.println("Abusing Body = " + checkAbuser());
	   
	}

	public void curseAndSwear() {
		int random = (int)(Math.random()*5)+1;

		switch (random)  // Controlling expression
 {          
                    case 1:     // case label
                     System.out.println("Oh damn!! What a nuisance");
                     break;
           case 2:
                     System.out.println("Dich");
                     break;
           case 3:
                    System.out.println("sisi");
                    break;
          //etc etc, up to case 12
           case 4:
                    System.out.println("HZ");
                    break;
           default:
                   System.out.println("five and more");
}


	}
	//Put curseAndSwear method here
	
	
}
