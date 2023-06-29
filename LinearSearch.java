class LinearSearch
{
    //best efficiency case O(1)
    //average efficiency case (n+1)/2
    //worst efficiency case O(n)
    public static boolean contains(int arr[],int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
       int numbers[]={20,90,45,78,45,43};

       if(contains(numbers,43))
       {
         System.out.println("Find");
       }
       else
       {
        System.out.println("Not Find");
       }



    }
}