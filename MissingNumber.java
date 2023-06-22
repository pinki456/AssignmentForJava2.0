import java.util.Arrays;

public class MissingNumber {
    public static int[] findNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
            if (count[num] == 2) {
                result[0] = num; // Found the duplicate number
            }
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                result[1] = i; // Found the missing number
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4}; // Example input
        int[] result = findNums(nums);
        for(int n:result){
            System.out.print(n + " ");
        }
    }
}