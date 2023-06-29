public class PrintEven {
    //print even number from 50 to 100 using continue keyword in for loop
    public static void main(String[] args) {
        for(int i=50;i<=100;i++)
        {
            if(i%2==1)
             continue;
            System.out.println(i); 
        }
    }
}
