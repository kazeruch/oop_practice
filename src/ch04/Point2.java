package src.ch04;

public class Point2 {
    private double x; // プライベートな x
    private double y; // プライベートな y

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() { // x 座標を答える
        return x;
    }
    public double getY() { // y 座標を答える
        return y;
    }
    public double getR() { // 原点からの距離
        double r = Math.sqrt(getX() * getX() + getY() * getY());
        return r;
    }
    public double getTheta() { // 角度
        double theta = Math.atan2(getY(), getX()); // atan を求める
        theta = Math.toDegrees(theta); // 角度を ° に直す
        return theta;
    }
    public double distance(Point2 anotherPoint) {
        double dX = getX() - anotherPoint.getX(); // 自分の x 座標 - 相手の x 座標
        double dY = getY() - anotherPoint.getY(); // 自分の y 座標 - 相手の y 座標
        double distance = Math.sqrt(dX * dX + dY * dY);
        return distance;
    }
}
