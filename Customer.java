
package banksystem;


public class Customer {
    int ID;
    String name,address;
    Account Acc;

    public Customer(int ID, String name, String address, Account Acc) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.Acc = Acc;
    }
    
    public void display(){
      System.out.println("Customer id"+ID);
      System.out.println("Customer name"+name);
      System.out.println("Customer address"+address);
      Acc.display();
      
    }
    Account getaccount(){
        return Acc;
    }
}
