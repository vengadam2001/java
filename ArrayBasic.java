import java.util.*;
class ArrayBasic{
    public static void main(String args[]){
        /*//SDA
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)  //for(int i:a)
        arr1[i]=sc.nextInt();}
        System.out.println("You have entered the array:");
        for(int i=0;i<size;i++)
        System.out.print(arr1[i]+"\t");*/

        /*//DDA
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n=sc.nextInt();
        int arr2[][]=new int[m][n];
        System.out.println("Enter the elements:");
        for(int i=0;i<m;i++)    //for(int i[]:a]
        for(int j=0;j<n;j++)    //for(int j:i)
        arr2[i][j]=sc.nextInt();        
        System.out.println("You have entered the array:");
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++)
        System.out.print(arr2[i][j]+"\t");
        System.out.println();*/

        //Jagged Array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        int ja[][]=new int[r][];
        for(int i=0;i<r;i++){
            System.out.println("Enter the number of elements in row "+(i+1));
            int c=sc.nextInt();
            ja[i]=new int[c];
            System.out.println("Enter "+c+" elements:");
            for(int j=0;j<c;j++){
                ja[i][j]=sc.nextInt();
            }
        }
        //Printing the array:
        System.out.println("The array you have entered:");
        for(int i=0;i<r;i++){
            int c=ja[i].length;
            for(int j=0;j<c;j++){
                System.out.print(ja[i][j]+"\t");
            }
            System.out.println();
        }
    }
}