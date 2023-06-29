public class BinarySearch {
    public static void main(String args[]) {
        int []arr={12,30,45,90,150,200};
        int item=45;
       int n=arr.length;
        int lowerbound = 0;
int upperbound = n - 1;
// Obtain the index of the middlemost element
int mid = (lowerbound + upperbound) / 2;
int ctr = 1; // Variable to count the number of comparisons
while ((item != arr[mid]) && (lowerbound <= upperbound)) /* Loop to search for the element in the array */
{
if (item > arr[mid])
{
lowerbound = mid + 1;
}
else
{
upperbound = mid - 1;
}
mid = (lowerbound + upperbound) / 2;
ctr++;
}
if (item == arr[mid])
{
System.out.println("\n" + item + " found at position "+(mid+1));
}
else
{
System.out.println("\n"+item+ " not found in the array\n");
}
System.out.println("\nNumber of comparisons: " + ctr);


    }
}
