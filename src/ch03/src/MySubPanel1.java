package src.ch03.src;
import java.awt.*;

public class MySubPanel1 extends MyPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        
        g.setColor(Color.green);
        g.fill3DRect(width / 2 - 200, height / 2 - 150, 400, 300, true);
        g.setColor(Color.darkGray);
        g.draw3DRect(width / 2 - 200, height / 2 - 150, 400, 300, true);
    }
}
