import java.util.Scanner;
class NULL extends Exception{}
class empty extends Exception{}
public class EddyAPI {
 public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    try{
    System.out.println("enter the String"); 
    String b= a.nextLine();
    if (b.equals(null)){
        throw new NULL() ;
    }   
    else if (b.equals("")){
        throw new empty();
    }
    else{
        System.out.println("Length is: "+b.length());
    }
     }
     catch(NULL e){
        System.out.println("Null values are not processed by this API");
     }
     catch(empty e){
        System.out.println("Empty value is passed");
     }
     finally{
        System.out.println("Thank you");
     }
 }   
}