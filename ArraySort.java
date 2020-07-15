import java.util.*;
class ArraySort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //Bubble Sort
        for(int i=0;i<n;i++){
            for(int j=0;j<n-(i+1);j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        //Arrays.sort(a); //quick sort
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        //System.out.println(Arrays.toString(a)); //to print as [a,b,c]
    }
}