import java.util.Scanner;

public class Square {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int Leon = in.nextInt();
    for (int i = 0; i < Leon; i++)
    {
      for (int j = 0; j < Leon; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
