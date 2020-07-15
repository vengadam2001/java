
import java.util.Scanner;
public class ram_response {
    public static void main(String agrs[]){
        Scanner input=new Scanner (System.in) ;
        String res=input.nextLine();
        switch (res){
            case "good morning":
            {
                response h=new response(1);
                break;
            }
            case "good morning how are you":
            {
                char a='1';
                response h=new response(a);
                break;
            }
            case "good morning yout wont believe happened today and then  i wrote a java exam well":
            {
                float a=1;
                response h = new response(a);
                break;
            }
            default:
            {
System.out.println("hey tell teh truth man he wont say like that..");
            }

        }
    }
}
class response
{
    response(int res)
    {
        System.out.println("stranger");
    }
    response(char res){
        System.out.println("known person");
    }
    response(float res){
        System.out.println("belowed one");
    }
}