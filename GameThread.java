import java.applet.*;
import java.awt.*;
public class GameThread extends Applet implements Runnable {
  Thread t;
  Image offscreenImage;
  Graphics offscr;
  public static int width, height;
  static Player player, player2;
  KeyHandler keyhandler;
  public void init() {
    t = new Thread(this);
    setSize(400,300);
    width = getSize().width;
    height = getSize().height;
    offscreenImage = createImage(width,height);
    offscr = offscreenImage.getGraphics();
    player = new Player(50,50,Color.cyan,true);
    player2 = new Player(30, 70,Color.red,false);
    Coin.coinArray[0] = new Coin(100,100);
    Coin.coinArray[1] = new Coin(160,80);
    Coin.coinArray[2] = new Coin(120,110);
    Coin.coinArray[3] = new Coin(250,30);
    WallBlock.wallArray[0] = new WallBlock(250,220);
    WallBlock.wallArray[1] = new WallBlock(250,270);
    WallBlock.wallArray[2] = new WallBlock(230,270);
    WallBlock.wallArray[3] = new WallBlock(180,270);
    WallBlock.wallArray[4] = new WallBlock(230,250);
    Enemy.enemyArray[0] = new Enemy(Color.green,200,200);
    keyhandler = new KeyHandler(this);
    t.start();
  }
  public void run() {
    while(true) {
      repaint();
      try {
        t.sleep(1000/30);
      }
      catch (InterruptedException e) {
        ;
      }
     }
    }
  public void paint(Graphics g) {
    offscr.setColor(Color.black);
    offscr.fillRect(0,0,width,height);
    player.draw(offscr);
    player2.draw(offscr);
    Coin.drawCoins(offscr);
    offscr.setColor(Color.white);
    offscr.drawString("P1 Coins: "+player.coins, 300,250);
    if(player2.visible == true) {
      offscr.drawString("P2 Coins: "+player2.coins, 300,270);
    }
    WallBlock.drawWalls(offscr);
    offscr.setColor(Color.yellow);
    offscr.drawString("v0.2.1",2,11);
    Enemy.drawEnemies(offscr);
    HelpScreen.draw(offscr);
    g.drawImage(offscreenImage,0,0,this);
  }
  public void update(Graphics g) {
    paint(g);
  }
  public boolean keyDown(Event e, int key) {
    keyhandler.handle(key);
    return true;
  }
}