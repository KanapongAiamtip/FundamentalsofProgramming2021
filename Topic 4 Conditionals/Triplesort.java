import java.util.Scanner;
import java.util.Arrays;

public class Triplesort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }

    }
}
