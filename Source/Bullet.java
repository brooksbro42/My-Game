import java.awt.*;
public class Bullet {
  public int startX, startY,x,y,direction,counter;
  public Bullet(int xtemp,int ytemp,int dir) {
    startX = xtemp;
    x = xtemp;
    startY = ytemp;
    y = ytemp;
    direction = dir;
  }
  public void draw(Graphics g) {
    if(counter == 0) {
      g.setColor(Color.orange);
      g.fillRect(startX,startY,8,16);
    }
    else if(counter < 500){
      y = y - 2;
      g.setColor(Color.orange);
      g.fillRect(x,y,8,16);
    }
    
    counter++;
  }
}