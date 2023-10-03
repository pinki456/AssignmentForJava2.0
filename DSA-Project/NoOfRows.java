public class NoOfRows {
	public static int FindNoOfRows(int n) {
		int count=0,ans=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				count++;
				if(count == n){
					ans = i-1;
					break;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int n=7;
		System.out.print("Complete rows are :" + FindNoOfRows(n));
	}
}
