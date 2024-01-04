package src.ch03.src;
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        int x = 10, y = 10;
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.cyan);
        g.fillRect(x, y, width - x*2, height - y*2);
        g.setColor(Color.blue);
        g.drawRect(x, y, width - x*2, height - y*2);
    }
}
