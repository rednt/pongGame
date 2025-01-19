import java.awt.*;


public class Ball {
    private int x,y, change_x,change_y,size,speed;
    private Color color;
    //constructor
    public Ball(int x,int y,int change_x,int change_y, Color color, int speed, int size){
        this.x = x;
        this.y = y;
        this.change_x = change_x;
        this.change_y = change_y;
        this.color = color;
        this.size = size;
        this.speed = speed;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size);
    }
    public void moveBall(){
        x += change_x;
        y += change_y;
    }
    public void bounceOffEdges(int top, int bottom){
        //y value at bottom of the screen
        if(y > bottom - size){
            reverseY();
        }
        //y value at top of the screen
        else if(y < top){
            reverseY();
        }
        if(x < 0){
            reverseX();
        }
        else if(x > 640 - size){
            reverseX();
        }

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getSize() {
        return size;
    }

    public void reverseX(){
        change_x *= -1;
    }
    public void reverseY(){
        change_y *= -1;
    }
}