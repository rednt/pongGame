import javax.swing.*;
import java.awt.*;



public class pongGame extends JPanel{

    static final int Width = 640, Height = 480;

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

    }
    public void gameLogic(){
        pongBall.moveBall();
        pongBall.bounceOffEdges(0,Height);

    }


}



