public class NoOfRows {
    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int currentRow = 1;
        
        while (n >= currentRow) {
            n -= currentRow;
            currentRow++;
            completeRows++;
        }
        
        return completeRows;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int result = arrangeCoins(n);
        System.out.println("Number of complete rows: " + result);
    }
}
