import java.util.Scanner;
public class Addxnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <input; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println(sum);
    }

}
