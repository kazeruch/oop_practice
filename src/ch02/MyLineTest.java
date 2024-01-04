import src.important_class.MyLine;

public class MyLineTest {
    public static void main(String[] args) {
        MyLine line1, line2;
        line1 = new MyLine(10, 10, 6, 8);
        line2 = new MyLine(6, 8, -10, -10);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line1 + " の始点の x 座標は " + line1.startX());
        System.out.println(line1 + " の始点の y 座標は " + line1.startY());
        System.out.println(line2 + " の始点の x 座標は " + line1.endX());
        System.out.println(line2 + " の始点の y 座標は " + line1.endY());
        System.out.println(line1 + " の長さは " + line1.distance());
        System.out.println(line2 + " の長さは " + line2.distance());
    }
}
