import java.util.*;
class IsPalindrome{
    public static void main(String[] args) {
        String str;
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str = sc.next();
        int len = str.length()-1;

        for(int i=len; i>=0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome!");
        }
    }
}