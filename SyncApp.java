class SyncApp{
    public static void main(String args[]){
        System.out.println("App Starts");
        
        Printer printer=new Printer();
        //printer.printDocument(10,"ABC.pdf");
        
        MyThread mref=new MyThread(printer);
        YourThread yref=new YourThread(printer);
        mref.start();
        /*try{
            mref.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }*/
        yref.start();
        
        System.out.println("App Ends");
    }
}

class MyThread extends Thread{
    Printer pref;
    MyThread(Printer p){
        pref=p;
        ///setDaemon(true);//To set any thread as Daemon Thread
    }
    public void run(){
        synchronized(pref){//Intrinsic lock for the method
            pref.printDocument(10,"My.pdf");
        }
    }
}

class YourThread extends Thread{
    Printer pref;
    YourThread(Printer p){
        pref=p;
    }
    public void run(){
        synchronized(pref){
            pref.printDocument(10,"Your.pdf");
        }
    }
}

class Printer{
    //synchronized void printDocument(int numOfCopies, String docName){//Acquiring the intrinsic lock as a block
    void printDocument(int numOfCopies, String docName){    
        for(int i=1;i<=numOfCopies;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Printing "+docName+" "+i);
        }
    }
}