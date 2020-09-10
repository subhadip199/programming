import java.util.Scanner;

public class Selection_sort {
    static int [] arr;
  
    public static void selection_sort(int n)
    {
          int min;
        for(int i=0;i<n-1;i++)
        {
           min=i; 
           for(int j=i+1;j<n;j++)
           {
               if(arr[j]<arr[min])
               {
                   min=j;
               }
           }
           if(min!=i)
           {
               int temp=arr[min];
               arr[min]=arr[i];
               arr[i]=temp;
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
        selection_sort(n);
        System.out.print("sorted array: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        
         System.out.println();
    }
       
}
