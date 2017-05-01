import java.io.Console;

public class LegalBooze {
  public static void main(String[] args){
    Console barbara = System.console();

    System.out.println("Good evening, how old are you?");
    String strNum = barbara.readLine();
    Integer age = Integer.parseInt(strNum);

    if (age >= 21) {
      System.out.println("Shit kid, get in here and have a drink!");
    } else {
      System.out.println("Get outta here kiddo, try Disneyland");
    }
  }
}
