
// if we use "final class classname" then we cannot use it to extend it to another class  ie if class a if final then Class A cannot be inherited to another class 
// final methods cannot be over ridden 
//final variable cannot be changed 
final class A{
    void run(){
        System.out.println("i am final");
    }
}
class B{
    final void run(){
        System.out.println("i am final");
    }   
}

//public class Final extends A {   //this line will give error 
public class Final extends B{
    // void run(){                          // this function wil give error as the class b has a final method with the same name (run) 
    //     System.out.println("i am final");
    // }
    void run1(){
        System.out.println("i am not final");
    }
    public static void main(){
        final int a=100;
        //a=10;   //this throws error
        System.out.println(a);
        Final b=new Final();
        //b.run();//this gives error 
        b.run1();

    }
}