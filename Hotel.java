import java.io.Console;

public class Hotel {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Pick a Season");
    String season = console.readLine();
    System.out.println("Weekday or Weekend?");
    String day = console.readLine();

    boolean summer = season.equals("Summer");
    boolean winter = season.equals("Winter");
    boolean spring = season.equals("Spring");
    boolean fall = season.equals("fall");
    boolean weekday = day.equals("Weekday");
    boolean weekend = day.equals("Weekend");

    System.out.println("chugging along");
    if (summer || spring) {
      System.out.print("Stay cool ");
    } else if (winter || fall) {
      System.out.print("Bundle up ");
    }

    if (weekday) {
      System.out.println("on your way to work!");
    } else if (weekend) {
      System.out.println("on your day off!");
    }
  }
}
