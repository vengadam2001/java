import java.util.Scanner;
class UserInput{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2=sc.nextInt();
        System.out.println("Enter the character:");
        char c=sc.next().charAt(0);
        System.out.println("Enter a fractional value:");
        double frac1=sc.nextDouble();
        sc.nextLine(); //This makes the nextLine() work after a nextDouble() or any other next__();
        System.out.println("Enter a string:");
        String str1=sc.nextLine();
        System.out.println();
        System.out.println("You have entered "+num1+" "+num2);
        System.out.println("You have entered: "+c);
        System.out.println("You have entered: "+frac1);
        System.out.println("You have entered: "+str1);
    }
}