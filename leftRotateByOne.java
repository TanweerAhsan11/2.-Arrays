import java.util.Scanner;

public class leftRotateByOne {
    public static void leftRotateOne(int arr[])
    {
        int n=arr.length;
        int temp=1;
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;  
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
        leftRotateOne(arr);
        
    }
}
