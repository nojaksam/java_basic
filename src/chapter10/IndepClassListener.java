package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
    public IndepClassListener(){
        super("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); //컨텐트팬 알아내기
        c.setLayout(new FlowLayout());  // 컨텐트팬 FlowLayout 배치관리자로 설정;
        JButton btn = new JButton("Action"); // 버튼에 "Action" 넣기
        btn.addActionListener(new MyActionListener()); //Action 이벤트 리스너 달기
        c.add(btn);

        setSize(350, 150);
        setVisible(true);

    }
    public static void main(String[] args){
        new IndepClassListener();
    }
}

//독립된 클래스로 이벤트 리스너를 작성하기
class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton)e.getSource(); //이벤트소스버튼 알아내기
        if(b.getText().equals("Action")) // 버튼의 문자열이 "Action"dlswl qlry
            b.setText("액션"); // 번경
        else
            b.setText("Action"); //원상복구
    }

}
