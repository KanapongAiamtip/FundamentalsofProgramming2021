import java.util.Scanner;
public class Q5
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      String a = in.nextLine();
      String b = in.nextLine();
      if (a.length()==b.length())
      {
        System.out.println(true);
      }
      else
      {
        System.out.println(false);
      }
    }
}
