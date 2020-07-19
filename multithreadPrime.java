public class multithreadPrime extends Thread {
    public void run(long no, long gap,long target){
        boolean flag=true;
        for(long i =no ; i< target;i+=gap){
            for (long j=3;i<j;j+=2)
            {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag)
            System.out.println(no);
            flag=true;
        }
    }
    public static void main(String[] args) {
        multithreadPrime t1[8];
        for (int i=0;i<8;i++)
        t1[i]= new multithreadPrime();
    
        for(int i=0;i<8;i++){
            t1[i].start(1,16,10000);
        }
    }
}