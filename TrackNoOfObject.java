import java.util.*;
class TrackNoOfObject{
    static int n;
    public TrackNoOfObject()
    {
       n++;
    }
    static void display(){
        System.out.println(n + " objects are created");
    }
    public static void main(String[] args) {
        TrackNoOfObject obj = new TrackNoOfObject();
        TrackNoOfObject obj1 = new TrackNoOfObject();
        TrackNoOfObject obj2 = new TrackNoOfObject();
        TrackNoOfObject obj3 = new TrackNoOfObject();
        TrackNoOfObject obj4 = new TrackNoOfObject();

        display();
    }
}