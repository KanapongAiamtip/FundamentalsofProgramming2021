import java.util.Scanner;
public class Magicrows
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int Leon[][] = new int[y][x];
        for (int i = 0 ; i<Leon.length ; i++)
        {
            for (int j = 0 ; j<Leon[0].length ; j++)
            {
                Leon[i][j] = in.nextInt();
            }
        }
        System.out.print(isRowMagic(Leon));
    }
    public static boolean isRowMagic(int[][] a){
        int sum = 0;
        boolean magic = false;
        for (int i = 0 ; i<a.length ; i++)
        {
            int value = 0;
            for (int j=0 ; j<a[0].length ; j++)
            {
                value+=a[i][j];
            }
            if (i==0) sum = value;
            if (sum==value)
            {
                magic=true;
            }
            else
            {
                magic=false;
                break;
            }         
        }
        return magic;
    }
}
