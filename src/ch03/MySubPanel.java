package src.ch03;
import java.awt.*; // 描画に使う

public class MySubPanel extends MyPanel { // MyPanel を継承
    public void paintComponent(Graphics g) { // メソッドのオーバーライド
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int r;
        if (width > height) { // 幅と高さの短い方を円の半径の基準として使う
            r = height * 3 / 4 / 2;
        } else {
            r = width * 3 / 4 / 2;
        }
        g.setColor(Color.blue); // 描画色を青に
        g.fillOval(width / 2 - r, height / 2 - r, r * 2, r * 2);
        // 塗りつぶしの円を描画
    }
}
