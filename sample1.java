// /*data types in a class:
// member variable-variables in a class (int a =0; here a is a variable)
// member function -functions in a class(the functions declared in a class)
// member class- class which is declared in same class
 
// class is the blue print of the program
// */
// /*
// class sample1{
// int a;
// int b=20;
// int c=b+a;
// public static void main(String agrs[])
// {
// sample1 s=new sample1();
// sample1 s1=new sample1();

// s.a=10;
// s1.a=11;
// System.out.println(s.a);
// System.out.println(s1.a);
// System.out.println(s.b);
// System.out.println(s.c+s.b);
// System.out.println(s.c);

// }}
// */

// import java.util.Arrays;
// import java.util.Scanner;
// class sample1
// {

// String str="";
// int roll=0;
// public static void main(String agrs[])
// {

// Scanner input =new Scanner(System.in);
// System.out.println("enter '!' to stop entering");
// sample1[] s= new sample1[10];
// int length=1;
// while(input.next().charAt(0)!='!')
// {
// 	s[length-1].str=input.next();
// 	s=Arrays.copyOf(s,length++);
// }
// while(length>-1)
// {
// 	System.out.println(s[length].roll);
// 	System.out.println(s[length].str);
// }
// }
// }


// /*
// 	USING face book as an example click to view your friend list ...
// 	every one has a name and friend to disp their name
// */