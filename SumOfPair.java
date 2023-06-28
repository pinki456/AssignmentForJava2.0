import java.util.Arrays;
class Solution {
    public int pairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum=sum+nums[i];
        }
        return sum;
    }
}
class SumOfPair{
    public static void main(String []args){
        int nums[] = {1,4,3,2};
        Solution obj = new Solution();
        int result = obj.pairSum(nums);
        System.out.println("Sum of Pairs of array " + result);

    }
}