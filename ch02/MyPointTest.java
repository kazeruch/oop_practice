import important_class.MyPoint;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint a, b, c, d;
        a = new MyPoint(6, 8);
        b = new MyPoint(10, 10);
        c = new MyPoint(6, 8);
        d = a;

        System.out.println("a は " + a);
        System.out.println("b は " + b);
        System.out.println("c は " + c);
        System.out.println("d は " + d);

        System.out.println("a equals b は " + a.equals(b));
        System.out.println("a equals c は " + a.equals(c));
        System.out.println("a equals d は " + a.equals(d));
        System.out.println("a == b は " + (a == b));
        System.out.println("a == c は " + (a == c));
        System.out.println("a == d は " + (a == d));
    }
}
