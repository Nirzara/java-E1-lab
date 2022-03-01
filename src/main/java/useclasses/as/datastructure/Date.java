package useclasses.as.datastructure;

public class Date {
  // public -> accessible anywhere in this module, or perhaps
  // in explicitly documented other modules
  // OR if not using modules "anywhere in this JVM"
  // private -> accessible anywhere inside the enclosing TOP-LEVEL
  // curly braces. (NOT THE SAME as "anywhere in this class")
  // default (no word) -> accessible in the same package
  // protected -> MORE accessible than default (adds access in subclasses)
  private int day;
  private int month;
  private int year;

  // "constructor" is really "initializer"
  // the *pre-constructed* object is called "this"
  // if your code does not define *any* "constructor"
  // the compiler generates one with zero args
  public Date(int day, int month, int year) {
    if (!isValidDate(day, month, year)) {
      throw new IllegalArgumentException("bad date values");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

//  public static void setDayOfMonth(Date d, int day) {
  public static void setDayOfMonth(Date d, int day) {
    if (!isValidDate(day, d.month, d.year)) {
      throw new IllegalArgumentException("Bad day for month");
    }
    d.day = day;
  }

  // INSTANCE METHOD
  // since Java 6 we can be explicit about "this"
  // but we normally allow it to be implicit
//  public void setDayOfMonth(Date this, int day) {
  public void setDayOfMonth(int day) { // Date this IS PRESENT, simply implicit
    if (!isValidDate(day, this.month, this.year)) {
      throw new IllegalArgumentException("Bad day for month");
    }
    this.day = day;
  }

  public static void addDays(Date d, int count) {
    d.day += count; // NO NO NO NO!! validate
    // and wrap month/year as needed!!!
  }

  public static String asText(int day, int month, int year) {
    return "Date d=" + day + ", m=" + month + ", y=" + year;
  }

  public static String asText(Date d) {
    return asText(d.day, d.month, d.year);
  }

//  public String asText(Date this) {
//  public String asText() {
  public String toString() {
    System.out.println("Date.toString invoked!!!");
    return asText(this.day, this.month, this.year);
  }

  // Zeller's Congruence (Wikipedia)
  // 0 - Saturday, 6 - Friday
  public static int dayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5)
        + year + year / 4 - year / 100 + year / 400) % 7;

    // ERROR WAS HERE: this should have been "integer division"
    // not "remainder"
//        + year + year % 4 - year % 100 + year % 400) % 7;
  }

  public static int dayOfWeek(Date d) {
    // don't need Date. prefix/qualifier, because we're already
    // in that "scope"
    return /*Date.*/dayOfWeek(d.day, d.month, d.year);
  }

    public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static int daysInMonth(int month, int year) {
    return switch(month) {
      case 9, 4, 6, 11 -> 30;
      case 2 -> isLeapYear(year) ? 29 : 28;
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      default -> throw new IllegalArgumentException("Bad month");
    };
  }

  public static boolean isValidDate(int day, int month, int year) {
    return day > 0 && day <= daysInMonth(month, year)
        && month > 0 && month <= 12;
  }

  public static void main(String[] args) {
    System.out.println("(0) 1, 1, 2000 is " + dayOfWeek(1, 1, 2000));
    System.out.println("(4) 1, 3, 2000 is " + dayOfWeek(1, 3, 2000));
    System.out.println("(2) 1, 1, 1900 is " + dayOfWeek(1, 1, 1900));
    System.out.println("(3) 1, 3, 2022 is " + dayOfWeek(1, 3, 2022));
  }
}
