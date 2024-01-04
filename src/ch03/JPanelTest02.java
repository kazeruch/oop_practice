package src.ch03;
import javax.swing.*;

public class JPanelTest02 extends JFrame {
    public JPanelTest02() {
        setContentPane(new MySubPanel());
    }

    public static void main(String[] args) {
        JPanelTest02 myFrame = new JPanelTest02();
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // 閉じる設定
        myFrame.setTitle("JPanelTest02"); // ウィンドウのタイトル設定
        myFrame.setSize(400, 300); // ウィンドウのサイズ設定
        myFrame.setVisible(true); // 画面上に可視化
    }
}
