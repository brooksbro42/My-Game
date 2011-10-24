import java.awt.Graphics;
import java.awt.*;
public class Coin {
  static int coinCount = -1;
  public int x,y,ystart,xstart;
  static Coin[] coinArray = new Coin[10];
  public Coin(int xtemp,int ytemp) {
    x = xtemp;
    ystart = ytemp;
    xstart = xtemp;
    y = ytemp;
    coinCount++;
  }
  public void draw(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(x,y,10,10);
  }
  public static void drawCoins(Graphics g) {
     if(coinCount != -1) {
       for(int i = coinCount; i >= 0; i--) {
         coinArray[i].draw(g);
       }
     }
  }
  public static boolean checkPlayerHit(Player p) {
    int coinx,coiny;
    for(int i = coinCount; i >= 0; i--) {
      coinx = coinArray[i].x+5;
      coiny = coinArray[i].y+5;
      if(coinArray[i].x == p.x && coinArray[i].y ==p.y ||
        coinArray[i].x == p.x+10 && coinArray[i].y ==p.y ||
        coinArray[i].x == p.x && coinArray[i].y ==p.y+10 ||
        coinArray[i].x == p.x+10 && coinArray[i].y ==p.y+10) {
        coinArray[i].x = 500;
        coinArray[i].y = 500;
        return true;
      }
    }
    return false;
  }
  public void reset() {
    x = xstart;
    y = ystart;
  }
}