import java.util.Scanner;
public class Numberremoval
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] Leon = new int[input.length];
        for (int counter = input.length - 1; counter >= 0; counter--)
        {
          Leon[counter] = Integer.parseInt(input[counter]);
        }
        for (int c1 = 1; c1 <= 20; c1++)
        {
          boolean control = true;
          for (int c2 = 0; c2 < Leon.length; c2++)
          {
            if (Leon[c2] == c1)
            {
              control = false;      
            }
          }
          if (control == true)
          {
            System.out.print(c1 + " ");
          }  
        }
    }
}
