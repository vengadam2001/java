import java.util.*;
public class arraylistpgm {
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<>();
        list.add("Abc");
        list.add("xyz");
        list.add("dsf");
        list.add(3,"djsf");
        list.remove(0);
        System.out.println(list.contains("Abc"));

        for(String s:list){
            System.out.println(s);
        }
    }

}
