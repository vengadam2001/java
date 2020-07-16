import java.util.Scanner;
import java.util.Arrays;
public class day2
{
public static void main(String agrs[])
{
/*

for (int i=0;i<10;i++)
{
	if (i==3)
	{
	continue;
	}
	if (i==6)
	{
	break;
	}
	System.out.println(i);
}


int a[]= new int[3]; 			//arrays 1-d
for (int i=0;i<3;i++)
{
a[i]=1;
}


System.out.println("--------------------");
for (int i:a) {System.out.println(i);}		//enhanced for loop 
System.out.println("---------------------");


Scanner cin = new Scanner (System.in);
int b=cin.nextInt();
System.out.println("hey "+b);

int c[][]={{1,2,3},{2,3,4},{3,4,5}}; 		//2-D array
for (int i[]:c) for (int j:i)System.out.println(j);

int d[][][]={{{2,3,4},{2,3,4,5}},{{3},{1,2}}};	//3-D array jacked
for (int i[][]:d)for (int j[]:i) {{for (int k:j) System.out.print(k+"\t");}System.out.println("");}

System.out.println("hey hello how are you ....");
int e[][]={ {1,1,1,1,1} ,{2,2,2,2,2} ,{3,3,3,3} },f[][]=new int[3][];
for (int i=0;i<3;i++)
{
f[i]=new int[e[i].length];
f[i]=e[i];
} 


//get inputs for gagged array dynamically.


Scanner input = new Scanner(System.in);
System.out.print("enter the no of rows:");
int g[][]=new int[input.nextInt()][];
for (int i=0;i<g.length;i++){System.out.println("enter the length of the row :"+i);g[i]=new int[input.nextInt()];}
System.out.println("start entering teh values");
for(int i=0;i<g.length;i++) for (int j=0;j<g[i].length;j++) g[i][j]=input.nextInt();
System.out.println("stop you have completed");
for (int i[]:g) {System.out.println(" "); for (int j :i) System.out.print(j);}

//SORTING ARRAY

//import java.util.Arrays;
int h[]={1,2,3,4,5,6,7,8,9,10};
Arrays.sort(h);
System.out.println(Arrays.toString(h));			//Note this point can be done using 	"java.util.Arrays package"

//Arrays.copyOf() meathod
//import java.utils.Arrays; //is needed 
int i[]={1,2,3,4,5,6};
int j[]=Arrays.copyOf(i,7);
System.out.println(Arrays.toString(j));

//Arrays.copyOf() meathod
//import java.utils.Arrays; //is needed 
System.out.println(Arrays.copyOf(int i,7));


//sort in bubble sort

int k[]={1,4,2,3,5,3,4,2,1,4,6,8,5};
for (int z=0;z<k.length;z++)
{
	for (int x=0;x<k.length-i;x++)
		{
		if (k[x]<k[x+1])
{
			int temp=k[x];
			k[x]=k[x+1];
			k[x+1]=temp;
}
}
}
*/
//searching in a linear 1-d array
String myStr="jhbae";
    System.out.println(myStr.indexOf("e", 5));
}}