
package banksystem;

import java.util.Scanner;


public class BankSystem {
  
 
    
    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
Bank bank=new Bank("Bank Misr","Cairo",0.10);

while(true)
{
    System.out.println("\n\nChoose one of the following:\n");   
    System.out.println("1-Display Bank Information.");   
    System.out.println("2-Add Customer");   
    System.out.println("3-Display Customer Information.");   
    System.out.println("4-Add Money to customers Balance.");   
    System.out.println("5-Withdraw Money from customers Balance.");   
    System.out.println("6-Calculate Customers profits.");   
    System.out.println("7-Exit.");
    System.out.println("\nWrite your choice here");
    int num_case=input.nextInt();
    
    switch(num_case){
        case 1:{
            bank.display();
            break;
        }
            case 2:{
       System.out.println("Enter Customer Id");   
       int id=input.nextInt();
       System.out.println("Enter Customer Name");
       String name=input.next();
       System.out.println("Enter Customer Address");   
       String address=input.next();
       System.out.println("Enter Account Number");   
       int AccNo=input.nextInt();
       System.out.println("Enter Customer Account Type 1 or 2 or 3");   
       int acctype=input.nextInt();
       bank.addcustomer(id, name, address, AccNo, acctype);
            break;
            }  
        case 3:{
            System.out.println("Enter Customer id");
            int id=input.nextInt();
            bank.displayCustData(id);
            break;
        }
        
        case 4:{
             System.out.println("Enter Customer id");
               int id=input.nextInt();
               System.out.println("Enter the amount of money");
               double amount=input.nextDouble();
               bank.AddMoney(id, amount);
               break;
        }
        case 5:{
         System.out.println("Enter Customer id");
         int id=input.nextInt();   
         double amount=input.nextDouble();
          bank.withdraw(id, amount);
          break;
        }
        case 6:{
       System.out.println("Enter Customer id");
       int id=input.nextInt();     
     double profit=bank.getprofit(id);
    System.out.println("The profit for the Customer Whose ID is "+id+" is "+profit);
    break;
        }
        
        case 7:{
            System.out.println("OK,Good Bye and have a nice day.");
            System.exit(0);
        }
        }
}
    }
    
}
