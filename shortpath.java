
import java.lang.Math;
class node {
    String name;
    int x, y;
    node next,before;
    node(String name, int x, int y,node next,node before) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.next=next;
        this.before=before;
    }
    void update(String name, int x, int y,node next, node before){
        this.name = name;
        this.x = x;
        this.y = y;
        this.next=next;
        this.before=before;
    }
    float get_weight(int x, int y) {
        return (float) Math.sqrt( ( (   (x-this.x)*(x-this.x)  )   + ((y-this.y)*(y-this.y))  ) );
    }
}
class ll{
    node first,last;
    ll(){
        this.last=this.first=null;
    }
    public void append(String name, int x, int y){
        if (first==null){
            last=first =new node(name,x,y,null,null);
    }
        else{
        last.next=new node (name ,x,y,null,last);
        last= last.next;
        }
    }
    public void uodate(String name, int x, int y,node first,node last){

    }
}
class graph{
    graph(){

    }
}
public class Shortpath {
    public static void main(String args[])
    {
    }
}
