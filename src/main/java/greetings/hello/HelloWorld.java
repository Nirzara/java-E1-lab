package greetings.hello; // packages should be LOWER CASE

// BUT java.lang.* is always implicitly imported
//import java.lang.System; // always "fully qualified"
//import java.lang.*; // always "fully qualified"
import java.util.Scanner;

import static java.lang.System.out;

public class HelloWorld {
  public static void main(String[] args) {
//    java.lang.System.out.println("Hello World!");
    System.out.println("Hello World!");
    out.println("This too");

//    Scanner input = new Scanner(System.in);
//    String yourInput = input.nextLine();
//    out.println("you input: " + yourInput);

    // 8 "Primitive" types (mechanically different)
    // EVERYTHING ELSE is a "reference type"
    int x = 99;
    out.println("The value of x is " + x);

    // primitives are boolean byte short char (unsigned Unicode-16)
    // int (32 bit signed), long (64, signed), float, double
    // support ONLY "widening" conversions
    int y = 32;
    long z = 1234;
    z = y; // widening -- OK
//    y = z; // NOT OK!!
    y = (int)z; // risks becoming meaningless

//    boolean t = true;
//    int t = true; // NO not assignable
    int t = 10; // NO "truthy/falsy" concept

    if (t != 0) { // must be a boolean expression
      out.println("t is true");
    }

    // type of result is "larger of the two operands, but at least int
    // + - * / % -- remainder
    // comparisons
    // > >= < <= != ==
    // shifts
    // >> << >>>
    // "assignment operators"
    // = += -= ... // all have value (walrus operator :)

    int s = 10;
    out.println(s == t);

    String s1 = "Hello";
    String s2 = "He";  // Strings are "immutable"
    out.println(s1 == s2);
    s2 = s2.concat("llo");
    out.println("s2 after concat is " + s2);
    out.println("s1 == s2 after concat? " + (s1 == s2));
    s2 = s2.intern();
    out.println("s1 == s2 after intern? " + (s1 == s2));

    out.println("s1.equals(s2) after concat? " + (s1.equals(s2)));

    String s3 = "Hello";
    out.println("s1 == s3? " + (s1 == s3));

    // creates a NEW string representing the result of the operation
    s2 = s2.toUpperCase();
    out.println(s2);

    StringBuilder sb1 = new StringBuilder("Hello World");
    StringBuilder sb2 = new StringBuilder("Hello");

    out.println("sb1 is " + sb1);
    out.println("sb2 is " + sb2);
    sb2.append(" World");
    out.println("sb1 is " + sb1);
    out.println("sb2 is " + sb2);
    out.println("sb1 == sb2 " + (sb1 == sb2));
    out.println("sb1.equals(sb2) " + (sb1.equals(sb2)));


    long x1 = 99_000_000_000L;
    var x2 = "Hello"; // var "infers" the type
    // from the assignment. It MUST be initialized here!!!
//    x2 = 33;
    // type inference NOT dynamic type.
    // only for use with method local vars
    // frankly, it's kinda lazy
  }
}
