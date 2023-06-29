import java.io.*;

class FindPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length, k = n - 2, l = n - 1;
        while (k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }
        if (k < 0) {
            reverse(nums, 0, n - 1);
        } else {
            while (l > k && nums[l] <= nums[k]) {
                l--;
            }
            swap(nums, k, l);
            reverse(nums, k + 1, n - 1);
        }
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String args[])
    {
        int arr[] = { 1,2,3 };
        nextPermutation(arr);
        for(int n: arr){
            System.out.print(n + " ");
        }
    }
}