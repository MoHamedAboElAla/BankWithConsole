
package banksystem;


public class Bank {
    String Bank_Name,address;
    Double rate;
    Customer []customers=new Customer[1000];
   static int customer_no=0;

    public Bank(String Bank_Name, String address, Double rate) {
        this.Bank_Name = Bank_Name;
        this.address = address;
        this.rate = rate;
    }
   public void display(){
       System.out.println("\n\nBank Name:"+Bank_Name);
       System.out.println("Bank Address:"+address);
       System.out.println("Bank Rate:"+rate);
       System.out.println("Bank Customers:"+customer_no+"\n");
       
   }
   
   
   public void addcustomer(int cust_id,String cust_Name ,String cust_address,int Acc_no,int Acc_type){
       
       if(customer_no<1000){
           Account newAcc=new Account(Acc_no, Acc_type);
           Customer newcust=new Customer(cust_id, cust_Name, cust_address, newAcc);
           customers[customer_no]=newcust;
           customer_no++;
       }
   }
   public void displayCustData(int id){
       for(int i=0;i<customer_no;i++){
           if(id==customers[i].ID){
               customers[i].display();       
           }
       }
       }
      public void AddMoney(int id,double amount){
       for(int i=0;i<customer_no;i++){
           if(id==customers[i].ID){
               customers[i].getaccount().Addmoney(amount);      
           }
           
       } 
   }
      public void withdraw(int id,double amount){
       for(int i=0;i<customer_no;i++){
           if(id==customers[i].ID){
               customers[i].getaccount().withdraw(amount);
               
           }
           
       } 
   }
   double getprofit(int id){
       double profit=0;
     for(int i=0;i<customer_no;i++){
         if(id==customers[i].ID){
             profit=customers[i].Acc.balance*rate;
    
         }
         
     }      
       return profit;
   }    
}
