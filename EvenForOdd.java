import java.util.*;
class EvenForOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper limit:");
        int ul=sc.nextInt();
        System.out.println("The even numbers:");
        for(int i=0;i<ul;i+=2)
            System.out.println(i);
        System.out.println("The odd numbers:");
        for(int i=1;i<ul;i+=2)
            System.out.println(i);
    }
}