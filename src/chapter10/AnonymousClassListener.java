package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener  extends JFrame{
    public AnonymousClassListener(){

        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); //컨텐트팬 알아내기
        c.setLayout(new FlowLayout());  // 컨텐트팬 FlowLayout 배치관리자로 설정;
        JButton btn = new JButton("Action"); // 버튼에 "Action" 넣기
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");

                setTitle(b.getText());

            }
                    });

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}
