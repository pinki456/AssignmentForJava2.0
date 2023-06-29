
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans^=nums[i];
        }
        return ans;
    }
}
class SingleNumber{
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        Solution obj = new Solution();
        System.out.println(obj.singleNumber(nums));
    }
}