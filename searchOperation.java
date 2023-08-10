import java.util.*;
public class searchOperation
{
    public static int searchArray(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int c = searchArray(arr,n,key);
        System.out.println(c);
    }
}