public class QuickSort
{
    void sort(int arr[], int low, int high)
    {   // Partition
        int mid = (low+high)/2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while(i<=j)
        {
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<=j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            //sort
            sort(arr,low,j);
            sort(arr,i,high);
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
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
        System.out.println("sorted array");
        printArray(arr);
    }
}