package src.ch04;

public class Point2Test {
    public static void main(String[] args) {
        Point2 p1 = new Point2(10, 10);
        Point2 p2 = new Point2(6, 8);

        System.out.println(p1 + " の x は " + p1.getX());
        System.out.println(p1 + " の y は " + p1.getY());
        System.out.println(p1 + " の r は " + p1.getR());
        System.out.println(p1 + " の theta は " + p1.getTheta());
        System.out.println(p2 + " の x は " + p2.getX());
        System.out.println(p2 + " の y は " + p2.getY());
        System.out.println(p2 + " の r は " + p2.getR());
        System.out.println(p2 + " の theta は " + p2.getTheta());
    }
}
