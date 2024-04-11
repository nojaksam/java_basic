package chapter9;

import javax.swing.*;
import java.awt.*;
public class Jframe2 extends JFrame {

    public Jframe2 (){
        setTitle("연습문제입니다.");
        setSize(300,300);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("Hello"));

        setVisible(true);

    }

    public static void main(String[] args) {
        new Jframe2();
    }


}
