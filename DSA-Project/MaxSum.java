import java.util.Arrays;

public class Solution {
	public static int MaxSum(int[] arr) {
		int sum =0 ;
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i+=2) {
			sum += arr[i];		
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {1,0,3,5,6,8};
		System.out.print("Maximum sum is : " + MaxSum(arr));
	}	
}
