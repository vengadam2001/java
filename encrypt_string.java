
import java.util.Scanner;
import java.util.Arrays;

public class encrypt_string {
   public static void main(String agrs[]){
       Scanner input=new Scanner (System.in);
       String str="hello";
       StringBuffer str1=new StringBuffer();
       int z;
       for (int i=0;i<str.length();i++){
           z=str.charAt(i);
           z+=1;
           if (z>256){
               z%=256;
           }
           str1.append((char)z);
       }
       String temp="";
       for (int i=str.length()-1;i>=0;i--){
            temp =temp+str1.charAt(i);
       }
       System.out.println(temp);
   }

}