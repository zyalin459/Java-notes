package Draw_;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {

    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        // 初始化面板
        mp = new MyPanel();
        // 把面板放入窗口（画框）
        this.add(mp);
        //设置窗口大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); // 可以显示
    }
}
// 1 先定义一个MyPan el，
class MyPanel extends JPanel {
    // 1. MyPanel 对象就是i个面板
    // 2. Graphics g 把 g 理解为一支画笔
    // 3. Graphics提供了很多绘图的方法
    // Graphics g
    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawOval(10,10,100,100);
        // 化不同图形
        g.drawLine(10,10,100,100);
    }
}
