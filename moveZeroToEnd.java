import java.util.*;
public class moveZeroToEnd {

    public static void moveToEnd(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]!=0)
                    {
                        // swap(arr[i],arr[j]);
                        int temp=arr[i];
                        arr[j]=arr[i];
                        arr[j]=temp;
                    }System.out.println(arr[j]);
                }
            }
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
        moveToEnd(arr);
        
    }
}
