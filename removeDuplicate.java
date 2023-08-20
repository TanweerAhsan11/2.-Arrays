import java.util.Scanner;

public class removeDuplicate {

    public static int duplicate(int arr[])
    {
        int n=arr.length;
        int k=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
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
        int c=duplicate(arr);
        System.out.println(c);
    }   
}
