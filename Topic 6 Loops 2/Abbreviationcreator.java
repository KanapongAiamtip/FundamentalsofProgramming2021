import java.util.Scanner;

public class Abbreviationcreator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = "";
    while (true) {
      String n = sc.nextLine();
      if (n.equals("END"))
      {
        break;
      }
      a += n.charAt(0);
    }
    System.out.println(a.toUpperCase());
  }
}
