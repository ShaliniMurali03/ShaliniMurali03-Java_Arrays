import java.util.Scanner;

public class DupInArr
{//To find Duplicates present in an array

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int size = scan.nextInt();

        //array declaration
        int[] arr = new int[size];

        //to get elements from user
        System.out.println("Enter the Elements to be stored in Array");
        for(int i=0;i<arr.length;i++)
            arr[i] = scan.nextInt();

        //to find duplicates in Array
        System.out.println("Duplicates");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    System.out.print(arr[i]+" ");
            }
        }

    }

}
