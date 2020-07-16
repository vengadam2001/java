
//if an class contains one or more abstract method then the class is declared with abstract keyword
abstract class he{// object for an abstract class is not possible 
    abstract void run ();//abstract method dosent not have the definition (define) 
    void disp(){
        System.out.println("i ma abst class");
    }
}
public class AbstractClass  extends he{
void run(){   //abstract method should be declared (defined with the body) in the inherited class this is complsery  
    System.out.println("hey i am run method ");
}
    public static void main(String args[])
{
    AbstractClass a=new AbstractClass();
    a.run();
    a.disp();

}
}