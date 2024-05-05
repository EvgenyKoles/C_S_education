import java.util.Scanner;

/**
   Class:   Pattern Class 
   Purpose: To demonstrate class methods that use loops
   Comments:
 */
import java.util.*;
public class Pattern
{

    public void displayPattern()
     { 
     /* Purpose:  Print a 'square' pattern using a character
        Receives: integer - dimension of the square, Char - character to print
        Returns:  void
     */ 
    	  //Create a new scanner object to receive input from the keyboard
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the character you want to display: ");
        char mychar = sc.next().charAt(0);
      
        System.out.println("Enter the size of the pattern you want to display ");
        int size = sc.nextInt();
     
       for(int row = 1;  row <= size ; row++ ) // Row loop fixed to size
       {
            for (int col = 1; col <= size ; col++) //Column loop fixed to size
            {
             //Print the character
              System.out.print(mychar);
            }
         //At the end of each row print a new line
         System.out.println();
       }     
     }//End of method
   
    public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
      int ichoice;
      do {
         System.out.println("Choice 1 - Enrol a new student");
         System.out.println("Choice 2 - Enter a student's mark");
         System.out.println("Choice 3 - Print out results");
         System.out.println("Choice 4 -- Calculate a student's final grade");
         System.out.println("Choice 5 - quit the program & save the data");
         ichoice = sc.nextInt();
         switch(ichoice) {
            case 1:
                      // put code for enrolling a new student here
                      System.out.println("Enrolling a new student");
                      // etc etc
               break;
            case 2:
               // put code for entering a students mark here
               System.out.println("Enter the students mark");
               // etc etc
               break;
            case 3:
               // put code for printing out results here
               System.out.println("Printing out results");
               // Etc etc
               break;
            case 4:
               // put code for calculating final grade here
               System.out.println("printing final grade");
               // etc etc
               break;
            default:
               if(ichoice != 5) System.out.println("Unknown option");
               // no need for a break
         } // End of the switch statement
      } while (ichoice != 5);
    }
 }
