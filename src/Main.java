import javax.swing.*;


public class Main {
    //initialize the frame
    static JFrame frame = new JFrame("Pong");



    public static void main(String[] args) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //game size 480x640, the size of the JFrame needs to be slightly larger
        frame.setSize(650,495);

       pongGame game = new pongGame();
       frame.add(game);


        frame.setVisible(true);


    }


}
