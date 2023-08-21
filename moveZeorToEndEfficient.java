import java.util.Scanner;

public class moveZeorToEndEfficient {
    public static void moveToEndEfficient(int arr[])
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                // swap(arr[i],arr[count]);
                int temp=arr[i];
                arr[count]=arr[i];
                arr[count]=temp;
                count++;
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
        moveToEndEfficient(arr);
        
    }
}
