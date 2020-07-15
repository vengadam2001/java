import java.util.*;
class EqualArrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Array1:
        System.out.println("Enter the size of array 1:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the elements:");
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        //Array2:
        System.out.println("Enter the size of array 2:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the elements:");
        for(int i=0;i<n2;i++)
            arr2[i]=sc.nextInt();
        //int arr1[]={1,2,3};
        //int arr2[]={1,2,3};
        if(Arrays.equals(arr1,arr2)){
            System.out.println("They are SAME");
        }
        else{
            System.out.println("They are NOT SAME");
        }
    }
}