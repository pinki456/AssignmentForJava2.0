import java.util.*;
class StaticMethod{
    static int Square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        int square = Square(4);
        System.out.println("Square is " + square );
    }
}