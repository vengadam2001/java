import java.util.*;
class ArrayReverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int rev[]=Arrays.copyOf(a,n);
        for(int i=0;i<(int)(n/2);i++){
            int temp=rev[i];
            rev[i]=rev[n-(i+1)];
            rev[n-(i+1)]=temp;
        }
        System.out.println("The original array:");
        System.out.println(Arrays.toString(a));
        System.out.println("The reversed array:");
        System.out.println(Arrays.toString(rev));
        if(Arrays.equals(a,rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}