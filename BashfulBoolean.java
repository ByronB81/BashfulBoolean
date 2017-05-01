import java.io.Console;

public class BashfulBoolean {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("How old are you?");
    String strNum = console.readLine();
    Integer age = Integer.parseInt(strNum);

    if (age > 17){
      System.out.println("Welcome aboard, you are of age");
    } else {
      System.out.println("Try the San Rio store at the mall, kiddo!");
    }
  }
}
