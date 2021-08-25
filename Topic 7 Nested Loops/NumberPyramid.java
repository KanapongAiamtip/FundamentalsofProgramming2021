import java.util.Scanner;
public class NumberPyramid {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
      int Leon = in.nextInt();
      for (int i = 1; i <= Leon; i++)
      {
        for (int j = 1; j <= Leon - i; j++)
        {
          System.out.print(" ");
        }
        for (int k = i; k >= 1; k--)
        {
          System.out.print(k);          
        }
        for (int l = 2; l <= i; l++)
        {
          System.out.print(l);
        }
        System.out.println();
      }
    }
}
