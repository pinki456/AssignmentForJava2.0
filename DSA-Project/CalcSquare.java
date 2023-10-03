import java.util.Arrays;

public class CalcSquare {
    public static int[] FindSquare(int arr[]) {
    	int len = arr.length;
        int res[]= new int[len];
        
        for(int i=0;i<len;i++) {
        	res[i] = arr[i] * arr[i];
        }
        Arrays.sort(res);        
        return res;
    }
    
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int result[] = FindSquare(nums);
        System.out.println("After calculate square : ");
        for(int n:result) {
        	System.out.print(n + " ");
        }
    }
}
