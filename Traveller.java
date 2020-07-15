//X is an explorer who likes to meet many ppl...below are the constraints in the way he talks to ppl...
//Stranger : Good Morning!
//Known Person : Good Morning! How are you?
//Beloved Person : Good Morning! You wont believe what happened today...I wrote Java Exam well...
//Implement X's state and behaviour in Java, use method overloading to differentiate his way of talking
import java.util.*;
class Traveller{
    String greeting(String x){
        return "Stranger";
    }
    
    String greeting(String x,String y){
        return "Known Person";
    }
    
    String greeting(String x,String y,String z){
        return "Beloved Person";
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Traveller t=new Traveller();
        String gm="Good Morning!";
        String hru="How are you?";
        String blv="You wont believe what happened today...";
        String jw="I wrote Java Exam well...";
        System.out.println("Choose any one option:");
        System.out.println("1."+gm);
        System.out.println("2."+gm+" "+hru);
        System.out.println("3."+gm+" "+blv+jw);
        int choice=sc.nextInt();
        String type="";
        switch(choice){
            case 1:
                type="Stranger";
                break;
            case 2:
                type="Known Person";
                break;
            case 3:
                type="Beloved Person";
                break;
            default:
                System.out.println("Invalid Choice!!");
        }
        if(type!="")
            System.out.println("The person met is "+type);
    }
}