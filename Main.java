import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /* Gather user's name */
    log("Hello please tell me your name?");
    String name = scanner.nextLine();
    log("Hello " + name + ", it is nice to meet you.");

    /* Gather user's state */
    log("What state do you live in?");
    String state = scanner.nextLine();

    /* Gather user's age */
    log("How old are you?");
    int age = scanner.nextInt();

    /* Print a sentence with the user's input */
    log(name + ", I am also " + age + " and hear that " + state + " is beautiful!");

    /* Close scanner */
    scanner.close();
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}
