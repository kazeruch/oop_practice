import java.util.*;

public class ch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x座標の値を入れてください:");
        int x = sc.nextInt();
        System.out.print("y座標の値を入れてください:");
        int y = sc.nextInt();

        MyPoint point = new MyPoint(x, y);
        System.out.println(point.getR());
        System.out.println(point.getTheta());
        
        sc.close();
    }
}

class MyPoint {
    private int x; // x 座標を入れる変数
    private int y; // y 座標を入れる変数

    public MyPoint(int x, int y) { // コンストラクタ　パラメータを設定
        this.x = x; // 自分の x にパラメータの x を入れる
        this.y = y; // 自分の y にパラメータの y を入れる
    }

    public int getX() { // x 座標を答える
        return x;
    }
    public int getY() { // y 座標を答える
        return y;
    }
    public double getR() { // 原点からの距離を答える
        double r = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
        // Math を活用
        return r;
    }
    public double getTheta() { 
        double theta = Math.atan2(getY(), getX()); // atan を求める
        theta = Math.toDegrees(theta); // 角度を ° に直す
        return theta;
    }
}