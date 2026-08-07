package swing.ch05;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventListenerFrame extends JFrame {

    private final int FREAM_SIZE = 500;
    private JTextArea textArea;

    public KeyEventListenerFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(FREAM_SIZE, FREAM_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false); // 사용자 마우스로 크기를 조정 못 하게 막음
        textArea = new JTextArea();
    }

    private void setInitLayout() {
        add(textArea);
        setVisible(true);
    }

    private void addEventListener() {
        // 이벤트 리스너 등록 - 익명 내부 클래스로 처리
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // System.out.println(e.getSource());
                System.out.println("키 누름 : " + e.getKeyCode());
                // 코드 풀이
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    textArea.append("위쪽 화살표 \n ");
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    textArea.append("왼쪽 화살표  \n");
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    textArea.append("오른쪽 화살표  \n");
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea.append("아래 화살표  \n");
                }
                // 도전 - 이벤트를 받아서 위 쪽 화살표면 위쪽 화살표 출력 ⬆
                // 위 쪽 화살표 - 위쪽 화살표 출력 ⬆
                // 아래 쪽 화살표 -  ⬇️
                // 오른쪽 화살표 -  ➡
                // 왼쪽 화살표 -  ️⬅️
                // textArea <-- 글자와 이모지를 출력 (단 이전 내용이 사라지면 안됨)
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased 발생 : " + e.getKeyCode());
            }
        });
    }

    public static void main(String[] args) {
        new KeyEventListenerFrame();
    }

}
