
package banksystem;


public class Account {
  int Acc_no;
  Double balance;
  int Acc_type;
    public Account(int Acc_no,int Acc_type) {
        this.Acc_no = Acc_no;
        this.Acc_type = Acc_type;
    }
    public void display(){
        System.out.println("Account Number "+Acc_no);
        System.out.println("Account_Balance "+balance);
        System.out.println("Account_type "+Acc_type);
    }
    
    
    public void Addmoney(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+"Pounds have been added");
            System.out.println("The new Balance is: "+balance);
            
        }
    }
        public void withdraw(double amount){
        if(amount>=balance){
            balance-=amount;
            System.out.println(amount+"Pounds have been withdrawn");
            System.out.println("The new Balance is: "+balance);
        }
        else
        {
            System.out.println("Sorry, insufficient Balance");
            System.out.println("The Cuurent Balance is: "+balance);
        }
        
    }
        double getbalance(){
            return balance;
        }
}
