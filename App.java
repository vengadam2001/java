class App{
    public static void main(String args[]){
        System.out.println("App started!");
        //MyTask mt=new MyTask();
        //mt.start();
        Runnable r1=new MyTask();
        Thread myt=new Thread(r1);
        myt.start();
        
        Runnable r2=new YourTask();
        Thread yot=new Thread(r2);
        yot.start();
        
        for(int i=1;i<=10;i++)
            System.out.println("In Main "+i);
        System.out.println("App ended!");
    }
}

class YourTask implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println("In YourTask "+i);
    }
}

class CA{
    
}

class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hello in My Task "+i);
        }
    }
}