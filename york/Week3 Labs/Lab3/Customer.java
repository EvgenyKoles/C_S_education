public class Customer {

private String name;
private int cusID; 

public Customer(String name,int cusID){
    this.cusID = cusID;
    this.name = name;
}

public String getName(){
    return name;
}

public int getcusID(){
    return cusID;
}

public void display(){
    System.out.print("Customer name: "+ name + ", customer ID: " + cusID);
}

    public static void main(String[] args) {

        


        Customer c1 = new Customer("John", 123);
        c1.display();
        
        
    }


}