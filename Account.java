import java.util.*;
class Account{
    int bal;
    Account(){
        bal=1000;
    }
    
    void withdraw(int w){
        if(bal<w){
            System.out.println("Insufficient Funds!");
        }
        else{
            bal-=w;
            System.out.println("Rs."+w+" is withdrawn");
        }
    }
    
    void deposit(int d){
        bal+=d;
        System.out.println("Rs."+d+" is deposited");
    }
    
    void balance(){
        System.out.println("The balance is Rs."+bal);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Account acc=new Account();
        int choice=0;
        do{
            System.out.println("1.Withdraw\n2.Deposit\n3.Balance");
            System.out.print("Select an option:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the amount to withdraw:");
                    acc.withdraw(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit:");
                    acc.deposit(sc.nextInt());
                    break;
                case 3:
                    acc.balance();
                    break;
                default:
                    System.out.println("You have entered invalid option...Try Again!");    
            }
            System.out.print("Enter 0 to exit/any number to continue:");
            choice=sc.nextInt();
        }while(choice!=0);
        System.out.println("Thank You...");
    }
}