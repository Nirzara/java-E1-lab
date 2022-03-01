package control.structures;

public class UseIf {
  public static void main(String[] args) {
    int x = (int)(Math.random() * 4);
    if (x > 2) {
      System.out.println("x is big");
      System.out.println("x is: " + x);
    } else if (x > 1) {
      System.out.println("x is bigish: " + x);
    } else {
      System.out.println("x is small");
    }

    String message = x > 1 ? "bigish" : "smallish";
    System.out.println(message);
  }
}
