import java.io.Console;

public class GradeIt {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What grade did you get on your last test?");
    String grade = console.readLine();

    boolean a = grade.equals("A");
    boolean b = grade.equals("B");
    boolean c = grade.equals("C");
    boolean d = grade.equals("D");
    boolean f = grade.equals("F");
    if (a) {
      System.out.println("Fucking Fantastic!");
    } else if (b) {
      System.out.println("Pretty good, keeping Mom proud I bet.");
    } else if (c) {
      System.out.println("Rather average, you could work harder.");
    } else if (d) {
      System.out.println("This is not good enough. Try harder!");
    } else if (f) {
      System.out.println("Oh Billy, this is not okay. You need tutoring");
    } else {
      System.out.println("That's not even an appropriate answer. You ARE stupid!");
    }
  }
}
