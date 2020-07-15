import java.util.*;
class Encryption{
    String encrypt(String word){
        String en_word="";
        int size=word.length();
        StringBuffer wordbf = new StringBuffer(word);
        for(int i=0;i<size;i++){
            char ch=wordbf.charAt(i);
            int asc=(int)ch;
            asc+=(i%256);
            ch=(char)asc;
            wordbf.setCharAt(i,ch);
        }
        wordbf=wordbf.reverse();
        en_word=wordbf.toString();
        return en_word;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Encryption e=new Encryption();
        System.out.println("Enter the word to encrypt:");
        String word=sc.next();
        String en_word=e.encrypt(word);
        System.out.println("The encrypted form of "+word+" is "+en_word);
    }
}