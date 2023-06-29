import java.util.*;
public class ListQuickSort {
//Scanner Object
Scanner read=new Scanner(System.in);
 // Array of integers to hold values
private int[] arr = new int[20];
private int cmp_count; // Number of comparisons
private int mov_count; // Number of data movements
// Number of elements in array
private int n;
public ListQuickSort()
{
cmp_count = 0;
mov_count = 0;
}
private void read()
{
while (true)
{
System.out.print("Enter the number of elements in the array: ");
n = read.nextInt();
if (n > 0 && n <= 20)
{
 break;
 }

else if (n > 20)
{
System.out.println("\nArray can have maximum 20 elements.\n");
}
else if (n < 0)
{
System.out.println("\nEnter positive number.\n");
}
}
System.out.println("\n-----------------------");
System.out.println(" Enter array elements ");
System.out.println("-----------------------");
// Get array elements
for (int i = 0; i < n; i++)
{
System.out.print("<" + (i + 1) + "> ");
arr[i] =read.nextInt();
}
}
private void swap(int x, int y) /* Swaps the element at index x with
 the element at index y */
{
int temp;
temp = arr[x];
arr[x] = arr[y];
arr[y] = temp;
}
 public void q_sort(int low, int high)
 {
int pivot, i, j;
if (low > high)
{
return;
}
/* Partition the list into two parts:
One containing elements less than or equal to pivot
Other containing elements greater than pivot */
i = low + 1;
j = high;
pivot = arr[low];
while (i <= j)
{
// Search for an element greater than pivot
while ((arr[i] <= pivot) && (i <= high))
{
i++;
cmp_count++;
}
cmp_count++;

// Search for an element less than or equal to pivot
while ((arr[j] > pivot) && (j >= low))
{
j--;
cmp_count++;
}
cmp_count++;
if (i < j) /* If the greater element is on the
 left of the smaller element */
{
/* Swap the element at index i with the element 
 at index j */
swap(i, j);
mov_count++;
}
}
/* j now contains the index of the last element in the 
 sorted list. */
if (low < j)
{
swap(low, j); /* Move the pivot to its correct
 position in the list */
mov_count++;
}
//Sort the list on the left of pivot using quick sort
q_sort(low, j - 1);
//Sort the list on the right of pivot using quick sort
q_sort(j + 1, high);
}
 private void display()
 {
System.out.println("\n-----------------------");
System.out.println(" Sorted array elements ");
System.out.println("-----------------------");
for (int j = 0; j < n; j++)
{
System.out.println(arr[j]);
}
System.out.println("Number of comparisons: " + cmp_count);
System.out.print("Number of data movements: " + mov_count);
 }
private int getSize()
{
return (n);
}
 public static void main(String[] args)
{

 ListQuickSort myList = new ListQuickSort();
// Accept array elements
myList.read();
// Calling the sorting function
 // First call to Quick Sort Algorithm
 myList.q_sort(0, myList.getSize() - 1); 
// Display sorted array
myList.display();
// To exit from the console
System.exit(0);
}
}