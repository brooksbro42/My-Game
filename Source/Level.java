public class Level {
  public static WallBlock[] wallArray = new WallBlock[60];
  static Coin[] coinArray = new Coin[10];
  public static void init() {
    Level.coinArray[0] = new Coin(40,20);
    Level.coinArray[1] = new Coin(40,30);
    Level.coinArray[2] = new Coin(100,40);
    Level.coinArray[3] = new Coin(110,40);
    Level.wallArray[0] = new WallBlock(0,60);
    Level.wallArray[1] = new WallBlock(20,0);
    Level.wallArray[2] = new WallBlock(40,0);
    Level.wallArray[3] = new WallBlock(60,0);
    Level.wallArray[4] = new WallBlock(80,0);
    Level.wallArray[5] = new WallBlock(20,40);
    Level.wallArray[6] = new WallBlock(40,40);
    Level.wallArray[7] = new WallBlock(60,40);
    Level.wallArray[8] = new WallBlock(80,40);
    Level.wallArray[9] = new WallBlock(20,60);
    Level.wallArray[10] = new WallBlock(100,0);
    Level.wallArray[11] = new WallBlock(120,0);
    Level.wallArray[12] = new WallBlock(120,20);
    Level.wallArray[13] = new WallBlock(120,40);
  }
}