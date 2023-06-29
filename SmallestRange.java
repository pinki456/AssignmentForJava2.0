
import java.util.*;
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0]+k >= nums[nums.length-1]-k)
            return 0;
        return nums[nums.length-1]-k-(nums[0]+k);
    }
}
class SmallestRange{
    public static void main(String []args){
        int nums[] = {0,10};
        int k = 2;
        Solution obj = new Solution();
        int result = obj.smallestRangeI(nums,k);
        System.out.println(result);

    }
}