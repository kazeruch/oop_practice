package src.important_class;

public class MyLine {
    private MyPoint start; // 始点として MyPoint クラスのオブジェクトを持つ
    private MyPoint end; // 終点として MyPoint クラスのオブジェクトを持つ

    public MyLine(int x1, int y1, int x2, int y2) {
        start = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    
    public int startX() {
        return start.getX();
    }
    
    public int startY() {
        return start.getY();
    }

    public int endX() {
        return end.getX();
    }

    public int endY() {
        return end.getY();
    }

    public double distance() {
        return start.distance(end);
    }

    public String toString() {
        return "a MyLine(" + start.toString() + ", " + end.toString() + ")";
    }
}
