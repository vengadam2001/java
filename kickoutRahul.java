import java.util.Scanner;

public class kickoutRahul extends Exception {
    public static void main(String agrs[])
    {
        try{
            Scanner i=new Scanner(System.in);
            System.out.println("enter your name ");
            String name=i.nextLine();
            if (name.equals("Rahul")) {
                throw new Exception();
            } 
            else{
                System.out.println("Welcome to my program "+name);
            }
        }
        catch( Exception e){
            System.out.println("please quit the program");
        }
    }
}