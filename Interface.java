//in interface we can only use abstract method only 
interface g{
abstract void run2();
void show(); //even with out the abstract keyword also it wll take it as abstract if it ends with semicolon ';'
}

public class Interface implements g{
    @Override
    public void run2() {
        // TODO Auto-generated method stub
        System.out.println("running");
    }
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("showing");
    }
    public static void main(String[] args) {
    Interface a =new Interface();
        a.run2();
        a.show();
    }
}