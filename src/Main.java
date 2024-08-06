import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    //initialize the frame
    static JFrame frame = new JFrame("Pong");



    public static void main(String[] args) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //game size 480x640, the size of the JFrame needs to be slightly larger
        frame.setSize(654,518);

       pongGame game = new pongGame();
       frame.add(game);


        frame.setVisible(true);

        //timer
        Timer timer = new Timer(33, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //update frames and game logic
                game.gameLogic();

                game.repaint();



            }
        });

        //start the timer
        timer.start();


    }


}
