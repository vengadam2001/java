import java.io.*;
import java.util.*;

public class java_end_of_file {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int i=1;
        while (a.hasNext()){
            System.out.println(String.valueOf(i)+' '+a.nextLine());
            i++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}