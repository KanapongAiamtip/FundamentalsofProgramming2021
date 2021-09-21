import java.util.Scanner;
public class Sumthecolums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Leon [][] = new int[4][4];
        {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    Leon[i][j] = in.nextInt();
                }
            }
        }
        for (int i = 0; i < 4; i++){
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum += Leon[j][i];
            }
            System.out.print(sum+" ");
        } 
    }
}
