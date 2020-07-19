class Asa extends Thread{
    void run(String features){
        System.out.println(features +" \tThread name" +this.getName());
    }
}
public class threadswithname{
    public static void main(String[] args) {
        Asa t1 = new Asa();
        t1.setName("java");
        t1.start();
        Asa t2 = new Asa();
        t2.setName("python");
        t2.start();
        t1.run("java is compiler");
        t2.run("python is interpretor");
    }
}