import java.util.Scanner;
public class Lessthanlast 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] Leon = new int[input.length];
        for (int counter = input.length - 1; counter >= 0; counter--)
        {
            Leon[counter] = Integer.parseInt(input[counter]);
        }
        for (int ct = 0; ct <= Leon.length - 1; ct++)
        {
            if (Leon[ct] < Leon[Leon.length - 1])
            {
                System.out.print(Leon[ct] + " ");
            }
        }
    }
}
