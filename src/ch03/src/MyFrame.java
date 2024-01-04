package src.ch03.src;
import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setContentPane(new MySubPanel1());
    }
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setTitle("MyPanel01");
        myFrame.setSize(800, 600);
        myFrame.setVisible(true);
    }
}
