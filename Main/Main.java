class Main{
    public static void main(String args[]){
        OuterClass out=new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();
        //out.show();
        in.show();
        OuterClass.show();
    }
}
class OuterClass{
    public static void show(){
        System.out.println("Outer Class");
    }
    class InnerClass{
        void show(){
            System.out.println("Inner Class");
        } 
    }
}
