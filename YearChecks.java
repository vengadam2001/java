import java.util.*;
class YearChecks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year for verification:");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println(year+" is a leap century year");
        }
        else if(year%100==0){
            System.out.println(year+" is a century year");
        }
        else if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is a normal year");
        }
    }
}