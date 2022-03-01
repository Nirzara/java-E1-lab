package verify;

sealed interface P permits Verify {}

public final class Verify implements P {
  public static void main(String[] args) {
    System.out.println("Hello Java 17 World!");
  }
}
