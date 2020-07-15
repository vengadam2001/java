class C extends B{
   C(){
       super();
       System.out.println("In class C");
       System.out.println((x+2)+""+(y+2)+""+(z+2));
    }
   public static void main(String args[]){
       C cobj=new C();
   }
}
class B extends A{
    B(){
        super();
        System.out.println("In class B");
        System.out.println((x+1)+""+(y+1)+""+(z+1));
    }
}
class A{
    int x,y,z;
    A(){
        x=5;
        y=6;
        z=7;
        System.out.println("In class A");
        System.out.println(x+""+y+""+z);
    }
}
