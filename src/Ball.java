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
}