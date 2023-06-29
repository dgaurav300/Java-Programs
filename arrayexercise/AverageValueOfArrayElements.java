package arrayexercise;

public class AverageValueOfArrayElements {
    public static void main(String[] args) {
        int arr[]={52,10,30,90,5};
        int sum=0,average;
        for(int i=0;i<arr.length;i++)
        {  //sum=sum+arr[i];
            sum+=arr[i];
        }
       average=sum/arr.length;
       System.out.println("The average value of an Array Elements:"+average);
    }
}
