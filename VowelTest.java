import java.util.*;
class VowelTest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:");
        char a=sc.next().charAt(0);
        if((a=='a'||a=='A')||(a=='e'||a=='E')||(a=='i'||a=='I')||(a=='o'||a=='O')||(a=='u'||a=='U')){
            System.out.println(a+" is a vowel");
        }
        else{
            System.out.println(a+" is a consonant");
        }
    }
}