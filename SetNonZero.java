public class SetNonZero
{
    public void setNonZero(int[] nums) {
        for (int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length;j++){
                // if i != 0 then no need to do anything but if i == 0 then do the swapping
                if(nums[i] == 0){
                    // if next element == 0 do nothing but if not assign the valve at the previous index
                    if(nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0; // And set it to 0 so that same index will not get repeated
                    }
                }
            }
        }
    }
    public static void main(String []args){
        int nums[] = {0,1,0,3,12};

        SetNonZero d = new SetNonZero();
        d.setNonZero(nums);
        // for Enhance loop to print the array
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}