class IterativeQuickSort { 
    void swap(int arr[], int i, int j) 
    { 
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
	//Try swapping without extra variable 
    } 
  
    /* This function is same in both iterative and 
       recursive*/
    int partition(int arr[], int l, int h) 
    { 
        int pivot = arr[h];

        int i = l - 1;
        int j;

        for (j = l; j <= h - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap (arr, i+1, h);
        return i+1;
        //Compare elements and swap.
    } 
  
    // Sorts arr[l..h] using iterative QuickSort 
    void QuickSort(int arr[], int l, int h) 
    { 
        //Try using Stack Data Structure to remove recursion.
        if (l < h) 
        {
            int partition = partition(arr, l, h);

            QuickSort(arr, l, partition - 1);
            QuickSort(arr, partition + 1, h);
        }

    } 
  
    // A utility function to print contents of arr 
    void printArr(int arr[], int n) 
    { 
        int i; 
        for (i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) 
    { 
        IterativeQuickSort ob = new IterativeQuickSort(); 
        int arr[] = { 4, 3, 5, 2, 1, 3, 2, 3 }; 
        ob.QuickSort(arr, 0, arr.length - 1); 
        ob.printArr(arr, arr.length); 
    } 
} 