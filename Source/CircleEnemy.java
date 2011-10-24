import java.awt.*;
public class CircleEnemy extends Enemy {
  static public CircleEnemy[] circleEnemyList = new CircleEnemy[10];
  static public int circleEnemyCount = -1;
  public CircleEnemy(Color c, int xtemp, int ytemp) {
    super(c,xtemp,ytemp);
    circleEnemyCount++;
  }
  public void draw(Graphics g) {
    if(visible) {
      g.setColor(color);
      g.fillOval(x,y,20,20);
    }
  }
   public static void drawCircleEnemies(Graphics g) {
     if(circleEnemyCount != -1) {
       for(int i = circleEnemyCount; i >= 0; i--) {
         circleEnemyList[i].draw(g);
       }
     }
  }
}