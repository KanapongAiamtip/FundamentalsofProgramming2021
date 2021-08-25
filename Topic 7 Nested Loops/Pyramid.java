import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Leon = in.nextInt();
        for (int i=1; i<=Leon; i++) 
        { 
            // Print space in decreasing order 
            for (int j=Leon; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("$");
            }
            System.out.println();
        }

    }
}
