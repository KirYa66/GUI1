import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
/*<<<<<<< HEAD
=======

>>>>>>> origin/master*/
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//<<<<<<< HEAD

        JButton button = new JButton("изменить цвет");
        button.addActionListener(this);

        MyDrawPanel2 drawPanel = new MyDrawPanel2();

        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
/*/=======
        JButton button = new JButton("Изменить цвет");
        button.addActionListener(this);
        MyDrawPanel2 drawPanel = new MyDrawPanel2();
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(400,400);
        frame.setVisible(true);

//>>>>>>> origin/master*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
/*<<<<<<< HEAD

=======
>>>>>>> origin/master*/
    }
}
