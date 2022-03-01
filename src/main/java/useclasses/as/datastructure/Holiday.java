package useclasses.as.datastructure;

// Holiday is a kind of Date that also has a name
public class Holiday extends Date {
  private String name;

  // MUST initialize the parent part of myself
  public Holiday(int day, int month, int year, String name) {
    super(day, month, year); // parent (aka "foundation") must be properly
    // intialized first!!!
    this.name = name;
  }

  @Override
  public String toString() {
    return super.toString() +  ", a holiday called " + name;
  }
}
