package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame{
    public InnerClassListener(){

        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); //컨텐트팬 알아내기
        c.setLayout(new FlowLayout());  // 컨텐트팬 FlowLayout 배치관리자로 설정;
        JButton btn = new JButton("Action"); // 버튼에 "Action" 넣기
        btn.addActionListener(new MyActionListener()); //Action 이벤트 리스너 달기
        c.add(btn);

        setSize(350, 150);
        setVisible(true);


        }

    //내부 클래스로 엑션 리스너를 작성
    private class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");

            InnerClassListener.this.setTitle(b.getText());

        }


    }

    public static void main(String[] args) {
        new InnerClassListener();
    }
}
