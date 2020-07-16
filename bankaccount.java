
import java.util.Scanner;

class account {
    account before = null;
    String name;
    int age;
    double amt = 0, accid = 0;
    double withdrawlimit = 1000;

    String deposit(double amt) {
        if (amt < 0) {
            return ("you cannot enter -ve no");
        } else {
            this.amt += amt;
            return ("current Balance is :" + this.amt);
        }
    }

    String withdraw(double amt) {
        if (amt < 0) {
            return ("you cannot enter -ve no");
        } else if (this.amt < amt) {
            return ("no sufficient balance");
        } else {
            this.amt -= amt;
            return ("current Balance is :" + this.amt);
        }
    }

}

public class bankaccount {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        account first = null;
        account curuser = null;
        account temp = new account();
        while (input.next().charAt(0) != '!') {
            System.out.println("enter a to create an account \n enter b to deposit \n enter c to withdraw");
            switch (input.next().charAt(0)) {
                case 'a': {
                    if (first == null) {
                        first = new account();
                        System.out.println("enter your name");
                        first.name = input.nextLine();
                        first.accid = 1;
                        System.out.println("enter your age");
                        first.age = input.nextInt();
                        curuser = first;
                    } else {
                        temp = new account();
                        System.out.println("enter your name");
                        temp.name = input.nextLine();
                        temp.accid = first.accid + 1;
                        temp.age = input.nextInt();
                        first.before = temp;
                        temp = null;
                        System.gc();
                    }
                    break;
                }
                case 'b': {
                    System.out.println(curuser.deposit(input.nextDouble()));
                    break;
                }
                case 'c': {
                    System.out.println(curuser.withdraw(input.nextDouble()));
                    break;
                }
                case 'd': {
                    System.out.println("enter youu account no");
                    curuser = search(first, input.nextDouble());


                    break;
                }
                default: {
                    System.out.println("enter the correct option");
                }
            }

        }
        System.gc();
    }

    static account search(account first, double id) {
        var temp = first;
        while (temp != null) {
            if (temp.accid == id) return (temp);
            temp = temp.before;
        }
        return (temp);
    }
}