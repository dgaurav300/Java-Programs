package threads_example;
class SynchronizedMethods 
{
 int d; 
 synchronized void getData(String type)
 {
 System.out.println("Got data:"+type+"="+ d); 
 
 }
 synchronized void putData(int d) 
 {
 this.d = d;
 System.out.println("Put data:" + d);
 } 
}
class Producer extends Thread 
{
 SynchronizedMethods t; 
 public Producer(SynchronizedMethods t) 
 { 
 this.t = t; 
 } 
 public void run()  
 { 
 int data =700; 
 while(true) 
 {
    try{
  Thread.sleep(2000);
 System.out.println("Put Called by producer"); 
 t.putData(data++);
 t.getData("Producer");
 }catch(Exception e){}
 } 
 } 
}
class Consumer extends Thread 
{
 SynchronizedMethods t; 
 public Consumer(SynchronizedMethods t) 
 { 
 this.t = t; 
 } 
 public void run() 
 { 
 while(true) 
 {
    try{
        Thread.sleep(2000);
 System.out.println("Get Called by consumer");

 t.getData("Consumer"); 
    }
    catch(Exception e){}
 }
 } 
}
public class ProducerConsumer 
{
 public static void main(String args[]) 
 { 
 SynchronizedMethods obj1 = new SynchronizedMethods(); 
 Producer p = new Producer(obj1); 
 Consumer c = new Consumer(obj1); 
 p.start();
 while(p.isAlive())
 {
    System.out.println("Wait....");
 }
 c.start();
 } 
}
