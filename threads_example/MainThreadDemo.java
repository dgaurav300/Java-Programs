package threads_example;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        thread.setName("Main Thread");
        System.out.println(" The current thread after name change : " 
 + thread);
 System.out.println("The current Thread is going to sleep for  10 seconds");
 try
 {
 Thread.sleep(10000); 
 }
 catch(InterruptedException e) 
 {
 System.out.println("Main thread interrupted"); 
 }
 System.out.println(" After 10 seconds...........the current  Thread is exiting now.");


    }
}
