package many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class UseLists {

  public static void showAll(Collection<String> l) {
//    for (int idx = 0; idx < l.size(); idx++) // BAD!!!
    for (String s : l) {
      System.out.println("> " + s);
    }
  }

  public static void main(String[] args) {
    // LinkedList rarely best performance
    // ArrayList is usually preferred
//    ArrayList<String> al = new ArrayList(List.of(LocalDate.now()));
    List<String> al = new ArrayList<>();
    // Java does not permit "operator overloading"
    // other than for primitive numerics and String concat
    // so all list manipulation is with methods
    al.add("Hello");
    al.add("Bonjour");

    System.out.println(al.get(0));
    System.out.println("size of al is " + al.size());

//    al.add(new StringBuilder("Guten Tag"));
    al.add("Guten Tag");

    String itemThree = al.get(2);  // still has cast "under the hood"
//    Object itemThree = al.get(2);
    System.out.println("item three was a " + itemThree.getClass());
    System.out.println("item three was " + itemThree);

    showAll(al);

    List<String> names =
        new LinkedList<>(List.of("Fred", "Jim", "Sheila"));

    showAll(names);
  }
}
