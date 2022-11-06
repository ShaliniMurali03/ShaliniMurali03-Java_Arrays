import java.util.Scanner;
public class subarray
{
    public static void main(String ar[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Main Array size:");
        n=sc.nextInt();
        System.out.println("Enter size of array to check");
        m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        System.out.println("Enter main array elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt(); //{7,5,2,3,1,4,6};
        int j=0;
        System.out.println("Enter array to check");
        for(j=0;j<m;j++)
            b[j]=sc.nextInt();//{2,3,1};
        int x=0;
        for(int i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    break;
                }
            }
            if(j==n)
            {
                x=1;
                System.out.println("Given array is not a subset");
                break;
            }
        }
        if(x==0)
        {
            System.out.println("Given array is a subset of the main array");
        }
    }
}