package lambda;

import java.util.ArrayList;
import java.util.List;

public class UseLambda {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(
        List.of("Fred", "Jim", "Alice", "Sheila")
    );

    System.out.println(names);
    // Comparator interface defines a single "abstract" function/method
    // that takes two arguments of the type to be ordered
    // and returns an int positive, negative, or zero, to indicate order
    // (a bit like subtraction)
    names.sort((n1, n2) -> n1.compareTo(n2));
    System.out.println(names);

    names.sort((n1, n2) -> Integer.compare(n1.length(), n2.length()));
    System.out.println(names);
  }
}
