import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        //{7,5,2,3,1,4,6}
        //to get the no.of elements in an array
        System.out.println("Enter the Size of the Array");
        int size = scan.nextInt();

        //array declaration
        int[] ar = new int[size];

        //to get the elements from user and store it in array
        System.out.println("Enter the "+size+" Elements to be stored in an Array");
        for(int i= 0 ;i<size;i++)
            ar[i] = scan.nextInt();

        System.out.println("Sorted Array");
        for(int i =0;i<ar.length;i++) //major loop for iterations
        {
            for(int j=1;j<ar.length-i;j++) //from the second minor loop, last value in the array is sorted so 7-1 is 6 .
            {//minor loop for elements
                if(ar[j]<ar[j-1])//comparing first value a[1] < second value a[0]
                {//condition steps for operation
                    int tempVar = ar[j];// temp=5 <- a[1]=5
                    ar[j] = ar[j - 1];//a[1]=7 <- a[0]=7
                    ar[j - 1] = tempVar;//a[0]=5 <- temp=5
                }
            }
        }

        for(int elem:ar)
        {
            System.out.print(elem+" "); // 1 2 3 4 5 6 7
        }
    }
}
