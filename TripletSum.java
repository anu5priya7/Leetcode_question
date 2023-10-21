
import java .util.*;

public class TripletSum {
     
    public long maximumTripletValue(int[] nums){
           
           int n = nums.length;
        //calculate the maximum values to the left of every index;
        int[] maxLeft = new int[n];
        maxLeft[0] = nums[0];

        for(int i=1; i<n; i++){
           maxLeft[i]= Math.max(maxLeft[i-1], nums[i]);
        }

//calculate the maximum values to the rught of every index
        int[] maxRight = new int[n];
          maxRight[n-1] = nums[n-1];
           for(int i=n-2; i>=0; i--){
     maxRight[i] = Math.max(maxRight[i+1], nums[i]);
                 }

//calculate triplet 
          long result = 0;
             for(int j=1; j<n-1; j++){
    long value =(long) (maxLeft[j-1] - nums[j]) * maxRight[j+1];

    result = Math.max(result, value);
}

return result;
    }
}


