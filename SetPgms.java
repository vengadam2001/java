import java.util.*;
class SetPgms{
    public static void main(String args[]){
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(23);
        hashSet.add(10);
        
        for(int t:hashSet)
            System.out.println(t);//Prints in unsorted form
        
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(23);
        treeSet.add(10);
        
        for(int t:treeSet)
            System.out.println(t);//Prints in sorted form
    }
}