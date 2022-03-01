package control.structures;

public class UseSwitchExpression {
  public static void main(String[] args) {
    int x = (int)(Math.random() * 4);

    var result = switch(x) { // it's an EXPRESSION because of context
      // this works with the colon form too! (but why)
      case 0 -> "it's zero";
      case 1, 2 -> "it's one or two";
      default -> "it's something else"; // switch expression must
      // "cover all the input possibilities"
    };
  }
}
