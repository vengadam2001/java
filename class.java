/*data types in a class:
member variable-variables in a class (int a =0; here a is a variable)
member function -functions in a class(the functions declared in a class)
member class- class which is declared in same class
 
class is the blue print of the program
*/
class Class{
    int a;
    int b=20;
    int c=b+a;
    public static void main(String agrs[])
    {
        Class s=new Class();
        s.a=10;
        System.out.println(s.a);
    }
}