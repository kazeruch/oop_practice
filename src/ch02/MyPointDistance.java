import src.important_class.MyPoint;

public class MyPointDistance {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(10, 10);
        MyPoint p2 = new MyPoint(6, 8);
        MyPoint p3 = new MyPoint(-10, 10);
        MyPoint p4 = new MyPoint(-6, -8);
        
        System.out.println(p1 + " と " + p2 + " の距離は " + p1.distance(p2));
        System.out.println(p1 + " と " + p3 + " の距離は " + p1.distance(p3));
        System.out.println(p1 + " と " + p4 + " の距離は " + p1.distance(p4)); 
    }
}