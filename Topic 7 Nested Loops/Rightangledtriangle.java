import java.util.Scanner;
public class Rightangledtriangle {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int Leon = in.nextInt();
        for (int i=1; i<=Leon; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
