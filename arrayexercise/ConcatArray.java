package arrayexercise;

public class ConcatArray {
    public static void main(String[] args) {
        int arr1[]={52,10,30,90,5};
        int arr2[]={20,15,19,40,12,89};

        int arr3[]=new int[arr1.length+arr2.length];

        int i=0;
        while(i<arr1.length)
        {
            arr3[i]=arr1[i];
            i++;
        }
        int j=0;
        while(j<arr2.length)
        {
            arr3[i]=arr2[j];
            i++;
            j++;
        }

        for(int k=0;k<arr3.length;k++)
        {
            System.out.print(arr3[k]+" ");
        }

    }
}
