import java.io.Console;

public class JayStarter {
  public static void main(String[] args) {
    Console input = System.console();

    System.out.println("What's your name?");
    String name = input.readLine();

    if (name.startsWith("J")) {
      System.out.println("Yeezus Yerman Yiants, this Yits name starts with a yay!");
    } else {
      System.out.println("Okay, I guess your name is reasonable enough...");
    }
  }
}
