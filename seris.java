import java.util.*;
import java.io.*;
import java.lang.Math.*;
class Solution{
    public static void main(String [] agrs){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String out="";
            int s=a+b;
            for (int j=0;j<n;j++)
            {
                out+=String.valueOf(s);
                out+=' ';
                s+=Math.pow(2,j+1)*b;
            }
            System.out.println(out);
            
        }
        in.close();
    }
}
