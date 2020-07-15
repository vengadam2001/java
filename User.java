import java.util.*;
class User{
    String UID,name;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        User u=new User();
        System.out.println("Enter your name:");
        u.name=sc.nextLine();
        System.out.println("Enter your Unique ID:");
        u.UID=sc.nextLine();
        System.out.println("Name: "+u.name);
        System.out.println("UID: "+u.UID);
    }
}