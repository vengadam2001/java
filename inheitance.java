

class sample{
    int a;
    sample(){
    System.out.println("sample");
    }
}
public class inheitance extends sample {
    int b;
    inheitance(){
    System.out.println("inheritance");
    }
    public static void main()
{
    inheitance hello =new inheitance();
    System.out.println(hello.a+" "+hello.b);
}
}

//// the question is count the group of classes which has no link with each other                                                                                       and multiply them with 0.