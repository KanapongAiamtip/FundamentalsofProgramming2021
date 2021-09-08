import java.util.Scanner;

public class Reverselist {
  public static void main(String args[]) {
    Scanner in= new Scanner(System.in);
    String line = "";
    while (true) 
    {
      line += "," + in.nextLine();
      if (line.contains("*")) {
        break;
      }
    }
    String[] phuwin = line.split(",");
    for (int i = phuwin.length - 2; i >0; i--) 
    {
      System.out.println(phuwin[i]);
    }

  }
}
