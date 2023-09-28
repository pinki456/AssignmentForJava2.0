class FindDisjointElements{
    public static int[][] findDisjointElements(int[] num1, int[]num2){
        int[] res1 = findDifference(num1,num2);
        int[] res2 = findDifference(num2,num1);

        return new int[][] {res1,res2};
    }

    public static int[] findDifference(int[] num1, int[] num2){
        int[] res = new int[num1.length];
        int count=0;
        boolean f;

        for (int i=0; i<num1.length; i++){
            f=false;

            for (int j=0; j<num2.length; j++){
                if(num1[i] == num2[j]){
                    f=true;
                    break;
                }
            }

            if(!f){
                res[count++] = num1[i];
            }
        }
        int[] finalResult = new int[count];
        System.arraycopy(res, 0, finalResult, 0, count);
        return finalResult;
    }
    public static void main(String []args){
        int num1 []={1,2,3};
        int num2 []={2,4,6};
        int result [][]=findDisjointElements(num1,num2);

        System.out.println("Distinct elements in nums1 not present in nums2: " + Arrays.toString(result[0]));
        System.out.println("Distinct elements in nums2 not present in nums1: " + Arrays.toString(result[1]));
    }
}
