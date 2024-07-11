package multiThread;

import java.util.Scanner;

class ThreadUse extends Thread{
 public void run(){

     int n =3;
     while(n>0){
         switch (n){
             case 3:
                 System.out.println("Three");
                 break;
             case 2:
                 System.out.println("Two");
                 break;
             case 1:
                 System.out.println("one");

                 try {
                     Thread.sleep(2000);
                     System.out.println("wait wait...........");
                 }
                 catch (Exception e){}

                 try{
                     Thread.sleep(2000);System.out.println("happy new year");
                 }catch (Exception e){}


         }
         try{
             Thread.sleep(1000); // checked exception always
         }
         catch (Exception e){
             System.out.println("thread is over");
         }
         n--;
     }
 }
}
public class ThreadUsing {
    public static void main(String[] args) {
        ThreadUse t = new ThreadUse();
        t.start();
    }
}
