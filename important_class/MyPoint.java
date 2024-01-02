package important_class;

public class MyPoint {
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

    public boolean equals(MyPoint aPoint) {
        boolean ans;
        ans = (getX() == aPoint.getX()) && (getY() == aPoint.getY());
        return ans;
    }
}