package arrayexercise;

public class BubbleSort {
    public static void main(String[] args) {
        
        /*
         1. Set pass = 1. 
         2. Repeat step 3 varying j from 0 to n – 1 – pass. 
         3. If the element at index j is greater than the element at index j + 1,
         swap  the two elements. 
         4. Increment pass by 1. 
         5. If pass <= n – 1 go to step 2.
      
       */

    int numbers[]={50,45,70,90,54,37,28};
    int n=numbers.length;
System.out.println("Before bubble sorting:");
    for(int i=0;i<n;i++)
    {
     System.out.println(numbers[i]);
    }

    for(int pass=1;pass<=n-1;pass++)
    {
    for(int j=0;j<=n-1-pass;j++)
    {
      if(numbers[j]>numbers[j+1])
        {
         //swap 
          int temp=numbers[j];
          numbers[j]=numbers[j+1];
          numbers[j+1]=temp;
        }
    }   

    }

    System.out.println("After bubble sorting:");
    for(int i=0;i<n;i++)
    {
     System.out.println(numbers[i]);
    }

    }
}
