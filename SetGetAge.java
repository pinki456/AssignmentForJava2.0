import java.util.*;
class SetGetAge{
    private int age;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        SetGetAge s1 = new SetGetAge();
        s1.setAge(19);
        int age = s1.getAge();
        if(age >= 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You are under age limit, Can't vote!");
        }
    }
}