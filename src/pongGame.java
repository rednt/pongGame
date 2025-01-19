import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class pongGame extends JPanel implements MouseMotionListener{

    static final int Width = 640, Height = 480;
    private int userMouseY;
    private Ball pongBall;
    private Paddle userPaddle, pcPaddle;

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0, Width,Height);
        pongBall.paint(g);
        userPaddle.paint(g);
        pcPaddle.paint(g);
    }

    public pongGame(){
        pongBall = new Ball(300,230,3,3,Color.CYAN,3,14);
        userPaddle = new Paddle(10, 200, 75, 3, Color.RED);
        pcPaddle = new Paddle(610, 200, 75, 3, Color.BLUE);
        userMouseY = 0;
        addMouseMotionListener(this);

    }
    public void gameLogic(){
        pongBall.moveBall();
        pongBall.bounceOffEdges(0,Height);
        userPaddle.moveTowards(userMouseY);
        pcPaddle.moveTowards(pongBall.getY());
        if(userPaddle.checkCollision(pongBall) || pcPaddle.checkCollision(pongBall)){
            pongBall.reverseX();
        }

    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        userMouseY = e.getY();
    }
}



