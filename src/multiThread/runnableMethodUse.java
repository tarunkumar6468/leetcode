package multiThread;

class multiThreadRunnable implements Runnable{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("value of i is "+ i);
            try{
                Thread.sleep(1000); // checked exception always
            }
            catch (Exception e){
                System.out.println("thread is over");
            }
        }

    }
}
public class runnableMethodUse {

    public static void main(String[] args){
        multiThreadRunnable th = new multiThreadRunnable();

        Thread thread = new Thread(th);
        thread.start();
    }
}
