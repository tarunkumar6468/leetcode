package multiThread;

class multiT extends Thread{
    public void run(){
        try{

            System.out.println(
                    "Thread"+Thread.currentThread().getId()+"is running"
            );
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
public class ThreadTester {
    public static void main(String[] args){
        int n= 8;
        for (int i = 0; i < n; i++) {
            multiT obj = new multiT();
            obj.start();
        }
    }
}
