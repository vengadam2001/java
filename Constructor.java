class Constructor{
    Constructor(int id1,String name1){
        int id=id1;
        String name=name1;
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        Constructor a = new Constructor(2,"stv");
        System.gc();
    }
}
