import java.util.*;
class ChangeCase{
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str = sc.next();
        String st = "";

        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')){
                st += (char) (str.charAt(i) + 32);
            }
            else if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')){
                st += (char) (str.charAt(i) - 32);
            }
        }
        System.out.println(st);
    }
}