import java.util.*;
class ReverseOfNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(temp>0){
            int dig=temp%10;
            rev=rev*10+dig;
            temp/=10;
        }
        System.out.println("The reverse of "+n+" is "+rev);
    }
}