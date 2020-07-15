import java.util.ArrayList;

class Departments{
String[] offered= {"csc","mech","ece","eee"};    
}
class sret extends Departments{
double fees[]={250000,50000,80000,70000};
String location="porur";
}
class srm extends Departments{
    double fees[]={230000,90000,120000,210000};
    String location="katagalathur";
}
class sse extends Departments{
    double fees[]={200000,80000,140000,120000};
    String location="chennai";
    }
class college extends Departments {
    public static void main(String agrs[])
    {
        sret a=new sret();
        srm b=new srm();
        sse c=new sse();
        System.out.println("SRET\t\t\t\t\t\tSRM\t\t\t\tSSE");
        System.out.println(" Courses \t\t Fees \t Location \tFees \t Location \tFees \t Location \t ");
        for (int i=0;i<a.offered[i].length();i++)
        {
            System.out.println("\t"+a.offered[i]+"\t\t"+a.fees[i]+"    "+a.location+"|    "+b.fees[i]+"   "+b.location+"|   "+c.fees[i]+"    "+c.location+"|");
        }

    }
}