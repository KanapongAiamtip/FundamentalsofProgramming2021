import java.util.Scanner;
public class Startfromthree
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    for (int x = 3;  x <= y ; ++x )
    {
      System.out.print(" -> " + x);
    }
  }
}
