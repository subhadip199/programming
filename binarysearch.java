/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author Subhadip
 */
public class binarysearch {
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
         System.out.print("Enter the search element: ");
         int key= sc.nextInt();
         int x= binary_search(0,n-1,key);
         if(x==-1)
         {
             System.out.println("Element is not found");
         }
         else
         {
             System.out.println("Element is  found at position "+(x+1));
         }
         
    }

    public static int binary_search(int low, int high, int key) {
        if(high==low)
        {
            if(key==arr[low])
            {
                return low;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            int mid = (int) Math.floor((low+high)/2);
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(key<arr[mid])
            {
               return binary_search(low,mid-1,key);
            }
            else
            {
                return binary_search(mid+1,high,key);
            }
        }
    }

  
}
