package com.work;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Snake extends JFrame {

    public Snake() {
        //初始化
        initUI();
    }

    private void initUI() {
        
        add(new Board());
        
        setResizable(false); //JFrame插件
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //线程上的可运行对象排队
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}