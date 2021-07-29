import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      String a = in.nextLine();
      String b = in.nextLine();
      if (a.charAt(0)==b.charAt(0))
      {
        System.out.println(true);
      }
      else
      {
        System.out.println(false);
      }

    }
}
