import java.util.Scanner;

public class merge_sort {
    static int[] arr;
    static int[] brr;
    public static void mergesort(int low, int high)
    {
        if(low<high)
        {
            int mid=(int) Math.floor((low+high)/2);
            mergesort(low,mid);
            mergesort(mid+1,high);
            merge(low,mid,high);
        }
    }
    public static void merge(int low,int mid,int high)
    {

        int i=low;
        int j= mid+1;
        int k=low;
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                brr[k++]=arr[i++];
            }
            else
            {
                brr[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            brr[k++]=arr[i++];
        }
        while(j<=high)
        {
            brr[k++]=arr[j++];
        }
        
        for(i=low;i<=high;i++)
        {
            arr[i]=brr[i];
        }
    }
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
         arr =new int[n];
         brr= new int[n];
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(0,n-1);
        System.out.print("sorted array: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        
         System.out.println();
}
       
}
