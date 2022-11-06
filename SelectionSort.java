public class SelectionSort
{
    void sort(int ar[])
    {
        for (int i = 0; i < ar.length - 1; i++)
        {
            // Finding the smallest element in the unsorted ar
            int min_element = i;
            for (int j = i + 1; j < ar.length; j++)
            {
                if (ar[j] < ar[min_element])
                {
                    min_element = j; //1 is min
                }
            }
            /* Swap the smallest element from the unsorted ar with the last element of the sorted ar */
            //swap min value 1 with 7
            int temp = ar[min_element];
            ar[min_element] = ar[i];
            ar[i] = temp;
        }
    }
    // Method to print array
    static void printArray(int ar[])
    {
        for(int elem: ar)
            System.out.print(elem+" ");
        System.out.println();
    }
    // Main Method
    public static void main(String[] args)
    {
        int[] ar = {7,5,2,3,1,4,6};
        SelectionSort sl = new SelectionSort();
        sl.sort(ar);
        printArray(ar);
    }
}







