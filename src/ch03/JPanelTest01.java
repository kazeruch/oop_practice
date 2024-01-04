package src.ch03;
import javax.swing.*; // Swing コンポーネントを使用するため

public class JPanelTest01 extends JFrame {
    public JPanelTest01() {
        setContentPane(new MyPanel());
        // MyPanel オブジェクトを contentPane に設定
    }

    public static void main(String[] args) {
        JPanelTest01 myFrame = new JPanelTest01();
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // 閉じる設定
        myFrame.setTitle("JPanelTest01"); // ウィンドウのタイトル設定
        myFrame.setSize(400, 300); // ウィンドウのサイズ設定
        myFrame.setVisible(true); // 画面上に可視化
    }
}
