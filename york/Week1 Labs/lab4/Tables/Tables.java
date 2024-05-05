public class Tables  {
    

    public void generateTable()  
    {
      for(int row = 1;  row <= 12 ; row++ ) // Row loop fixed to size
      {
           for (int col = 1; col <= 12 ; col++) //Column loop fixed to size
           {
            //Print the character
             System.out.print(col*row+" ");
           }

        //At the end of each row print a new line
        System.out.println();
        
      }     
    }
    
    
}

