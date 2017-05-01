import java.io.Console;

public class Dooby {
  public static void main(String[] args) {
    Console keys = System.console();

    System.out.println("Pick a number and I'll tell ya if it is double digits");
    String strNum = keys.readLine();
    Integer userNum = Integer.parseInt(strNum);

    if (userNum > 9 && userNum < 100) {
      System.out.println("Holy spumoni, you picked a double digit number");
    } else if (userNum < 10) {
      System.out.println("Get that weak single digit shit outta here");
    } else if (userNum > 99) {
      System.out.println("Silly millenial always trying too hard. Pick a smaller number!");
    }
  }
}
