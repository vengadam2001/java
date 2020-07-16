//in interface we can only use abstract method only 
interface  g{
abstract void run2();
void show(); //even with out the abstract keyword also it wll take it as abstract if it ends with semicolon ';'
}

interface h{
void display();    
}
public class Interface implements g,h{
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("displaying");
    }
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

    public static void main(String args[]) {
    Interface a =new Interface();
        a.run2();
        a.show();
        a.display();
        System.out.println("j"+'a'+'v'+'a');
        System.out.println('j'+'a'+"v"+'a');
        String d="1234";
        System.out.println(d+"  "+d.length());
    }
}