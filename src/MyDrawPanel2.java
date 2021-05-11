import javax.swing.*;
import java.awt.*;

public class MyDrawPanel2 extends JPanel {
    public void paintComponent(Graphics g2) {

        Graphics2D g2D2 = (Graphics2D) g2;

        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        Color startColor = new Color(red,green,blue);

        red = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
        Color endColor = new Color(red,green,blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 270, 270, endColor);
        g2D2.setPaint(gradient);
        g2D2.fillOval(70, 70, 200, 200);
    }
}
