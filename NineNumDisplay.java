package com.company;
import javax.swing.*;
import java.awt.*;

public class NineNumDisplay extends JFrame {
    public static void main(String[] args) {
        new NineNumDisplay();
    }

    //页面上显示的一个个数字是按钮
    private JButton buttons[];
    private JPanel panel;

    public NineNumDisplay() {
       // super("可视化显示");
        this.setTitle("可视化显示");
        //设置窗体的大小为400*300像素大小
        this.setSize(400, 300);
        //窗口将置于屏幕的中央
        this.setLocationRelativeTo(null);
        //用户单击窗口关闭按钮时，程序执行的操作。
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        //设置窗体是否可以调整大小，参数为布尔值
        this.setResizable(true);//默认为true
        //定义一个一维数组
        int[] numbers = {8, 3, 4, 6, 0, 2, 7, 1, 5};
        //JPanel 是 Java图形用户界面(GUI)工具包swing中的面板容器类，包含在javax.swing 包中，是一种轻量级容器，可以加入到JFrame窗体中。
        //创建一个面板容器对象。
        panel = new JPanel(new GridLayout(3, 3));
        //声明button数组长度为9
        buttons = new JButton[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //将每个按钮创建出来，上面的值就是数字
                if (numbers[3 * i + j] != 0) {
                    buttons[3 * i + j] = new JButton(String.valueOf(numbers[3 * i + j]));
                    //将每个按钮放到面板上
                    panel.add(buttons[3 * i + j]);
                }
                else {
                    buttons[3 * i + j] = new JButton(String.valueOf(" "));
                    //将每个按钮放到面板上
                    panel.add(buttons[3 * i + j]);
                    buttons[3 * i + j].setEnabled(false);
                }
            }
        }
        //面板放到容器中。
        this.getContentPane().add(panel);
        //显示出来（设为可见）
        this.setVisible(true);
    }

}

