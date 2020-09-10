import java.util.Scanner;
public class Quick_sort {
    static int[] arr;
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
        quicksort(0,n);
        System.out.print("sorted array: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        
         System.out.println();
}

    public static void quicksort(int low, int high ) {
        if(low<high)
        {
            int pos=partition(low,high);
            quicksort(low,pos);
            quicksort(pos+1,high);
        }
    }

    private static int partition(int low, int high) {
        int pivot=arr[low];
        int up=low;
        int down=high;
        while(up< down)
        {
            do
            {
                up++;
            }while(up < high && arr[up]<=pivot );
            do
            {
                down--;
              
            }while(arr[down]>pivot);
            
            if(up<down)
            {
                int temp= arr[up];
                arr[up]=arr[down];
                arr[down]=temp;
            }
        }
        arr[low]=arr[down];
        arr[down]=pivot;
        return down;
    }
}
