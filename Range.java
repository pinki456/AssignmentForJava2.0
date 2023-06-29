
import java.util.*;
class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int n = nums.length;
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add(f(lower, upper));
            return ans;
        }
        if (nums[0] > lower) {
            ans.add(f(lower, nums[0] - 1));
        }
        for (int i = 1; i < n; ++i) {
            int a = nums[i - 1], b = nums[i];
            if (b - a > 1) {
                ans.add(f(a + 1, b - 1));
            }
        }
        if (nums[n - 1] < upper) {
            ans.add(f(nums[n - 1] + 1, upper));
        }
        return ans;
    }

    private String f(int a, int b) {
        return a == b ?"["+ a + "," + a + "]" : "["+ a + "," + b + "]";
    }
}
class Range{
    public static void main(String[] args) {
        int[] intervals = {0,1,3,50,75};
        Solution obj = new Solution();
        System.out.println(obj.findMissingRanges(intervals,0,99));
    }
}