import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=columns; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
