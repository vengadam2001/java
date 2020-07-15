import java.util.*;
class ArrayCopy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int o_n=sc.nextInt();
        int original[]=new int[o_n];
        System.out.println("Enter the elements:");
        for(int i=0;i<o_n;i++)
            original[i]=sc.nextInt();
        System.out.println("Enter the number of elements in the duplicate array:");
        int d_n=sc.nextInt();
        int duplicate[]=new int[d_n];
        duplicate=Arrays.copyOf(original,d_n);
        System.out.println("The original array:");
        System.out.println(Arrays.toString(original));
        System.out.println("The duplicate array:");
        System.out.println(Arrays.toString(duplicate));
    }
}