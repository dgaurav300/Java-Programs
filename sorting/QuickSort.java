package sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        
        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            
            while (j > low && arr[j] > pivot) {
                j--;
            }
            
            if (i < j) {
                swap(arr, i, j);
            }
        }
        
        swap(arr, low, j);
        
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 5, 1, 8, 3};
        int n = arr.length;
        
        quickSort(arr, 0, n - 1);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
            
        }
    }
}

