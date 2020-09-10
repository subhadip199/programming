

import java.util.Scanner;

public class HeapSort {
    static int[] arr;
     public static void heapsort(int n)
     {
   
         for(int i=((n/2)-1);i>=0;i--)
         {
            
             heapify(i,n);
              
         }
         for(int i=n-1;i>0;i--)
         {
             int temp= arr[0];
             arr[0]=arr[i];
             arr[i]=temp;
             
             heapify(0,i);
             
         }
         
     }
     public static void heapify(int i,int n)
     {
         int largest=i;
         int l=2*i+1;
         int r=2*i+2;
         
         while(l<n && arr[l]>arr[largest])
             largest=l;
         while(r<n && arr[r]>arr[largest])
             largest=r;
         if(largest!=i)
         {
             int temp= arr[largest];
             arr[largest]=arr[i];
             arr[i]=temp;
    
             heapify( largest,n);
         }
         
        
         
     }
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
         arr =new int[n];
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        heapsort(n);
        System.out.print("sorted array: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        
         System.out.println();
}
}
