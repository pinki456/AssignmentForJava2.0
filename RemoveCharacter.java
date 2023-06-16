import java.util.*;
class RemoveCharacter{
    public static void main(String[] args) {
        String str = "Pinky";
        System.out.println(charRemoveAt(str, 3));
    }
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p+1);
    }
}