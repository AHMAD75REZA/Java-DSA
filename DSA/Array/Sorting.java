You have been given a sorted(in ascending order) integer array/list(ARR) of size N
 and an element X. Write a function to search this element in the given input 
 array/list using 'Binary Search'. Return the index of the element in the input 
 array/list. In case the element is not present in the array/list, then return -1.
 
 solution:-
 
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int s = 0;
        int e = arr.length-1;
      while(s<=e){
          int mid = (s+e)/2;
          if(arr[mid] > x){
              e = mid-1;
          }
          else if(arr[mid] <x){
              s= mid+1;
          }
          else{
              return mid;
          }
      }
        return -1;
    }

}