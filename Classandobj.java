class Sample {
    Sample(){
        System.out.println("hello java");
    }
    Sample(String s){
        System.out.println("hi "+s);
    }
}
public class Classandobj {
    public static void main(String args[])
    {
     Sample a= new Sample();
     Sample b=new Sample("stv");
     a=b=null;
     System.gc();   
    }
}