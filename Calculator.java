import java.util.*;
class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int n1=sc.nextInt();
        System.out.println("Enter the number 2:");
        int n2=sc.nextInt();
        char choice;
        System.out.println("Enter your choice:");
        System.out.println("+ Addition \n- Subtraction\n* Multiplication\n/ Quotient\n% Reminder");
        System.out.print("Choice:");
        choice=sc.next().charAt(0);
        int res=0;
        switch(choice){
            case '+':
                res=n1+n2;
                break;
            case '-':
                res=n1-n2;
                break;
            case '*':
                res=n1*n2;
                break;
            case '/':
                res=n1/n2;
                break;
            case '%':
                res=n1%n2;
                break;
            default:
                System.out.println("Invalid Operation!");
        }
        System.out.println("The result is "+res);
    }
}