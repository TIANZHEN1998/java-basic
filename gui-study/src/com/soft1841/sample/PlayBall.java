package com.soft1841.sample;
/**
@author TianZhen
@date 2018.12.10
 */
//通过键盘方向键控制小球移动

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class playBall extends JFrame{
    MyPanel mp=null;
    public static void main(String[] args) {
        playBall pb=new playBall();
    }
      public playBall() {
        mp=new MyPanel();
        this.add(mp);
          mp.setBackground(Color.YELLOW);
        //事件监听
        this.addKeyListener(mp);
        this.setSize(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
//定义自己的面板
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 40, 40);
    }

    @Override
    //键被按下
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y -= 10;

                //调用repaint()函数，重新绘制小球位置
                this.repaint();
                break;
            case KeyEvent.VK_DOWN:
                y +=10;
                //调用repaint()函数，重新绘制小球位置
                this.repaint();
                break;
            case KeyEvent.VK_LEFT:
                x -= 10;

                //调用repaint()函数，重新绘制小球位置
                this.repaint();
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;

                //调用repaint()函数，重新绘制小球位置
                this.repaint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
//表示具体一个值被输出，例如：F1
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
