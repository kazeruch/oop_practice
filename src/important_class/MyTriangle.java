package src.important_class;

public class MyTriangle {
    private MyPoint[] points = new MyPoint[3];
    // 配列の宣言と初期化, 要素はすべて null

    public MyTriangle(int x0, int y0, int x1, int y1, int x2, int y2) {
        points[0] = new MyPoint(x0, y0);
        points[1] = new MyPoint(x1, y1);
        points[2] = new MyPoint(x2, y2);
    }

    public int getX(int num) {
        return points[num].getX(); 
    }

    public int getY(int num) {
        return points[num].getY();
    }

    public double distance() {
        double total = 0.0;
        for (int i=0; i<points.length; i++) {
            int j=(i+1) % points.length;
            // i 番目の次の点の番号を j に, i が 2 のときは j が 0
            total = total + points[i].distance(points[j]);
            // 合計に i 番目の点と j 番目の点の距離を足す
        }
        return total;
    }

    public String toString() { // 文字列表現を返す
         String result = "a Triangle(";
         for (int i=0; i<points.length; i++) {
            result = result + getX(i) + ", " + getY(i);
            if (i != 2) {
                result = result + ", ";
            }
         }
         result = result + ")";
         return result;
    }
}
