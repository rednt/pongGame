import java.awt.*;

public class Paddle {
    private int height, x, y, speed; //x and y for position
    private Color color;

    static final int PADDLE_WIDTH = 15;

    public Paddle(int x, int y, int height, int speed, Color color) {
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.color = color;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x,y,PADDLE_WIDTH,height);
    }

    public void moveTowards(int moveToY){
        int centerY = y + height/2;
        if(Math.abs(centerY - moveToY) > speed){
            {
                if(centerY > moveToY){
                    //move the paddle up by the speed
                    y -= speed;
                }

                if(centerY < moveToY){
                    //move the paddle down by speed
                    y += speed;
                }
            }
        }
    }
    public boolean checkCollision(Ball b){
        int rightX = x + PADDLE_WIDTH;
        int bottomY = y + height;
        if(b.getX() > (x - b.getSize()) && b.getX() < rightX){
            //check if Ball is between the y values
            if(b.getY() > y && b.getY() < bottomY){
                return true;}
        }
        return false;
    }
}
