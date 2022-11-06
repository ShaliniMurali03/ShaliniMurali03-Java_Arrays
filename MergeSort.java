public class MergeSort
{
    void sort(int arr[],int left,int right)
    {
        //divide one array into subarrays
        if(left<right)
        {
            int mid = (left+right)/2;
            //to sort each subarray
            sort(arr,left,mid);
            sort(arr,mid+1,right);

            //merge two sorted subarray
            merge(arr,left,mid,right);
        }
    }
    //merge two sorted subarray
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //temp array declaration
        int L[] = new int [n1];
        int R[] = new int [n2];

        //Copy data to temp arrays
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy remaining elements of L[]
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        //Copy remaining elements of R[]
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    //print method
    static void printArray(int arr[])
    {
        for(int elem: arr)
            System.out.print(elem+" ");
        System.out.println();
    }
    // Main Method
    public static void main(String args[])
    {
        int arr[] = {7,5,2,3,1,4,6};
        int n = arr.length;
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, n-1);
        System.out.println("sorted array");
        printArray(arr);
    }
}
