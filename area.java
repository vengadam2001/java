import java.util.Scanner;
class area
{
    public static float circle(float r) {
        return (r*r*(float)java.lang.Math.PI);
    }

    public static int Square(int s){
        return(s*s);
    }

    public static int rectangle(int b, int h) {
        return (b*h);
    }
    public static void main(String agrs[]){
        Scanner a = new Scanner(System.in);
        System.out.print("enter the radius of the circle : ");
        System.out.println("The area is "+circle(a.nextFloat()));
        System.out.print("enter the side length of the Square : ");
        System.out.println("The area is "+Square(a.nextInt()));
        System.out.print("enter the length and breath of rectangle (space seprated):");
        System.out.println("The area is "+rectangle(a.nextInt(),a.nextInt()));
        System.gc();
    }
}