package arrayexercise;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int arr[]={50,12,68,34,22,65,98,23};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {  //sum=sum+arr[i];
            sum+=arr[i];
        }
    System.out.println("Sum result of array:"+sum);
    }
}
