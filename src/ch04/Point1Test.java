package src.ch04;

public class Point1Test {
    public static void main(String[] main) {
        Point1 p1 = new Point1(10, 10);
        Point1 p2 = new Point1(6, 8);

        System.out.println(p1 + " の x は " + p1.x);
        System.out.println(p1 + " の y は " + p1.y);
        System.out.println(p1 + " の r は " + p1.getR());
        System.out.println(p1 + " の theta は " + p1.getTheta());
        System.out.println(p2 + " の x は " + p2.x);
        System.out.println(p2 + " の y は " + p2.y);
        System.out.println(p2 + " の r は " + p2.getR());
        System.out.println(p2 + " の theta は " + p2.getTheta());
    }
}
