import java.awt.*;
public class Level {
  public static WallBlock[] wallArray = new WallBlock[60];
  static Coin[] coinArray = new Coin[10];
  static LockedDoor[] doorArray = new LockedDoor[5];
  static Key[] keyArray = new Key[5];
  public static void init(int lev) {
    if(lev == 1) {
      keyArray[0] = new Key(0,80,Color.green);
      coinArray[0] = new Coin(100,0);
      coinArray[1] = new Coin(110,0);
      coinArray[2] = new Coin(100,10);
      coinArray[3] = new Coin(110,10);
      doorArray[0] = new LockedDoor(120,60,Color.green);
      wallArray[0] = new WallBlock(20,0);
      wallArray[1] = new WallBlock(40,0);
      wallArray[2] = new WallBlock(60,0);
      wallArray[3] = new WallBlock(60,20);
      wallArray[4] = new WallBlock(60,40);
      wallArray[5] = new WallBlock(60,60);
      wallArray[6] = new WallBlock(80,60);
      wallArray[7] = new WallBlock(100,60);
      wallArray[8] = new WallBlock(140,60);
      wallArray[9] = new WallBlock(20,40);
      wallArray[10] = new WallBlock(140,40);
      wallArray[11] = new WallBlock(140,20);
      wallArray[12] = new WallBlock(140,0);
      wallArray[13] = new WallBlock(0,60);
      wallArray[14] = new WallBlock(20,60);
      wallArray[15] = new WallBlock(40,100);
      wallArray[16] = new WallBlock(60,100);
      wallArray[17] = new WallBlock(20,100);
      wallArray[18] = new WallBlock(20,80);
    }
  }
}