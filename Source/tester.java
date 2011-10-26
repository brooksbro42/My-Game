public class tester {
  public static void main(String[] args) {
    Bicycle bicycle1 = new Bicycle(13,4);
    Bicycle bicycle2 = new Bicycle(15,6);
    System.out.println("Bicycle 1 "+ bicycle1.size);
    System.out.println("Bicycle 2 " + bicycle2.size);
    System.out.println(bicycle1.counter);
  }
}