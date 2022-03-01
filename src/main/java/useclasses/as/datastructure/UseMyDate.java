package useclasses.as.datastructure;

public class UseMyDate {
  public static void main(String[] args) {
    int myBirthDay = 14;
    int myBirthMonth = 10;
    int myBirthYear = 1983;

    System.out.println("days in month you were born: "
        + Date.daysInMonth(myBirthMonth, myBirthYear));

    System.out.println("you were born in a leap year? " +
        Date.isLeapYear(myBirthYear));


    System.out.println("today is day number " + Date.dayOfWeek(1, 3, 2022));
    System.out.println("next week is " + Date.asText(8, 3, 2022));

//    Date myBirth = new Date();
//    myBirth.day = 14;
//    myBirth.month = 10;
//    myBirth.year = 1983;

    Date myBirth = new Date(14, 10, 1983);

//    Date bad = new Date(-1, 43, 2000);
    Date bad = new Date(1, 1, 2000);
    System.out.println(Date.asText(bad));
//    bad.day = -1;

//    Date.setDayOfMonth(bad, -1);
//    Date.setDayOfMonth(bad, 10);
    bad.setDayOfMonth(10);
    System.out.println(Date.asText(bad));
    System.out.println(bad);

    Date h = new Holiday(1,1,2023, "New Year's Day");
    System.out.println(h);
    System.out.println(h.toString());
  }
}
