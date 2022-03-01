package control.structures;

public class UseWhileLoop {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) { // must be boolean, in parens
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      x--;  // also look up and discover x++, --x, ++x
    }

    System.out.println("--- c style for loop ---");

    for (int y = 3; y > 0; y--) {
      System.out.println("y is " + y);
    }

//    for (;;) {
//      System.out.println("forever!");
//    }

    System.out.println("--- do while ---");
    int z = 0;
    do {
      System.out.println("in the loop, z is " + z);
    } while (z != 0);
  }
}
