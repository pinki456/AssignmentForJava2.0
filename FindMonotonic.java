
import java.util.*;
class Solution {
    public boolean isMonotonic(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]) {

                for(int j = i + 1; j < nums.length - 1; j++){
                    if(nums[j] > nums[j + 1]) return false;
                }

                return true;
            }else if(nums[i] > nums[i + 1]) {

                for(int j = i + 1; j < nums.length - 1; j++){
                    if(nums[j] < nums[j + 1]) return false;
                }

                return true;
            }
        }

        return true;
    }
}
class FindMonotonic{
    public static void main(String []args){
        int nums[] = {1,2,2,3};
        Solution obj = new Solution();
        boolean result = obj.isMonotonic(nums);
        System.out.println(result);

    }
}