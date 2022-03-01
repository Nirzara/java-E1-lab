package functions;

public class DefineAndUseFunctions {

  // "full name" of this method is
  // function.DefineAndUseFunctions.add-int-int-int
  // Method "overloading" must differ by argument type-sequence
  // return type is irrelevant
  public static int add(int a, int b, int c) {
    return a + b + c;
  }


// java does NOT have named argument passing
// NOR default values
  public static int add(int a, int b) {
    if (a > 99) {
      System.out.println("That's big!");
      return a + b;
    }
    return b + a;
  }

  // variable length arg list, must be only one, and must be last
//  public static int add(int [] values) {
  public static int add(int ... values) {
    int sum = 0;
    for (int v : values) {
      sum += v;
    }
    return sum;
  }

  public static void main(String[] args) {
    int sum = add(199, 100);
    System.out.println(sum);

//    add(199, 100);// YES, can use a function for its side effects
    // only, and ignore the returned value

    System.out.println("Sum of 1 to 10 is "
        + add(new int[]{1,2,3,4,5,6,7,8,9,10}));

    // compiler builds array, but only if the arg is declared using ...
    System.out.println("Sum of 1 to 10 is "
        + add(1,2,3,4,5,6,7,8,9,10));
  }
}
