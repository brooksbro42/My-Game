import java.awt.*;
public class WallBlock {
  static int wallCount = -1;
  static public WallBlock[] wallArray = new WallBlock[60];
  int x,y;
  public WallBlock(int xtemp,int ytemp) {
    x = xtemp;
    y = ytemp;
    wallCount++;
  }
  public static void drawWalls(Graphics g) {
     if(wallCount != -1) {
       for(int i = wallCount; i >= 0; i--) {
         wallArray[i].draw(g);
       }
     }
  }
  public void draw(Graphics g) {
    g.setColor(Color.blue);
    g.fillRect(x,y,20,20);
  }
  public static boolean hitWall(int playerx, int playery) {
    if(wallCount != -1) {
       for(int i = wallCount; i >= 0; i--) {
         if(playerx == wallArray[i].x && playery == wallArray[i].y ||
       playerx + 10 == wallArray[i].x && playery == wallArray[i].y ||
       playerx == wallArray[i].x && playery + 10== wallArray[i].y ||
       playerx - 10 == wallArray[i].x && playery == wallArray[i].y ||
       playerx == wallArray[i].x && playery - 10 == wallArray[i].y||
       playerx-10 == wallArray[i].x && playery-10 == wallArray[i].y ||
       playerx+10 == wallArray[i].x && playery+10 == wallArray[i].y ||
       playerx+10 == wallArray[i].x && playery-10 == wallArray[i].y ||
       playerx-10 == wallArray[i].x && playery+10 == wallArray[i].y) {
           return true;
         }
       }
     }
    return false;
  }
}