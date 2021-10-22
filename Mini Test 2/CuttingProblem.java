import java.util.Scanner;

public class CuttingProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int csnp = in.nextInt()+1;
        int Leon = in.nextInt()+1;
        for (int i = 0; i < Leon; i++) 
        {
            for (int j = 0; j <csnp; j++) 
            {
                System.out.print("+");
                if (j != csnp - 1) 
                {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
}
