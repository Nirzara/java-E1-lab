package control.structures;

public class UseSwitchStatement {
  public static void main(String[] args) {
    int x = (int)(Math.random() * 4);
    switch(x) {
      case 0:
        System.out.println("it's zero");
        break;
      case 1:
      case 2:
        System.out.println("it's one or two");
        break;
      default:
        System.out.println("it's something else");
        break;
    }
    System.out.println("moving to new form:");
    switch(x) {
      case 0 ->
        System.out.println("it's zero");
      case 1, 2 -> { // arrow form takes a SINGLE EXPRESSION/STATEMENT :)
        // a block is a single statement
        System.out.println("it's one or two");
        System.out.println("really it's one or two");
      }
      default ->
        System.out.println("it's something else");
    }
  }
}
