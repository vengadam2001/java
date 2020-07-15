class Operations extends Div{
    Operations(){
        super();
    }
    public static void main(String args[]){
        Operations o = new Operations();
    }
}
class Div extends Mul{
    Div(){
        super();
        System.out.println("Div:"+(a/b));
    }
}
class Mul extends Sub{
    Mul(){
        super();
        System.out.println("Mul:"+(a*b));
    }
}
class Sub extends Add{
    Sub(){
        super();
        System.out.println("Sub:"+(a-b));
    }
}
class Add{
    int a=10;
    int b=5;
    Add(){
        System.out.println("Add:"+(a+b));
    }
}