import src.important_class.MyTriangle;

public class MyTriangleTest {
    public static void main(String[] args) {
        MyTriangle tri1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        // 3:4:5 の直角三角形の生成

        System.out.println("作った三角形は " + tri1); // 端末に表示してみる
        System.out.println("外周の長さは " + tri1.distance()); // 外周を求めてみる
    }
}