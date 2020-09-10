/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Subhadip
 */
public class bubble_sort {
   static int[] arr;
   public static void bubble_sort(int n)
   {
       int c=0;
       for(int i=0;i<n;i++)
       {
           c=0;
           for(int j=0;j<n-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   c++;
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
               
           }
            if(c==0)
               {
                   break;
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
        bubble_sort(n);
        System.out.print("sorted array: ");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        
         System.out.println();
    }
       
         
}
