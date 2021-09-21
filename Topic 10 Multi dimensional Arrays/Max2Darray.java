import java.util.Scanner;
public class Max2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int Leon [][] = new int[row][column];
        {
            for (int i = 0; i <row; i++)
            {
                for (int j = 0; j<column; j++) 
                {
                   Leon[i][j] =  in.nextInt();
                }
            }
        }
        int max=Leon[0][0];
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<column; j++)
            {
                if(Leon[i][j]>max)
                {
                    max=Leon[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
