class GarbageCollection{
    public void finalize(){
        System.out.println("Garbage collection is done");
    }
    public static void main(String args[]){
        //Null the reference
        GarbageCollection g_c=new GarbageCollection();
        g_c=null;
        System.gc();
        //Assigning the ref to another ref
        GarbageCollection g_c1=new GarbageCollection();
        GarbageCollection g_c2=new GarbageCollection();
        g_c1=g_c2;
        System.gc();
        //Anonymous Object
        new GarbageCollection();
        System.gc();
    }
}