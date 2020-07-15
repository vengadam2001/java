import java.util.*;
class SD_Array{
    Scanner sc;
    int a[],n;
    SD_Array(){
        sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }
    public static void main(String args[]){
        SD_Array sda=new SD_Array();
        sd.search();
        sd.sort();
        sd.reverse();
        sd.sum();
        
    }
}