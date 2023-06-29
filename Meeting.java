
import java.util.*;
class Solution {
    public boolean canAttend(int[][] intervals){
        if(intervals == null || intervals.length == 0) return true;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < intervals[i - 1][1])
                return false;
        }
        return true;
    }
}
class Meeting{
    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        Solution obj = new Solution();
        System.out.println(obj.canAttend(intervals));
    }
}