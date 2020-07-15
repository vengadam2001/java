import java.util.*;
class SumOfDigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
            int dig=temp%10;
            sum+=dig;
            temp/=10;
        }
        System.out.println("The sum of digits of "+n+" is "+sum);
    }
}