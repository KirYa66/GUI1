import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer3 {
    static JFrame f = new JFrame("Мой первый музыкальный клип");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }
    public void setUpGui() {
        ml=new MyDrawPanel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,600);
        f.getContentPane().add(BorderLayout.CENTER,ml);
        f.setContentPane(ml);
        f.setBounds(30,30,300,300);
        f.setVisible(true);
    }

    private void go() {
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(ml,new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();
            int r=0;
            for (int i = 0; i < 61; i+=4) {
                r = (int) ((Math.random()*50)+1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,r,100,i+2));
            }
            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {ex.printStackTrace();}
    }

    private static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return event;
    }

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
                //msg = false;


            }
        }


    }


}
