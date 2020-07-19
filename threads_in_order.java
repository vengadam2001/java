class threads extends Thread{
    void run(String a, int n){
        for (int i=0;i<n;i++){
            System.out.println(a);
        }

    }
}
public class threads_in_order {
public static void main(String[] args) {
    threads S1=new threads();
    threads S2=new threads();
    threads S3=new threads();
    S1.setName("S1");
    S2.setName("S2");
    S3.setName("S3");
    S3.start();
    S3.run("Bye",5);
    try{
        S3.join();
    }
    catch(Exception e){
        System.out.print("");
    }
    S2.start();
    S2.run("Welcome to all",1);
    try{
        S2.join();
    }
    catch(Exception e){
        System.out.print("");
    }
    S1.start();
    S1.run("Hi",5);
    try{
        S1.join();
    }
    catch(Exception e){
        System.out.print("");
    }
}    
}