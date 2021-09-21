import java.util.Scanner;
public class Placeoneinzeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        int Leon [][] = new int[4][4];
        {
            for (int i = 0; i <4; i++) {
                for (int j = 0; j <4; j++) {
                    if(i==row-1 && j==column-1)
                    {
                        Leon[j][i] =1;
                    }
                }
            }
            for (int i=0 ; i<Leon.length ; i++)
            {
                for (int j=0 ; j<Leon[0].length ; j++)
                {
                    if(j==3)
                    {
                        System.out.print(Leon[i][j]);
                    }
                    else
                    {
                        System.out.print(Leon[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
