
/**
 * Write a description of class Lotto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lotto
{
	
	//Put the luckyDip() method here
	
	public void luckyDip() {

		for(int row = 1;  row <= 6 ; row++ ) {
			System.out.println("Ball " +row+" = "+ (int)(Math.random()*49)+1);

		}
	}




        //Test
	public static void main (String args[]) {
		
		Lotto l=new Lotto();
		l.luckyDip();
	}

	
}
