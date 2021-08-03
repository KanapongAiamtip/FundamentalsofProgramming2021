import java.util.Scanner;
public class Horizontalcheckboxes 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String a = "+-+";
    String b = "| |";
    for (int i = 0; i < x; i++) 
    {
      System.out.print(a);
      if (i < x - 1) // less than one because space between athernextone
      {
        System.out.print(" ");
      }
    }
    System.out.println();// nextline for ||
    for (int i = 0; i < x; i++) 
    {
      System.out.print(b);
      if (i < x - 1) // less than one because space between athernnextone
      {
        System.out.print(" ");
      }
    }
    System.out.println();// nextline for +-+
    for (int i = 0; i < x; i++) 
    {
      System.out.print(a);
      if (i < x - 1) // less than one because space between athernnextone
      {
        System.out.print(" ");
      }
    }
  }
}