class ReverseString{
    public static void main(String[] args) {
        String str = "Wonderful";
        String rev = "";
        int len = str.length()-1;

        for(int i=len; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}