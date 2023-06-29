class InsertionSortDemo
{
    public static void main(String[] args) {
        int arr[]={56,12,76,89,67,43,53,32};
     for(int i=1;i<=arr.length-1;i++)
     {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
     }
     //printing sorted array
     for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
     }
        

    }

}