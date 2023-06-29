package threads_example;

public class PrintNumberUsingThread {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(1000);
                System.out.print("\r"+i);

            } catch (Exception e) {
                
            }
            
        }
    }
}
