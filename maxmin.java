

import java.util.Scanner;


public class maxmin {

    static int[] arr;
    static int max, min;
    /**
     * @param args the command line arguments
     */
    public static void maxmin(int i, int j)
    {
        if(i==j)
        {
            max=arr[i];
            min=arr[j];
            return;
        }
        if(i==j-1)
        {
            if(arr[i]<arr[j])
            {
                min=arr[i];
                max=arr[j];
            }
             if(arr[i]>arr[j])
            {
                min=arr[j];
                max=arr[i];
            }
        }
        else
        {
            int mid = (int) Math.floor((i+j)/2);
            maxmin(i,mid);
            int min1=min;
            int max1= max;
            maxmin(mid+1,j);
            if(min1<min)
            {
                min=min1;
            }
            if(max1>max)
            {
                max=max1;
            }
                
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array; ");
        int n=sc.nextInt();
         arr =new int[n];
        System.out.print("Enter elements of the array; ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
        maxmin(0,n-1);
        System.out.println("maximum number : "+max);
        System.out.println("maximum number : "+min);
        
    }
    
}
