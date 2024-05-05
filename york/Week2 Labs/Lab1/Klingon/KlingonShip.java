import java.util.Scanner;

/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class KlingonShip
{
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	
	//Put the displayKlingonDetails()and getDangerLeve() methods below.
	
	
	public void displayKlingonDetails() {
		System.out.println(photonPower);
		System.out.println(threatFactor);
		System.out.println(cosmicProximity);
		System.out.println("\n" + getDangerLeve());
	}
	
	public double getDangerLeve() {

	return (photonPower * threatFactor)/cosmicProximity;
	}

	 public void promptSettings()
   {
    /* Purpose: Demonstrate input techniques using Scanner
    */ 
      
      //Create a new scanner object to receive input from the keyboard
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter photonPower");
      photonPower = sc.nextInt();
    
      System.out.println("Enter starSpeed");
      threatFactor = sc.nextInt();
      
	   System.out.println("Enter cosmicProximity");
      cosmicProximity = sc.nextDouble();
        
   }
	
}
