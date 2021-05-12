import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;
    @Override
    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }

    public void paintComponent(Graphics g) {
        if (msg) {
            Graphics2D g2 = (Graphics2D) g;

            int red = (int) (Math.random()*255);
            int green = (int) (Math.random()*255);
            int blue = (int) (Math.random()*255);
            g.setColor(new Color(red,green,blue));
            int ht = (int) ((Math.random()*120)+10);
            int width = (int) ((Math.random()*120)+10);
            int x = (int) ((Math.random()*40)+10);
            int y = (int) ((Math.random()*40)+10);
            g.fillRect(x,y,width,ht);
            msg = false;
            /*g2.setColor(Color.yellow);
            g2.fillRect(300,50,100,100);
            //msg = false;*/
        }




        /*g.setColor(Color.yellow);
        g.fillRect(300,50,100,100);*/

        /*Image image = new ImageIcon("src/image1.jpg").getImage();
        g.drawImage(image,10,200,this);*/

        /*g.fillRect(0,0,this.getWidth(),this.getHeight());
        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        Color randomColor = new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);*/

        /*Graphics2D g2D = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70,170,Color.blue,150,250,Color.orange);
        g2D.setPaint(gradient);
        g2D.fillOval(70,170,100,100);

        Graphics2D g2D2 = (Graphics2D) g;

        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        Color startColor = new Color(red,green,blue);

        red = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
        Color endColor = new Color(red,green,blue);

        GradientPaint gradient2 = new GradientPaint(170, 170, startColor, 250, 250, endColor);
        g2D2.setPaint(gradient2);
        g2D2.fillOval(170, 170, 100, 100);*/
    }


}

