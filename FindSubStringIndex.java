import java.util.*;
class FindSubStringIndex{
        public static void main(String[] args) {
            String str = "Wonderful House";
            int ind = str.indexOf("House");

            if(ind == - 1) {
                System.out.println("Not found");
            } else {
                System.out.println("Found at index " + ind);
            }
        }
    }