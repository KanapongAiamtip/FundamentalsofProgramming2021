import java.util.Scanner;

public class Squarepluscube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = (x * x) + (x * x * x);
        System.out.println(sum);
    }
}
