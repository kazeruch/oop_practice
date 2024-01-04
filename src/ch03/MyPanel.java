package src.ch03;
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel { // JPanel を継承
    public void paintComponent(Graphics g) { // メソッドのオーバーライド
        int x = 10, y = 10; // 上下左右のマージン計算用
        int width = getWidth(); // コンポーネントの幅を得る
        int height = getHeight(); // コンポーネントの高さを得る
        g.setColor(Color.white); // 描画色を白に
        g.fillRect(x, y, width - x*2, height - y*2); // 塗りつぶしの四角を描画
        g.setColor(Color.black); // 描画色を黒に
        g.drawRect(x, y, width - x*2, height - y*2); // 四角を描画
    }
}
