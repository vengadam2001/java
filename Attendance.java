import java.util.*;
class Attendance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of classes held:");
        float total=sc.nextFloat();
        System.out.println("Enter the no.of classes attended:");
        float present=sc.nextFloat();
        float attendance=(present/total)*100;
        if(attendance>=75.0){
            System.out.println("The student is permitted");
        }
        else{
            System.out.println("The student is not permitted");
        }
    }
}