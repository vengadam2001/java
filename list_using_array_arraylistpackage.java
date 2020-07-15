import java.util.*;
public class list_using_array_arraylistpackage {
    public static void main(String agrs[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("hello");
        list.add("hey");
        list.add("hklenefn");
        System.out.println(list.get(2));
        list.remove(1);
        list.contains("hello");
        for (String s: list){
            System.out.println(s);
        }
        list.clear();
        for (String s:  list){
            System.out.println();
        }
    }

}
