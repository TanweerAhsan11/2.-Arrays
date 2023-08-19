import java.util.*;
public class secondLargest {
    public static int getLargest(int arr[])
    {
        int n=arr.length;
        int largest=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                largest=i;
            }
        }
        return largest;
    }

    public static int getSecondLargest(int[] arr) 
    {
        int n=arr.length;
        int largest=getLargest(arr);
        int res=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[largest])    // Consider only those element which are not equal to largest.Since we have to find 2nd largest.
            {
                if(res==-1)
                {
                    res=i;  // if 1st element is not largest we will update 1st element as 0.
                }
                else if(arr[i]>arr[res])
                {
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,4,7,10,9};
        int c=getSecondLargest(arr);
        System.out.println(c);
    }

}
