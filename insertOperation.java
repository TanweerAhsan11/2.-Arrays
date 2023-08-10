import java.util.*;
public class insertOperation {
    public static int insert(int arr[],int n,int key,int capacity,int position)
    {
        if(n==capacity)     // It means full sized array and we can not insert any element.
        {
            return n;
        }

        int index=position-1;       // Since index starts from 0 and position starts from 1.
        for(int i=n-1;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=key;
        return (n+1);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int capacity=s.nextInt();
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int position=s.nextInt();
        int c=insert(arr,n,key,capacity,position);
        System.out.print(c);
    }
}
