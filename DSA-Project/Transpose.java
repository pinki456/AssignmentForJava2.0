import java.util.*;
class Transpose{
    public static int[][] transpose(int[][] num){
        for (int i=0; i< num.length;i++){
            for (int j=i+1; j< num.length; j++){
                int temp = num[i][j];
                num[i][j] = num[j][i];
                num[j][i] = temp;
            }
        }
        return num;
    }
    public static void main(String []args){
        int num1 [][]={{2,4,-1}, {-10,5,11}, {18,-7,6}};

        int result [][]=transpose(num1);

        for(int i=0; i< result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
