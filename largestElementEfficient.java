import java.util.*;
public class largestElementEfficient {
    public static int getLargest(int arr[])
    {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[res])
            {
                res=i;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,4,2,5};
        int c=getLargest(arr);
        System.out.println(c);
    }
}
