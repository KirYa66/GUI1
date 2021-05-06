import javax.swing.*;
import java.awt.*;

public class TestGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me1");
        button.setSize(200,20);
        button.setLocation(100,100);

        JButton button2 = new JButton("click me2");
        button2.setSize(101,20);
        JButton button3 = new JButton("click me3");
        button3.setSize(101,20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2).setLocation(20,30);
        frame.getContentPane().add(BorderLayout.SOUTH,button3);

        MyDrawPanel m = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,m);
        /*MyDrawPanel2 m2 = new MyDrawPanel2();
        frame.getContentPane().add(m2);*/

        frame.setVisible(true);

    }




}
