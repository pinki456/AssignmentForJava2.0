import java.util.Arrays;
public class IncreaseValueByOne
{
    public int [] plusOne(int[] digits){
        for(int i=(digits.length)-1;i >= 0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }else if(digits[i]==9){
                digits[i]=0;
            }
        }
        int[] newarr=new int[digits.length+1];
        newarr[0]=1;
        return newarr;
    }
    public static void main(String []args){
        int nums[] = {1,2,3};

        IncreaseValueByOne d = new IncreaseValueByOne();
       int result[] = d.plusOne(nums);
        for(int n : result){
            System.out.print(n + " ");
        }
    }
}