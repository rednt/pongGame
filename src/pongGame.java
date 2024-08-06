import javax.swing.*;
import java.awt.*;

public class pongGame extends JPanel {

    static final int Width = 640, Height = 480;

    public void paintComps(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0, Width,Height);
    }
}

