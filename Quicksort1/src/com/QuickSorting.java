package com;
import java.util.Arrays;
public class QuickSorting {
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
        	int pivot1 = arr[high]; 
            int i1 = (low-1); 
            for (int j1=low; j1<high; j1++)
            {
                if (arr[j1] <= pivot1)
                {
                    i1++;
                    int temp = arr[i1];
                    arr[i1] = arr[j1];
                    arr[j1] = temp;
                }
            }
      
           
            int temp = arr[i1+1];
            arr[i1+1] = arr[high];
            arr[high] = temp;
      
            return i1+1;
            }
		return i;
        }
      
      
       
        void sort(int arr[], int low, int high)
        {
            if (low < high)
            {
               
                int pi = partition(arr, low, high);
                sort(arr, low, pi-1);
                sort(arr, pi+1, high);
            }
        }
      
        
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
      
       
        public static void main(String args[])
        {
            int arr[] = {10, 7, 8, 9, 1, 5};
            int n = arr.length;
      
            QuickSorting ob = new QuickSorting();
            ob.sort(arr, 0, n-1);
      
            System.out.println("sorted array");
            printArray(arr);
        }
    }