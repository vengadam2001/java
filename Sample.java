import java.util.*;//used for getting input from the user
public class Sample
{
public static void main(String args[])
	{
/*
	char s = 'a' ;
	boolean state = false ;
	int num1 =Integer.MIN_VALUE;//the Interger is a rapper class
	int num2 =Integer.MAX_VALUE;
	
	System.out.println(num1+1);
	System.out.println(num2-2);

	System.out.print("max int value:");
	System.out.println(num1);
	System.out.print("min int value:");
	System.out.println(num2);
System.out.print("float min value");		//float
	System.out.println(Float.MIN_VALUE);
System.out.print("float max value");
	System.out.println(Float.MAX_VALUE);
System.out.print("short min");
	System.out.println(Short.MIN_VALUE);	//short
System.out.print("short max");
	System.out.println(Short.MAX_VALUE);
System.out.print("long min");
	System.out.println(Long.MIN_VALUE);	//Long
System.out.print("long max");
	System.out.println(Long.MAX_VALUE);
System.out.print("Byte min");
	System.out.println(Byte.MIN_VALUE);	//Byte
System.out.print("Byte max");
	System.out.println(Byte.MAX_VALUE);
num1=10;//re assigning the values for variables
num2=20;
System.out.println(num1+ "+"+num2+ "="+num1+num2);

//getting the input from the user
*/
Scanner input=new Scanner (System.in); //here the new will allocate heap memory for the input.
/*System.out.print("enter the no");
int c=input.nextInt();
System.out.println("the no is"+c);

System.out.println("enter a msg");
String msg=input.next();
System.out.println("the msg is:"+msg);

System.out.println("THIS IS A CLACULATOR PROG ENTER LIKE '2 enter + enter 3' OR '7 enter - enter 5'");
System.out.print("enter 2 nos: ");

int a=input.nextInt();
char symb = input.next().charAt(0);
int b=input.nextInt();

switch(symb){
case '+':
	System.out.println("add"+(a+b));
	break;
case '-':
	System.out.println("SUB"+(a-b));
	break;
case '*':
	System.out.println("MUL"+(a*b));
	break;
case '/':
	System.out.println("DIV"+(a/b));
	break;
default:
System.out.println("hey the operation is not available...");
}
//the calculator prog is finished
System.out.print("enter your age");
a=input.nextInt();
if (a>18)
{
	System.out.println("you are an adult");
}

//Note:
//there are 3 types of control statement
//using only if means it is an one way branching statement
//if using if else then it is two way branching statement
//if using if else if and else  and switch then it is multiway branching statement

//there are 2 types of looping statement
//entry check loop ex: for while 
//exit chek loop ex:do while

if (a<18){
System.out.println("you are not an adult wait for "+(19-a));
	}
else if(a==18)
{
System.out.println("just wait a year ");
}
else if(a>=60)
{
System.out.println("you are an senior citizen");
}
else
{
System.out.println("you are adult");
}
System.out.println("hey the prog ends here");

System.out.print("hey check a year is leap year");
a=input.nextInt();
System.out.println((a%4==0 && a%100==0 && a%400!=0)?("leap year"+a):(a+" is not a leap year"));

//for loop 
for (a=0;a<10;a++)
{
System.out.println("hello");
}
	
// find wether the letter is a vowels or not.
System.out.println("enter a letter to check wether it is  a vowel");
char stras =input.next().charAt(0);
 
if (( Character. toUpperCase(stras) == 'A') || ( Character. toUpperCase(stras) == 'E' )||( Character. toUpperCase(stras) == 'I') ||( Character. toUpperCase(stras) == 'O')|| (Character. toUpperCase(stras) == 'U'))
{
System.out.println("Vowels");
}
else
{
System.out.println("not a vowels");
}
System.out.println("enter the no");
a=input.nextInt();	
//program is over
switch(a)
{
case 1:
{
	System.out.println("one");
	break;
}
case 2:
{
	System.out.println("two");
	break;
}case 3:
{
	System.out.println("three");
	break;
}case 4:
{
	System.out.println("four");
	break;
}case 5:
{
	System.out.println("five");
	break;
}case 6:
{
	System.out.println("six");
	break;
}case 7:
{
	System.out.println("seven");
	break;
}case 8:
{
	System.out.println("eight");
	break;
}case 9:
{
	System.out.println("nine");
	break;
}case 10:
{
	System.out.println("ten");
	break;
}default:
{
	System.out.println("enter the no between 0 ot 11");
	break;
}
}
for (int i=0;i<10;)
{
	for (;i%2==0;)
	{
		System.out.println("even"+""+i);
	i++;
	}
	for (;i%2!=0;)
	{
		System.out.println("odd"+""+i);
	i++;
	}
	
}



System.out.println("------------------------------");
for (int i=0;i<10;i++)
{
	System.out.println("even "+""+i);
	i++;
	System.out.println("odd"+""+i);
	i++;
}


//reversing the no

int a1=input.nextInt();
int rev=0;

for (int i=a1;i!=0;rev=rev*10+i%10,i/=10);

System.out.println(rev);

//over

//print the sum of n natural no
int a2=input.nextInt()+1;
System.out.println(a2*(a2-1)/2);
//end of code

//print the attandance of the student and check wether is he capable to write the exam(condition attandance is greater than 75%) .get the no of days present and the total no of days...
*/
float held=input.nextFloat(),attended=input.nextFloat(); 
System.out.println(attended*100/held);
System.out.println(((attended*100/held)>75)?"eligible":"not eligible");
input.close();
}
}