import java.util.Scanner;
public class Uptofourteen
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    for (int a = b ; a <= 14 ; a++)
    {
      System.out.print(" -> " + a);
    }
  }
}
