import java.util.Scanner;
public class Reversenumbers 
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
        for (int i =Leon.length-1; i >= 0; i--) 
        {
            System.out.print(Leon[i]+" ");
        }
    }
}
