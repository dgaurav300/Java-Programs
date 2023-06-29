package arrayexercise;
import java.util.Scanner;
public class ArrayEmentsInputByUser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of Array:");
        size=in.nextInt();        
        int arr[]=new int[size];
        System.out.println("Enter array Elements:");
        for(int i=0;i<arr.length;i++)  {
            System.out.print((i+1)+">");
            arr[i]=in.nextInt();            
        }
        System.out.println("Your Array elements is:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
