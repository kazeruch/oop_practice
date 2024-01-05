package src.ch04;

public class Point1 {
    public double x; // パブリックな x
    public double y; // パブリックな y

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getR() { // 原点からの距離
        double r = Math.sqrt(x * x + y * y);
        return r;
    }
    public double getTheta() { // 角度
        double theta = Math.atan2(y, x); // atan を求める
        theta = Math.toDegrees(theta); // 角度を ° に直す
        return theta;
    }
    public double distance(Point1 anotherPoint) {
        double dX = x - anotherPoint.x; // 自分の x 座標 - 相手の x 座標
        double dY = y - anotherPoint.y; // 自分の y 座標 - 相手の y 座標
        double distance = Math.sqrt(dX * dX + dY * dY);
        return distance;
    }
}

