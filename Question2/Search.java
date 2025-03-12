package Question2;

import java.util.Arrays;

public class Search {

    /**
     * @param arr array to search number from 
     * @param n number to search 
     * @return index of number in array else -1 if not found
     * @throws IllegalArgumentException when array is empty
     */
    public static int linearSearch(int[] arr,int n) throws IllegalArgumentException{
        if(arr.length == 0) throw new IllegalArgumentException("Array is Empty");
        return helperLinearSearch(arr, n, 0);  
    }
    
    // helper function for linarSearch
    private static int helperLinearSearch(int[] arr,int n,int i){
        if(i>=arr.length)return -1; 
        if(arr[i] == n)return i; 
        return helperLinearSearch(arr, n, i+1); 
    }

    /**
     * @param arr sorted array to search number from 
     * @param n number to search 
     * @return index of number in array else -1 if not found
     * @throws IllegalArgumentException when array is empty or unsorted
     */
    public static int binarySearch(int[] arr,int n)throws IllegalArgumentException{
        if(arr.length == 0) throw new IllegalArgumentException("Array is Empty");
        int sorted[] = arr.clone(); 
        Arrays.sort(sorted); 
        if(!Arrays.equals(arr, sorted))throw new IllegalArgumentException("Array is not Sorted");
        return helperBinarySearch(arr, n, 0, arr.length-1); 
    }
    // helper function for BinarySearch
    public static int helperBinarySearch(int[] arr,int n,int start,int end){
        if(start==end){
            if(arr[start]==n)return start; 
            return -1; 
        } 
        if(start>end)return -1; 
        int mid = (start+end)/2;
        if(arr[mid]==n)return mid; 
        else if (n>arr[mid])start = mid+1; 
        else end = mid - 1; 
        return helperBinarySearch(arr,n,start,end); 
    }
}
