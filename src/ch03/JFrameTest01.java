package src.ch03;

import javax.swing.*;

public class JFrameTest01 extends JFrame { // JFrame を 継承した JFrameTest01 クラス
    public static void main(String[] args) {
        JFrameTest01 myFrame = new JFrameTest01();
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // 閉じる設定
        myFrame.setSize(400, 300); // ウィンドウのサイズ設定
        myFrame.setVisible(true); // 画面上に可視化
    }
}