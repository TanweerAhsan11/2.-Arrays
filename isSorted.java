import java.util.Scanner;
public class isSorted {
    public static boolean isSorted(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++ )
            {
                if(arr[j]<arr[i])
                {
                    return false;
                }
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

// O(n^2)
// we dont have to start j from 0 since we have to compare previous ith term to j and j++.