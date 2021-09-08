import java.util.Scanner;
public class Middleofthearray
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String input = "";
        while (true)
        {
            input += " " + in.nextLine();
            if (input.contains("*"))
            {
              break;
            }
        }
        String[] Leon = input.split(" ");
        for(int c = 0; c<Leon.length; c++)
        {
            if(c == Leon.length/2)
            {
                if(Leon.length%2 == 0)
                {
                  System.out.println(Leon[c-1]);
                }
                System.out.println(Leon[c]);
            }
        }
    }
}