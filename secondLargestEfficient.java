public class secondLargestEfficient {
    public static int getSecondLargest(int arr[])
    {
        int n=arr.length;
        int res=-1;
        int largest=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest])
            {
                if(res==-1 || arr[i]>arr[res])
                {
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[]={1,4,2,9,10,8};
        int c=getSecondLargest(arr);
        System.out.println(c);
    }
}
