public class Quarterly_Report {

   int[][] matrix = {
            {67, 65, 63, 18, 16},
            {63, 67, 63, 24,23},
            {78, 56, 65, 22,21},
            {78, 45, 71, 19,19},
            {104, 56, 73, 17, 20},
            {103, 72, 69, 16,19}
        };

    String[] departments = {"Electrical", "Kitchen", "Bathroom", "SoftFurnishing", "Accessories"};
    String[] month = {"April", "May", "June", "July", "August", "September"};
    int []sum = new int[departments.length*2];// array for the total sales 


    
    public void total_sales_for_each_department(){

        int arr = 0;
        int k =-1;
        for(int i = 0;  i < matrix[i].length ; i++ ) // Row loop fixed to size
        {
             for (int j = 0; j < matrix.length ; j++) //Column loop fixed to size
             {
                if (arr%3 == 0){
                    k++;
                }
                sum[k] = sum[k]+ matrix[j][i];
                arr++;
             }
        }     

        int j = 0;
        System.out.println("2nd Quarter totals: ");
        for (int i = 0; i < departments.length; i++){
            System.out.print(departments[i]);
              System.out.println(", " +"£"+ sum[j]+ ",000");
            j= j+2;
        }
        
            j = 1;
        System.out.println("\n3rd Quarter totals: ");
        for (int i = 0; i < departments.length; i++){
            System.out.print(departments[i]);
           
            System.out.println(", " +"£"+ sum[j]+ ",000"); 
            j= j+2;
        }


      }
    
    public void best_and_worst_department(){

        int arr = 0;
        int k =-1;
        for(int i = 0;  i < matrix[i].length ; i++ ) // Row loop fixed to size
        {
             for (int j = 0; j < matrix.length ; j++) //Column loop fixed to size
             {
                if (arr%3 == 0){
                    k++;
                }
                sum[k] = sum[k]+ matrix[j][i];
                arr++;
             }
        } 
        int min = sum[0];
        int max = sum[0];
        for (int i = 0; i < sum.length; i=i+2){
            
            if (max < sum[i]){
                max = sum[i];
            }
            if (min > sum[i]){
                min = sum[i];
            }  
        }
        int min1 = sum[0];
        int max1 = sum[0];
        for (int i = 1; i < sum.length; i=i+2){
            if (max1 < sum[i]){
                max1 = sum[i];
            }
            if (min1 > sum[i]){
                min1 = sum[i];
            }
        }

        for (int i = 0; i < sum.length; i++){
            if (sum[i] == max){
                System.out.print("2nd Quarter best: "+ departments[i]);
                       for(int l = 0;  l < 3 ; l ++ ){
                            System.out.print(", £"+ matrix[l][i] + ",000 ");
                    
                 } 
            }
            if (sum[i] == min){
             
                System.out.print("\n2nd Quarter worst: " + departments[i/2]);
                       for(int l = 0;  l < 3 ; l ++ ){
                            System.out.print(", £"+ matrix[l][i/2] + ",000 ");
                    
                 } 
            }
              if (sum[i] == max1){
                 
                System.out.print("\n3nd Quarter best: "+ departments[i/2]);
                       for(int l = 3;  l <= 5 ; l ++ ){
                            System.out.print(", £"+ matrix[l][i/2] + ",000 ");
                    
                 } 
            }
                if (sum[i] == min1){
              
                System.out.print("\n3nd Quarter worst: " + departments[i/2]);
                       for(int l = 3;  l <= 5 ; l ++ ){
                            System.out.print(", £"+ matrix[l][i/2] + ",000 ");
                    
                 } 
            }
        }
    }

    public void  most_effective_month (){

        int arr = 1;
        int max = 0 ;
        int m = 0;
        System.out.println("2nd Quarter: ");

        for(int i = 0;  i < matrix[i].length ; i++ ) // Row loop fixed to size
        {
             for (int j = 0; j < matrix.length ; j++) //Column loop fixed to size
             {
                if (j < 3){

                   if (max < matrix[j][i]){
                    max = matrix[j][i];
                    m = j;
                }
                    if (arr%3 == 0){
                    System.out.println(departments[(i)]+", "+ month[m]+ ", £"+ max+ ",000 ");
                    max = 0;
                    }    
                         arr++;    

                }   
             }
        } 

        System.out.println("\n3nd Quarter: ");
        for(int i = 0;  i < matrix[i].length ; i++ ) // Row loop fixed to size
        {
             for (int j = 0; j < matrix.length ; j++) //Column loop fixed to size
             {
                if (j >= 3){

                   if (max < matrix[j][i]){
                    max = matrix[j][i];
                    m = j;
                }
                    if (arr%3 == 0){
                    System.out.println(departments[(i)]+", "+ month[m]+ ", £"+ max+ ",000 ");
                    max = 0;
                    }    
                         arr++;    

                }   
             }
        } 
    }


    public void total_sales_for_each_quarter(){

       
        int sum1 = 0;
        int sum2 = 0;

        
        for(int i = 0;  i < matrix[i].length ; i++ ) // Row loop fixed to size
        {
             for (int j = 0; j < matrix.length ; j++) //Column loop fixed to size
             {
                if (j <3){
                    sum1 = sum1 + matrix[j][i];
                   
                }else{

                    sum2 = sum2 + matrix[j][i];
                }  

             }
        } 
        System.out.println("2nd Quarter: "+"£"+sum1+ ",000"+ ", the tax "+"£"+ sum1 * 0.17+ "0");
        System.out.println("3nd Quarter: "+"£"+sum2 + ",000"+ ", the tax "+"£"+ sum2 * 0.17+ "0");
    }


    public void average_sales() {
    int arr = 0;
        int k =-1;
        for(int i = 0;  i < matrix[i].length ; i++ ) // Row loop fixed to size
        {
             for (int j = 0; j < matrix.length ; j++) //Column loop fixed to size
             {
                if (arr%3 == 0){
                    k++;
                }
                sum[k] = sum[k]+ matrix[j][i];
                arr++;
             }
        }     

   
           int j = 1;
        System.out.println("3rd Quarter average: ");
        for (int i = 0; i < departments.length; i++){
            System.out.print(departments[i]);
           
            System.out.println(", " +"£"+ sum[j]/3+ ",000"+ ", target for the new month "+ "£"+(int)(+sum[j]/3 + (sum[j]*0.12))+",000"); 
            j= j+2;
        }

    }

    public static void main(String[] args) {


    Quarterly_Report f = new Quarterly_Report();

    f.most_effective_month();
     //f.total_sales_for_each_department();
    //f.best_and_worst_department();  
    // f.total_sales_for_each_quarter();
     //f.average_sales();



    }


}