public class IsDistinctValue
{
    public boolean FindDistinct(int[] nums){
        boolean b = false;
        for(int i=0; i < nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    b = true;
                }
            }
        }
        return b;
    }
    public static void main(String []args){
        int nums[] = {1,2,3,4,5};

        IsDistinctValue d = new IsDistinctValue();
        boolean result = d.FindDistinct(nums);
        System.out.println(result);
    }
}