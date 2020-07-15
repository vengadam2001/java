public class methodoverridding {
    public static int add(int a, int b){
        System.out.println("int add function");
        return(a+b);
    }
    public static double add( double a,double b){
        System.out.println("float add function");
        return(a+b);
    }
    public static void main(String agrs[]){
        System.out.println("calling the float add function "+add(2.645678907,4.7890));
        System.out.println("calling the int add function "+add(2,4));
    }
}