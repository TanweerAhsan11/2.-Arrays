import java.util.Scanner;

public class isSortedEfficient {

    public static boolean isSorted(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
      public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        n=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        boolean c=isSorted(arr);
        System.out.println(c);
    }
    
}
// O(n)