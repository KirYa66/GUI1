import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButton {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButton gui = new TwoButton();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton labelButton = new JButton("Изменить текст");
        labelButton.addActionListener(new LabelListener());
        JButton colorButton = new JButton("Изменить цвет");
        colorButton.addActionListener(new ColorListener());
        label = new JLabel("Я есть текст!");
        MyDrawPanel2 drawPanel = new MyDrawPanel2();
        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.EAST,labelButton);
        frame.getContentPane().add(BorderLayout.WEST,label);
        frame.setSize(700,400);
        frame.setVisible(true);

    }

    private class LabelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ой!!!");
        }
    }

    private class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
