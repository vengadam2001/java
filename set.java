
import java.util.*;
public class hello{}
public class set extends hello {
    public static void main(String agrs[]){
        Set<Integer> a=new HashSet();
        a.add(1);
        a.add(3);
        a.add(1);
        a.add(0);
        a.add(4);
        for (int i=0;i<10;i++)
        {
            System.out.println("set dose not store duplicate values :::::"+a);
        }
        Set<Integer> b=new TreeSet();
        b.add(1);
        b.add(4);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(4);
        for (int i=0;i<10;i++)
        {
            System.out.println("set dose not store duplicate values :::::"+b);
        }

        ArrayList<String> list=new ArrayList<>();
        list.add("hello");
        list.add("hey");
        list.add("hklenefn");
        System.out.println(list.get(2));
        list.remove(1);
        list.contains("hello");
        for (String s:list){
            System.out.println(s);
        }
        Collections.sort(list,Collections.reverseOrder());
        for (int i=0;i<10;i++)
        {
            System.out.println(list);
        }
        list.clear();
    }
}
