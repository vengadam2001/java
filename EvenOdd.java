import java.util.*;
class EvenOdd{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int n=sc.nextInt();
       if(n%2==0){
           System.out.println(n+" is an even number");
       }
       else{
           System.out.println(n+" is an odd number");
       }
    }
}