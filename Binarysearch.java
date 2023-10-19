public class Binarysearch {
    
    int binarysearch(int arr[], int n, int k) {
        // code here
        
        int low = 0;
        int high = n-1;
        
        while(low <=high){
            int mid = low + (high-low) /2;
            
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid]<k){
                low = mid+1;
            }
            else{
            
            high = mid-1;
            }
        }
        
        return -1;
    }
}
    
//----------------using recursion---------------------

// class Solution {
   
//         int binarysearch(int arr[], int n, int k) {
//         // code here
//         int low=0,high=n-1;
//         return BinarySearch(arr,k,low,high);

//         }
        
//     int BinarySearch(int array[], int x, int low, int high) {
//         if (high >= low) {
//             int mid = low + (high - low) / 2;

//     // If found at mid, then return it
//         if (array[mid] == x)
//             return mid;

//     // Search the left half
//         if (array[mid] > x)
//             return BinarySearch(array, x, low, mid - 1);

//     // Search the right half
//         return BinarySearch(array, x, mid + 1, high);
//     }

//     return -1;
//     }
// }

