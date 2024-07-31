package TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    // 定义敌人坦克， 放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel() {
        hero = new Hero(100,100);
        hero.setSpeed(5);
        // 初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i+1), 0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); // 填充矩形，默认黑色

        // 画出坦克-方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 0);

        // 画出敌人坦克
        for (int i = 0; i< enemyTankSize; i++) {
            //取出
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
        }
    }

    // 编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        // 根据不同类型坦克，设置不同颜色
        switch (type) {
            case 0: // 我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: // 敌人的坦克
                g.setColor(Color.yellow);
                break;
            default:
                System.out.println("Not yet handled");
        }

        // 根据不同方向， 来绘制坦克
        switch (direct) {
            case 0: // up
                g.fill3DRect(x, y, 10, 60, false); // 左边轮子
                g.fill3DRect(x+30 ,y ,10,60,false);// 右边轮子
                g.fill3DRect(x+10 ,y+10 ,20,40,false);// 中间盖子
                g.fillOval(x+10 ,y+20 ,20,20);// 圆形盖子
                g.drawLine(x+20 ,y+30 ,x+20,y);// 中间炮筒
                break;
            case 1: // right
                g.fill3DRect(x, y, 60, 10, false); // 左边轮子
                g.fill3DRect(x ,y+30 ,60,10,false);// 右边轮子
                g.fill3DRect(x+10 ,y+10 ,40,20,false);// 中间盖子
                g.fillOval(x+20 ,y+10 ,20,20);// 圆形盖子
                g.drawLine(x+30 ,y+20 ,x+60,y+20);// 中间炮筒
                break;
            case 2: // down
                g.fill3DRect(x, y, 10, 60, false); // 左边轮子
                g.fill3DRect(x+30 ,y ,10,60,false);// 右边轮子
                g.fill3DRect(x+10 ,y+10 ,20,40,false);// 中间盖子
                g.fillOval(x+10 ,y+20 ,20,20);// 圆形盖子
                g.drawLine(x+20 ,y+30 ,x+20,y+60);// 中间炮筒
                break;
            case 3: // left
                g.fill3DRect(x, y, 60, 10, false); // 左边轮子
                g.fill3DRect(x ,y+30 ,60,10,false);// 右边轮子
                g.fill3DRect(x+10 ,y+10 ,40,20,false);// 中间盖子
                g.fillOval(x+20 ,y+10 ,20,20);// 圆形盖子
                g.drawLine(x ,y+20 ,x+30,y+20);// 中间炮筒
                break;
            default:
                System.out.println("Not yet handled");
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_W) {
            hero.setDirection(0);
            hero.moveUp();
        } else if (e.getKeyCode()==KeyEvent.VK_D) {
            hero.setDirection(1);
            hero.moveRight();
        } else if (e.getKeyCode()==KeyEvent.VK_S) {
            hero.setDirection(2);
            hero.moveDown();
        } else if (e.getKeyCode()==KeyEvent.VK_A) {
            hero.setDirection(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
