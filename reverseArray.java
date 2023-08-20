import java.util.*;
public class reverseArray {
    public static void reverse(int arr[])
    {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
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
        reverse(arr);
    }   
}
// O(n) time.
// O(1) space.