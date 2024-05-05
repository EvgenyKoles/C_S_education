import java.awt.JobAttributes;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Shopping {

 
//perform new shopping list 
    private ArrayList shopping;

    private String[] alternatives = {"List", "Add", "Show", "Exit"};
    public Shopping(){

        shopping = new ArrayList();

    }

    
    public void AddItem(String shopsIn){

        shopping.add(shopsIn);
    }

    
    public void numberOfItems(){

        System.out.println(shopping.size());
    }

    public void showItem(int i){

        if ((i < shopping.size()+1) && (i >0)){
            System.out.println(shopping.get(i-1));
        }else{

             System.out.println("not found the number of shops");
        }
    }

    public void listItems(){
        int index = 0;

        while (index<shopping.size()) {
            System.out.println(shopping.get(index));
            index++;

        }
        System.out.println("End of list");

    }

        public void runShop(){
            int option = getChoice();

            while (option !=3){ // list shops
                if (option == 0){
                    if (shopping.size()> 0) {
                         listItems();
                    }else{
                        System.out.println("Not found any shops");
                    }
                }else if(option ==1){ // add shops
                    String newShops = JOptionPane.showInputDialog(null, "Enter new shops", "New shops", JOptionPane.PLAIN_MESSAGE);
                    AddItem(newShops);
                }else if(option ==2){ // show item
                    if (shopping.size()>0){
                    String strNum = JOptionPane.showInputDialog(null, "Enter a shop number", "Show note", JOptionPane.PLAIN_MESSAGE);
                        int num = Integer.parseInt(strNum);
                        showItem(num);
                    }
                }else
                    JOptionPane.showMessageDialog(null, "No comprendo" + option);
                option = getChoice();

            }

        }


        public int getChoice(){

            int choice = JOptionPane.showOptionDialog(null, "Select from", "Shoping list", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alternatives, alternatives[0]);
       
            return choice; 
        }


    public static void main(String[] args) {

        Shopping s = new Shopping();
        s.runShop();
       

        // s.AddItem("null");
        // s.AddItem("dich");
        // s.AddItem("sisi");
        

        // s.showItem(4);

        // s.listItems();
        // s.numberOfItems();

      
    }


}
