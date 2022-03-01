package many;

import java.util.Arrays;

public class UseArray {
  public static void main(String[] args) {
//    int [] ia = {9, 8, 7, 6};
    int [] ia = {9, 8, 7, 6,};

    // newly allocated objects (of all types) are definitely zeroed first
//    ia = new int[4]; // indexes always start a zero
    System.out.println("ia[0] is " + ia[0]);
    ia[1] = 99;
    System.out.println("ia[1] is " + ia[1]);
    System.out.println("ia is " + ia);
    System.out.println("ia is " + Arrays.toString(ia));
    // array length is fixed at initialization
    // (cannot delete items, or append new ones)
    System.out.println("ia.length is " + ia.length);

  }
}
