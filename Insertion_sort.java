

import java.util.Scanner;

public class Insertion_sort {
    
     static int [] arr;
  
    public static void insertion_sort(int n)
    {
          for(int k=1;k<n;k++)
          {
              int temp= arr[k];
              int j=k-1;
              while(arr[j]>temp && j>=0)
              {
                  arr[j+1]=arr[j];
                  j--;
              }
              arr[j+1]=temp;
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
        insertion_sort(n);
        System.out.print("sorted array: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        
         System.out.println();
    }
       
}
