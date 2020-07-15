

//create a class named programming while creating a object of the class i fnpothing is passed to it then the msg i love programming should be printed if some string is passed to it then in place o fprogramming language the name of the str variable should be printed
//for ex while we are creating an object we pass we pass java then i love java should be printed
class programming{
    programming(){
        System.out.println("i love programming language");
    }
    programming(String str){
        System.out.println("i love "+str+".");
    }
}
public class constructor_overloading {
    public static void main(String agrs[]) {
    programming prog = new programming("java");
    programming prog1 = new programming();
}
}

