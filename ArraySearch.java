import java.util.*;
class ArraySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to search:");
        int key=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println(key+" is found at position: "+(i+1));
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(key+" is not found");
        }
    }
}