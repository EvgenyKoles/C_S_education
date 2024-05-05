
/**
 * A class to hold the declarations and Expressions 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amazing
{
   //Put your data type declarations below. Here is an example
    int n = 4;
    float x = 2.5f;
    float y = -1.5f;
    int m = 18;
   float res1 = x + n * y - (x + n) * y;
   float res2 = m / n + m % n;
   float res3 = 5 * x - n / 5;

//Put the code for your calculations in this method.   
   void doCalculations()
   {
      System.out.println(res1);
      System.out.println(res2);
      System.out.print(res3);
     
   }//End of doCalculations
}
