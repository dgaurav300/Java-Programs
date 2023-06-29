package arrayexercise;

public class AddTwoArraysInThirdArray {
    public static void main(String[] args) {
        int arr1[]={52,10,30,90,5};
        int arr2[]={20,15,19,40,12};

        int sum[]=new int[arr1.length];

        //print arr1
        System.out.println("Print Array1:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //print arr2
        System.out.println("Print Array2:");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //add arr1+arr2 and print sum array
        System.out.println("Print Sum Array:");
        for(int i=0;i<arr1.length;i++)
        {
           sum[i]=arr1[i]+arr2[i];

           System.out.print(sum[i]+" ");
        }

        


    }
}
